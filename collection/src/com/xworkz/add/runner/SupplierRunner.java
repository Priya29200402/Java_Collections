package com.xworkz.add.runner;

import com.xworkz.add.dto.SupplierDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class SupplierRunner {
    public static void main(String[] args) {
        SupplierDTO supplier1 = new SupplierDTO(1, "TechSupply Inc", "123 Tech Park", "John Doe", 9876543210L);
        SupplierDTO supplier2 = new SupplierDTO(2, "OfficeGoods Ltd", "456 Business Ave", "Jane Smith", 8765432109L);
        SupplierDTO supplier3 = new SupplierDTO(3, "DisplayWorld", "789 Screen St", "Mike Johnson", 7654321098L);
        SupplierDTO supplier4 = new SupplierDTO(4, "AudioTech", "101 Sound Blvd", "Emily Brown", 6543210987L);
        SupplierDTO supplier5 = new SupplierDTO(5, "FurniturePlus", "202 Chair Lane", "David Wilson", 5432109876L);

        Collection<SupplierDTO> supplierDTOS = new ArrayList<>();
        supplierDTOS.add(supplier1);
        supplierDTOS.add(supplier2);
        supplierDTOS.add(supplier3);
        supplierDTOS.add(supplier4);
        supplierDTOS.add(supplier5);

        Collection<SupplierDTO> supplierDTOS1 = new LinkedList<>();
        supplierDTOS1.add(supplier1);
        supplierDTOS1.add(supplier2);
        supplierDTOS1.add(supplier3);
        supplierDTOS1.add(supplier4);
        supplierDTOS1.add(supplier5);

        Collection<SupplierDTO> supplierDTOS2 = new HashSet<>();
        supplierDTOS2.add(supplier1);
        supplierDTOS2.add(supplier2);

        System.out.println("Total suppliers in ArrayList:"+ supplierDTOS.size());
        System.out.println("Total suppliers in LinkedList:"+ supplierDTOS1.size());
        System.out.println("Total suppliers in HashSet:"+ supplierDTOS2.size());
    }
}
