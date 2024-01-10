package com.javapb.startspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javapb.startspringboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{
	

}
