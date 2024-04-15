package com.cryptogramming.auth.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping(value="/verify")
    public ResponseEntity verify() {
        System.out.println("Se verifico el token");
        return new ResponseEntity(HttpStatus.OK);
    }
}
