package com.example.demo;

import com.example.demo.model.Customer;
import com.example.demo.model.repository.CustomerCustomRepository;
import com.example.demo.model.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoControler {

    @Autowired
    CustomerRepository repository;

    @Autowired
    private CustomerCustomRepository customerCustomRepository;

    @GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Customer> getAll() {
        return repository.findAll();
    }

    @GetMapping(path = "/all-dsl", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Customer> getAllDsl(String lastName) {
        System.out.println("lastName = " + lastName);

        return customerCustomRepository.findByLastName(lastName);
    }

}
