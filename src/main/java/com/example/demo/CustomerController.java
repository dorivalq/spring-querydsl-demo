package com.example.demo;

import com.example.demo.model.Customer;
import com.example.demo.model.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    @GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Customer> getAll() {
        String lastName = "Dorival";
        return repository.findByLastName(lastName);
    }

    @GetMapping(path = "/all-dsl", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Customer> getAllDsl(String lastName) {
        System.out.println("lastName = " + lastName);

        return repository.findPersonsByFirstnameQuerydsl(lastName);
    }

}
