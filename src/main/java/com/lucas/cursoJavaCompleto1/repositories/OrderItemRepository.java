package com.lucas.cursoJavaCompleto1.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.lucas.cursoJavaCompleto1.entities.OrderItem;
import com.lucas.cursoJavaCompleto1.entities.pk.OrderItemPK;

@Repository
public interface OrderItemRepository extends JpaRepositoryImplementation<OrderItem, OrderItemPK>{

}
