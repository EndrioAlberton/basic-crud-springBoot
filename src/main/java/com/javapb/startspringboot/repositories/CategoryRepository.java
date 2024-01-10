package com.javapb.startspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javapb.startspringboot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long>{
	

}
