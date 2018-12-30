package com.example.demo.model.repository;

import com.example.demo.model.Customer;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>, CustomerCustomRepository, QuerydslPredicateExecutor<Customer> {

}
