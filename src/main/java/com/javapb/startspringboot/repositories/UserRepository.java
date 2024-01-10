package com.javapb.startspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javapb.startspringboot.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{	

}
