package com.henriqlimac.posbjpa.repositories;

import com.henriqlimac.posbjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
