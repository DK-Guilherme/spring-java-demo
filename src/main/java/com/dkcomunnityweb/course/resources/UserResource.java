package com.dkcomunnityweb.course.resources;

import com.dkcomunnityweb.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "maria", "maria@gmail.com", "9999999", "1234565");
        return ResponseEntity.ok().body(u);
    }

}
