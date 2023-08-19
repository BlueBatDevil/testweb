package com.example.testweb.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.testweb.models.User;


public interface UserRepository extends CrudRepository<User, Long>{
    
}
