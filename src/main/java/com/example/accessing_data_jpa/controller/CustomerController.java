package com.example.accessing_data_jpa.controller;

import com.example.accessing_data_jpa.service.CustomerService;
import model.CustomerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController  // @RestController dùng cho API, còn return View HTML thì dùng @Controller
@RequestMapping("/")
public class CustomerController {
    @Autowired
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/")
    public String hello() {
        return "hello";
    }

    @GetMapping("/customer")
    // Trả về Model là một List<CustomerModel>
    public List<CustomerModel> getCustomerList() {
        // Service trả về Model (là List<UserModel>) nên có thể return thẳng luôn
        return customerService.getAllCustomers();
    }
}
