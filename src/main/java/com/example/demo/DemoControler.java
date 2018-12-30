package com.example.demo;

import com.example.demo.model.Customer;
import com.example.demo.model.repository.CustomerCustomRepository;
import com.example.demo.model.repository.impl.CustomerCustomRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoControler {

    @Autowired
//    @Qualifier("CustomerCustomRepositoryImpl")
    private CustomerCustomRepositoryImpl test;

    @GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Customer> getAll() {
//        return repository.findAll();
        String lastName = "Dorival";
        return test.findByLastName(lastName);
    }

    @GetMapping(path = "/all-dsl", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Customer> getAllDsl(String lastName) {
        System.out.println("lastName = " + lastName);

//        return test.findByLastName(lastName);
        return test.findPersonsByFirstnameQuerydsl("Jack");
    }

}
