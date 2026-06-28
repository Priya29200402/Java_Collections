package com.xworkz.add.runner;

import com.xworkz.add.dto.EmployeeDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class EmployeeRunner {
    public static void main(String[] args) {
        EmployeeDTO employee1 = new EmployeeDTO(1, "John Smith", "Engineering", "Software Engineer", 75000.00);
        EmployeeDTO employee2 = new EmployeeDTO(2, "Sarah Johnson", "Marketing", "Marketing Manager", 65000.00);
        EmployeeDTO employee3 = new EmployeeDTO(3, "Mike Williams", "Finance", "Financial Analyst", 60000.00);
        EmployeeDTO employee4 = new EmployeeDTO(4, "Emily Brown", "HR", "HR Specialist", 55000.00);
        EmployeeDTO employee5 = new EmployeeDTO(5, "David Davis", "Sales", "Sales Executive", 58000.00);

        Collection<EmployeeDTO> employeeDTOS = new ArrayList<>();
        employeeDTOS.add(employee1);
        employeeDTOS.add(employee2);
        employeeDTOS.add(employee3);
        employeeDTOS.add(employee4);
        employeeDTOS.add(employee5);

        Collection<EmployeeDTO> employeeDTOS1 = new LinkedList<>();
        employeeDTOS1.add(employee1);
        employeeDTOS1.add(employee2);
        employeeDTOS1.add(employee3);
        employeeDTOS1.add(employee4);
        employeeDTOS1.add(employee5);

        Collection<EmployeeDTO> employeeDTOS2=new HashSet<>();
        employeeDTOS2.add(employee1);
        employeeDTOS2.add(employee2);

        System.out.println("Total employees in ArrayList:"+ employeeDTOS.size());
        System.out.println("Total employees in LinkedList:"+ employeeDTOS1.size());
        System.out.println("Total employees in HashSet:"+ employeeDTOS2.size());
    }
}
