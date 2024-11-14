package model;

import com.example.accessing_data_jpa.entity.Customer;

public class CustomerModel {

    public String firstName;
    public String lastName;

    public CustomerModel(Customer entity) {
        this.firstName = entity.getFirstName();
        this.lastName = entity.getLastName();
    }
}
