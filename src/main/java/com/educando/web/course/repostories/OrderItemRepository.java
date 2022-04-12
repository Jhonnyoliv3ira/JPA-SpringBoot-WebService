package com.educando.web.course.repostories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educando.web.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
