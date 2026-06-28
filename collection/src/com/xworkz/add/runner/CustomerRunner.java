package com.xworkz.add.runner;

import com.xworkz.add.dto.CustomerDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class CustomerRunner {
    public static void main(String[] args) {
        CustomerDTO customer1 = new CustomerDTO(1, "Alice Smith", "alice.smith@example.com", 1234567890L, "123 Main St");
        CustomerDTO customer2 = new CustomerDTO(2, "Bob Johnson", "bob.johnson@example.com", 9876543210L, "456 Oak Ave");
        CustomerDTO customer3 = new CustomerDTO(3, "Charlie Brown", "charlie.brown@example.com", 5551234567L, "789 Pine Ln");
        CustomerDTO customer4 = new CustomerDTO(4, "Diana Prince", "diana.prince@example.com", 1122334455L, "101 Elm Rd");
        CustomerDTO customer5 = new CustomerDTO(5, "Eve Adams", "eve.adams@example.com", 9988776655L, "202 Birch Blvd");

        Collection<CustomerDTO> customerDTOS = new ArrayList<>();
        customerDTOS.add(customer1);
        customerDTOS.add(customer2);
        customerDTOS.add(customer3);
        customerDTOS.add(customer4);
        customerDTOS.add(customer5);

        Collection<CustomerDTO> customerDTOS1 = new LinkedList<>();
        customerDTOS1.add(customer1);
        customerDTOS1.add(customer2);

        System.out.println("Total customers in ArrayList:" + customerDTOS.size());
        System.out.println("Total customers in LinkedList:" + customerDTOS1.size());

    }
}
