package com.example.accessing_data_jpa.service;

import com.example.accessing_data_jpa.entity.Customer;
import com.example.accessing_data_jpa.repository.CustomerRepository;
import model.CustomerModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<CustomerModel> getAllCustomers() {
        List<Customer> customers = (List<Customer>) customerRepository.findAll();

        return customers.stream()
                .map(CustomerModel::new)
                .collect(Collectors.toList());
    }
}
