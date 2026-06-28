package com.xworkz.add.runner;

import com.xworkz.add.dto.ShipmentDTO;
import java.time.LocalDate;
import java.util.*;

public class ShipmentRunner {
    public static void main(String[] args) {
        ShipmentDTO shipment1 = new ShipmentDTO(1, 101, "FedEx", "FDX123456789", LocalDate.of(2024, 2, 20));
        ShipmentDTO shipment2 = new ShipmentDTO(2, 102, "UPS", "UPS987654321", LocalDate.of(2024, 3, 25));
        ShipmentDTO shipment3 = new ShipmentDTO(3, 103, "DHL", "DHL456789123", LocalDate.of(2024, 4, 15));
        ShipmentDTO shipment4 = new ShipmentDTO(4, 104, "USPS", "USPS789123456", LocalDate.of(2024, 5, 10));
        ShipmentDTO shipment5 = new ShipmentDTO(5, 105, "BlueDart", "BLD321654987", LocalDate.of(2024, 6, 18));

        Collection<ShipmentDTO> shipmentDTOS = new ArrayList<>(15);
        shipmentDTOS.add(shipment1);
        shipmentDTOS.add(shipment2);
        shipmentDTOS.add(shipment3);
        shipmentDTOS.add(shipment4);
        shipmentDTOS.add(shipment5);

        Collection<ShipmentDTO> shipmentDTOS1 = new LinkedList<>();
        shipmentDTOS1.add(shipment1);
        shipmentDTOS1.add(shipment2);
        shipmentDTOS1.add(shipment3);
        shipmentDTOS1.add(shipment4);
        shipmentDTOS1.add(shipment5);

        Collection<ShipmentDTO> shipmentDTOS2 = new HashSet<>(12);
        shipmentDTOS2.add(shipment1);
        shipmentDTOS2.add(shipment2);

        Collection<ShipmentDTO> shipmentDTOS3 = new TreeSet<>();
        shipmentDTOS3.add(shipment1);
        shipmentDTOS3.add(shipment5);

        System.out.println("Total shipments in ArrayList:"+ shipmentDTOS.size());
        System.out.println("Total shipments in LinkedList:"+ shipmentDTOS1.size());
        System.out.println("Total shipments in HashSet:"+ shipmentDTOS2.size());
        System.out.println("Total shipments in TreeSet:"+ shipmentDTOS3.size());
    }
}
