package com.example.demo.model.repository;

import com.example.demo.model.Customer;

import java.util.List;

public interface CustomerCustomRepository{
    List<Customer> findByLastNameDsl(String lastName);

    public List<Customer> findPersonsByFirstnameQuerydsl(String firstname);
}
