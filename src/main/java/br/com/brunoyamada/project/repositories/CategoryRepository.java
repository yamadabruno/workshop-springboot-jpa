package br.com.brunoyamada.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brunoyamada.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
