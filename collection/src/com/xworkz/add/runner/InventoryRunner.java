package com.xworkz.add.runner;

import com.xworkz.add.dto.InventoryDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class InventoryRunner {
    public static void main(String[] args) {
        InventoryDTO inventory1 = new InventoryDTO(1, "Laptop", 50, "Warehouse A", "TechSupply Inc");
        InventoryDTO inventory2 = new InventoryDTO(2, "Mouse", 200, "Warehouse B", "TechSupply Inc");
        InventoryDTO inventory3 = new InventoryDTO(3, "Keyboard", 150, "Warehouse A", "OfficeGoods Ltd");
        InventoryDTO inventory4 = new InventoryDTO(4, "Monitor", 75, "Warehouse C", "DisplayWorld");
        InventoryDTO inventory5 = new InventoryDTO(5, "Headphones", 100, "Warehouse B", "AudioTech");

        Collection<InventoryDTO> inventoryDTOS = new ArrayList<>();
        inventoryDTOS.add(inventory1);
        inventoryDTOS.add(inventory2);
        inventoryDTOS.add(inventory3);
        inventoryDTOS.add(inventory4);
        inventoryDTOS.add(inventory5);

        Collection<InventoryDTO> inventoryDTOS1 = new LinkedList<>();
        inventoryDTOS1.add(inventory1);
        inventoryDTOS1.add(inventory2);
        inventoryDTOS1.add(inventory3);
        inventoryDTOS1.add(inventory4);
        inventoryDTOS1.add(inventory5);

        Collection<InventoryDTO> inventoryDTOS2 = new HashSet<>();
        inventoryDTOS2.add(inventory1);
        inventoryDTOS2.add(inventory2);
        inventoryDTOS2.add(inventory3);

        System.out.println("Total inventory in ArrayList:"+ inventoryDTOS.size());
        System.out.println("Total inventory in LinkedList:"+ inventoryDTOS1.size());
        System.out.println("Total inventory in HashSet:"+ inventoryDTOS2.size());
    }
}
