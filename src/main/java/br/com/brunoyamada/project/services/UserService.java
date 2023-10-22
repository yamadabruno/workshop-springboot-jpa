package br.com.brunoyamada.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.brunoyamada.project.entities.User;
import br.com.brunoyamada.project.repositories.UserRepository;

public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}

}
