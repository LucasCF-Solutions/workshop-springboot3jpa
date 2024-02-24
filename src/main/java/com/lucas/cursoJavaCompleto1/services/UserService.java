package com.lucas.cursoJavaCompleto1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.cursoJavaCompleto1.entities.User;
import com.lucas.cursoJavaCompleto1.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll(){
		return repository.findAll();
	}

}
