package com.projeto1SpringBoot.projeto1.repositories;

import com.projeto1SpringBoot.projeto1.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
