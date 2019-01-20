package com.example.demo;

import com.example.demo.model.Customer;
import com.example.demo.model.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    @GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Customer> getAll() {
        return repository.findAll();
    }

    @GetMapping(path = "/all-dsl", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Customer> getAllDsl(String firstName) {
        log.info("Finding firstName: " + firstName);

        return repository.findPersonsByFirstnameQuerydsl(firstName);
    }

}
