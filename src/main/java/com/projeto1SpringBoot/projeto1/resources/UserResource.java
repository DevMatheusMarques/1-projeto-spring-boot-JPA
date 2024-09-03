package com.projeto1SpringBoot.projeto1.resources;

import com.projeto1SpringBoot.projeto1.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1,"Matheus", "matheus@gmail.com", "18 981886018", "teste123");
        return ResponseEntity.ok().body(user);
    }
}
