package br.com.users.us.controller;

import java.sql.Date;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.users.us.entity.Profile;
import br.com.users.us.entity.User;
import br.com.users.us.repository.UserRepository;

@RestController
@RequestMapping("/api/users")
@CrossOrigin
public class UserController {

	@Autowired
	private UserRepository _db;
	@Autowired
	private ProfileController _profcontroller;

	@GetMapping
	@ResponseBody
	public Iterable<User> findAll() {
		return _db.findAll();
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	public User findById(@PathVariable(value = "id") Long id) {
		return _db.getOne(id);
	}
	
	@PostMapping
	@ResponseBody
	@ResponseStatus(code = HttpStatus.CREATED)
	public User create(@RequestParam String nome,@RequestParam String email,
						@RequestParam String senha,
						@RequestParam Long profId, HttpServletResponse response) {
		Profile prof = _profcontroller.findById(profId);
		Date data_criacao = new Date(System.currentTimeMillis());
		
		if (prof != null) {
			User user = new User(nome, email, senha, data_criacao, prof);
			return _db.save(user);
		}
		else {
			return (User) ResponseEntity.status(HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping(path = "/{id}")
	@ResponseBody
	public void delete(@PathVariable(value = "id") Long id){
		Optional<User> user = _db.findById(id);
		if (user != null) {
			_db.deleteById(id);			
		}
	}
	
}
