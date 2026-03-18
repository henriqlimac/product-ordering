package com.henriqlimac.posbjpa.repositories;

import com.henriqlimac.posbjpa.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
