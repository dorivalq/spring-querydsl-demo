package com.example.demo.model.repository.impl;

import com.example.demo.model.Customer;
import com.example.demo.model.QCustomer;
import com.example.demo.model.repository.CustomerCustomRepository;
import com.querydsl.jpa.impl.JPAQuery;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerCustomRepository {
    @PersistenceContext
    EntityManager em;

    public List<Customer> findDsl() {
        System.out.println();
        throw new NotImplementedException();
    }

    public List<Customer> findByLastNameDsl(String lastName) {
        System.out.println("lastName = " + lastName);
        throw new NotImplementedException();
    }

    public List<Customer> findPersonsByFirstnameQuerydsl(String firstname) {

        JPAQuery<Customer> query = new JPAQuery<Customer>(em);
        QCustomer person = QCustomer.customer;
        query

                .from(person)
                .where(person.firstName.eq(firstname))
                .orderBy(person.firstName.asc())
        ;

        return query.fetch();
    }
}
