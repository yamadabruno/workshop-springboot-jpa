package br.com.brunoyamada.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brunoyamada.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
