package com.henriqlimac.posbjpa.repositories;

import com.henriqlimac.posbjpa.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
