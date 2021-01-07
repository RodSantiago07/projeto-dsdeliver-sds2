package com.auladevsuperior.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auladevsuperior.dsdeliver.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	

}
