package com.lucas.cursoJavaCompleto1.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.lucas.cursoJavaCompleto1.entities.Order;

@Repository
public interface OrderRepository extends JpaRepositoryImplementation<Order, Long>{

}
