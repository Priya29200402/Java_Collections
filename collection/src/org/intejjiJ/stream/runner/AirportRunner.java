package org.intejjiJ.stream.runner;

import org.intejjiJ.stream.dto.AirportDTO;

import java.util.ArrayList;
import java.util.List;

public class AirportRunner {
    public static void main(String[] args) {

        List<AirportDTO> airports = new ArrayList<>();

        airports.add(new AirportDTO("Kempegowda International Airport", 45000000));
        airports.add(new AirportDTO("Indira Gandhi International Airport", 70000000));
        airports.add(new AirportDTO("Chhatrapati Shivaji Airport", 50000000));
        airports.add(new AirportDTO("Rajiv Gandhi International Airport", 34000000));
        airports.add(new AirportDTO("Chennai International Airport", 22000000));
        airports.add(new AirportDTO("Cochin International Airport", 15000000));
        airports.add(new AirportDTO("Goa International Airport", 8000000));

        airports.stream()
                .sorted((a1, a2) -> Integer.compare(a1.getPassengerCapacity(), a2.getPassengerCapacity()))
                .forEach(airport -> System.out.println(airport));
    }
}
