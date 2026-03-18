package com.henriqlimac.posbjpa.repositories;

import com.henriqlimac.posbjpa.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
