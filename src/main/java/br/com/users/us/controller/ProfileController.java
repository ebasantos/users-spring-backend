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

import br.com.users.us.entity.Profile;
import br.com.users.us.repository.ProfileRepository;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {
	
	@Autowired
	private ProfileRepository _db;

    @GetMapping
	@ResponseBody
	public Iterable<Profile> findAll() {
		return _db.findAll();
	}

	@GetMapping("/{id}")
	@ResponseBody
	public Profile findById(@PathVariable(value = "id") Long id) {
        return _db.getOne(id);
	}
	
	@PostMapping
	public Profile create(@RequestParam String nome) {
		Profile profile = new Profile(nome);
		return _db.save(profile);
		 
	}

	@DeleteMapping(path = "/{id}")
	@ResponseBody
	public void deleteById(@PathVariable(value = "id") Long id) {
		Optional<Profile> prof = _db.findById(id);
		if ( prof != null ) {
			_db.deleteById(id);
			
		}
	}
	
	@DeleteMapping(path = "/deleteAll")
	@ResponseBody
	public void delete() {
		_db.deleteAll();
	}

}
