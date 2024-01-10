package com.javapb.startspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javapb.startspringboot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long>{
	

}
