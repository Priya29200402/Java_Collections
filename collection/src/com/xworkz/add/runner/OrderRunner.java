package com.xworkz.add.runner;

import com.xworkz.add.dto.OrderDTO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class OrderRunner {
    public static void main(String[] args) {
        OrderDTO order1 = new OrderDTO(101, 1, LocalDate.of(2024, 1, 15), "Completed", 2500.50);
        OrderDTO order2 = new OrderDTO(102, 2, LocalDate.of(2024, 2, 20), "Pending", 1500.75);
        OrderDTO order3 = new OrderDTO(103, 3, LocalDate.of(2024, 3, 10), "Shipped", 3200.00);
        OrderDTO order4 = new OrderDTO(104, 4, LocalDate.of(2024, 4, 5), "Delivered", 890.25);
        OrderDTO order5 = new OrderDTO(105, 5, LocalDate.of(2024, 5, 12), "Cancelled", 4500.00);

        Collection<OrderDTO> orderDTOS = new ArrayList<>();
        orderDTOS.add(order1);
        orderDTOS.add(order2);
        orderDTOS.add(order3);
        orderDTOS.add(order4);
        orderDTOS.add(order5);

        Collection<OrderDTO> orderDTOS1 = new LinkedList<>();
        orderDTOS1.add(order1);
        orderDTOS1.add(order2);
        orderDTOS1.add(order3);
        orderDTOS1.add(order4);
        orderDTOS1.add(order5);

        System.out.println("Total orders in ArrayList:"+ orderDTOS.size());
        System.out.println("Total orders in LinkedList:"+ orderDTOS1.size());
    }
}
