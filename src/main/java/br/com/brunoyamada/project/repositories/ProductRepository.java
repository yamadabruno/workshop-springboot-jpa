package br.com.brunoyamada.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brunoyamada.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
