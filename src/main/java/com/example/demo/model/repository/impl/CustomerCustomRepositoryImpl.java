package com.example.demo.model.repository.impl;

import com.example.demo.model.Customer;
import com.example.demo.model.repository.CustomerCustomRepository;

import java.util.List;

public class CustomerCustomRepositoryImpl implements CustomerCustomRepository {

    public List<Customer> find(){
        System.out.println();
        return null;
    }

    @Override
    public List<Customer> findByLastName(String lastName) {
        System.out.println("lastName = " + lastName);

        return null;
    }
}
