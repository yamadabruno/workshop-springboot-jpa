package br.com.brunoyamada.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brunoyamada.project.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
