package com.example.demo.model.repository;

import com.example.demo.model.Customer;

import java.util.List;

public interface CustomerCustomRepository{
    List<Customer> findByLastName(String lastName);
}
