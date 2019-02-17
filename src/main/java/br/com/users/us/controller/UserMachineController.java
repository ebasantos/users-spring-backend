package br.com.users.us.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.users.us.entity.UserMachine;
import br.com.users.us.repository.UserMachineRepository;

@RestController
@RequestMapping(path="/usersmachines")
public class UserMachineController {
	
	@Autowired
	private UserMachineRepository _db;

	@GetMapping
	@ResponseBody
	public Iterable<UserMachine> findAll() {
		return _db.findAll();
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	public Optional<UserMachine> findById(@PathVariable(value = "id") Long id ) {
		return _db.findById(id);
	}
	
	@PostMapping("/new")
	@ResponseBody
	public UserMachine create(@RequestParam Long idU ,@RequestParam Long idM) {	
		UserMachine machineuse = new UserMachine(idU, idM);
		return machineuse;
	}
	
	@DeleteMapping(path = "/delete/{id}")
	@ResponseBody
	public void delete(@PathVariable(value = "id") Long id){
		Optional<UserMachine> machineuse = _db.findById(id);
		
		if (machineuse != null) {
			_db.deleteById(id);			
		}
	}


}
