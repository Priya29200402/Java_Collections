package com.xworkz.add.runner;

import com.xworkz.add.dto.DiscountDTO;
import java.time.LocalDate;
import java.util.*;

public class DiscountRunner {
    public static void main(String[] args) {
        DiscountDTO discount1 = new DiscountDTO(1, "SAVE10", "10% off on all items", 10.0, LocalDate.of(2024, 12, 31));
        DiscountDTO discount2 = new DiscountDTO(2, "SUMMER20", "20% summer sale", 20.0, LocalDate.of(2024, 8, 31));
        DiscountDTO discount3 = new DiscountDTO(3, "NEWUSER15", "15% for new customers", 15.0, LocalDate.of(2024, 6, 30));
        DiscountDTO discount4 = new DiscountDTO(4, "FLASH25", "25% flash sale", 25.0, LocalDate.of(2024, 7, 15));
        DiscountDTO discount5 = new DiscountDTO(5, "LOYALTY30", "30% for loyal customers", 30.0, LocalDate.of(2024, 12, 25));

        Collection<DiscountDTO> discountDTOS = new ArrayList<>(15);
        discountDTOS.add(discount1);
        discountDTOS.add(discount2);
        discountDTOS.add(discount3);
        discountDTOS.add(discount4);
        discountDTOS.add(discount5);

        Collection<DiscountDTO> discountDTOS1 = new LinkedList<>();
        discountDTOS1.add(discount1);
        discountDTOS1.add(discount2);
        discountDTOS1.add(discount3);
        discountDTOS1.add(discount4);
        discountDTOS1.add(discount5);

        Collection<DiscountDTO> discountDTOS2 = new HashSet<>(12);
        discountDTOS2.add(discount1);
        discountDTOS2.add(discount2);

        Collection<DiscountDTO> discountDTOS3 = new TreeSet<>();
        discountDTOS3.add(discount1);
        discountDTOS3.add(discount5);

        System.out.println("Total discounts in ArrayList:"+ discountDTOS.size());
        System.out.println("Total discounts in LinkedList:"+ discountDTOS1.size());
        System.out.println("Total discounts in HashSet:"+ discountDTOS2.size());
        System.out.println("Total discounts in TreeSet:"+ discountDTOS3.size());
    }
}
