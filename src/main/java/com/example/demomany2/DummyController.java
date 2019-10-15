package com.example.demomany2;

import com.example.demomany2.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

    @Autowired
    UserRepo userRepo;

    @GetMapping("/user/{id}")
    public ResponseEntity<?> getUser(@PathVariable Integer id){
        return new ResponseEntity<>(userRepo.findById("1234"), HttpStatus.OK);
    }
    @GetMapping("/users")
    public ResponseEntity<?> getUser1(){
        return new ResponseEntity<>(userRepo.findAll(), HttpStatus.OK);
    }
}
