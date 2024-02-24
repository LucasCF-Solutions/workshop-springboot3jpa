package com.lucas.cursoJavaCompleto1.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.lucas.cursoJavaCompleto1.entities.User;

public interface UserRepository extends JpaRepositoryImplementation<User, Long>{

}
