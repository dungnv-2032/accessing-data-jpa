package com.example.accessing_data_jpa.repository;

import java.util.List;

import com.example.accessing_data_jpa.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    List<Customer> findByLastName(String lastName);

    Customer findById(long Id);
}
