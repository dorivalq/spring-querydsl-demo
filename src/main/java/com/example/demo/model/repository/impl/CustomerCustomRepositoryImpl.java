package com.example.demo.model.repository.impl;

import com.example.demo.model.Customer;
import com.example.demo.model.QCustomer;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CustomerCustomRepositoryImpl{

    public List<Customer> find(){
        System.out.println();
        return null;
    }

    public List<Customer> findByLastName(String lastName) {
        System.out.println("lastName = " + lastName);

        return null;
    }

    @PersistenceContext
    EntityManager em;
    public List<Customer> findPersonsByFirstnameQuerydsl(String firstname) {
        JPAQuery query = new JPAQuery(em);
        QCustomer person = QCustomer.customer;
//        return query.from(person).where(person.firstName.eq(firstname)). list(person);
         query.from(person).where(person.firstName.eq(firstname));
        return query.fetch();
    }
}
