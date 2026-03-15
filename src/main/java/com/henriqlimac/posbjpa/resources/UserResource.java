package com.henriqlimac.posbjpa.resources;

import com.henriqlimac.posbjpa.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Flavia", "flavia@gmail.com", "11987654321", "123");

        return ResponseEntity.ok().body(user);
    }
}
