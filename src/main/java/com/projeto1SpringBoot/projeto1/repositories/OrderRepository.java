package com.projeto1SpringBoot.projeto1.repositories;

import com.projeto1SpringBoot.projeto1.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
