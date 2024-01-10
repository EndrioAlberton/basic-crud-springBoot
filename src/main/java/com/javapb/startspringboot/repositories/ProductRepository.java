package com.javapb.startspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javapb.startspringboot.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{
	

}
