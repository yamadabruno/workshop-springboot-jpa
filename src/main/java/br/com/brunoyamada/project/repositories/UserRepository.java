package br.com.brunoyamada.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brunoyamada.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
