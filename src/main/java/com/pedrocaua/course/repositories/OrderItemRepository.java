package com.pedrocaua.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrocaua.course.entities.OrderItem;
import com.pedrocaua.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}
