package br.com.users.us.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.users.us.entity.Machine;
import br.com.users.us.repository.MachineRepository;

@RestController
@RequestMapping("/api/machine")
@CrossOrigin
public class MachineController {
	
	@Autowired
	private MachineRepository _db;

	
	@GetMapping
	@ResponseBody
	public Iterable<Machine> findAll() {
		return _db.findAll();
	}
	
	@PostMapping
	@ResponseBody
	public Machine create(@RequestParam String descricao ,@RequestParam String cod) {	
		Machine machine = new Machine(descricao, cod);
		return _db.save(machine);
	}
	
	@DeleteMapping("/{id}")
	@ResponseBody
	public void delete(@PathVariable(value = "id") Long id){
		Optional<Machine> machine = _db.findById(id);
		if (machine != null) {
			_db.deleteById(id);			
		}
	}

}
