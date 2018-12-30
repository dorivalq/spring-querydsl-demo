package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoControler {
    @Autowired
    CustomerRepository repository;

    @GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Customer> getAll() {
        return repository.findAll();
    }
}
