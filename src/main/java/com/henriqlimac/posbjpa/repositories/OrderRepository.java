package com.henriqlimac.posbjpa.repositories;

import com.henriqlimac.posbjpa.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
