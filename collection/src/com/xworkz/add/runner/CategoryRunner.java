package com.xworkz.add.runner;

import com.xworkz.add.dto.CategoryDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class CategoryRunner {
    public static void main(String[] args) {
        CategoryDTO category1 = new CategoryDTO(1, "Electronics", "Electronic devices and accessories", 0, "Active");
        CategoryDTO category2 = new CategoryDTO(2, "Computers", "Laptops, desktops and components", 1, "Active");
        CategoryDTO category3 = new CategoryDTO(3, "Mobile Phones", "Smartphones and accessories", 1, "Active");
        CategoryDTO category4 = new CategoryDTO(4, "Furniture", "Office and home furniture", 0, "Active");
        CategoryDTO category5 = new CategoryDTO(5, "Office Supplies", "Stationery and office essentials", 0, "Active");

        Collection<CategoryDTO> categoryDTOS = new ArrayList<>();
        categoryDTOS.add(category1);
        categoryDTOS.add(category2);
        categoryDTOS.add(category3);
        categoryDTOS.add(category4);
        categoryDTOS.add(category5);

        Collection<CategoryDTO> categoryDTOS1 = new LinkedList<>();
        categoryDTOS1.add(category1);
        categoryDTOS1.add(category2);
        categoryDTOS1.add(category3);
        categoryDTOS1.add(category4);
        categoryDTOS1.add(category5);

        Collection<CategoryDTO> categoryDTOS2 = new HashSet<>();
        categoryDTOS2.add(category1);
        categoryDTOS2.add(category2);

        System.out.println("Total categories in ArrayList:"+ categoryDTOS.size());
        System.out.println("Total categories in LinkedList:"+ categoryDTOS1.size());
        System.out.println("Total categories in HashSet:"+ categoryDTOS2.size());
    }
}
