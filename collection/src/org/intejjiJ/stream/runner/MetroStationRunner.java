package org.intejjiJ.stream.runner;

import org.intejjiJ.stream.dto.MetroStationDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MetroStationRunner {
    public static void main(String[] args) {

        List<MetroStationDTO> list = new ArrayList<>();

        list.add(new MetroStationDTO("Majestic", 120000, 2.5, 4));
        list.add(new MetroStationDTO("Indiranagar", 50000, 6.0, 2));
        list.add(new MetroStationDTO("MG Road", 80000, 1.0, 3));
        list.add(new MetroStationDTO("Jayanagar", 45000, 8.0, 2));
        list.add(new MetroStationDTO("Whitefield", 95000, 18.0, 4));
        list.add(new MetroStationDTO("KR Puram", 70000, 12.0, 3));
        list.add(new MetroStationDTO("Cubbon Park", 30000, 0.5, 2));
        list.add(new MetroStationDTO("Banashankari", 55000, 9.0, 2));
        list.add(new MetroStationDTO("Rajajinagar", 60000, 5.0, 3));
        list.add(new MetroStationDTO("Yeshwanthpur", 85000, 7.0, 4));

        Collections.sort(list,
                (o1, o2) -> Integer.compare(o1.getDailyPassengers(),o2.getDailyPassengers()));

        System.out.println("=======After Sorting by Daily Passengers=======");

        list.forEach(station -> System.out.println(station));

        System.out.println();

        Collections.sort(list,
                (o1, o2) -> Double.compare(o1.getDistanceFromCityCenter(), o2.getDistanceFromCityCenter()));

        System.out.println("=======After Sorting by Distance=======");

        list.forEach(station -> System.out.println(station));

        System.out.println();

        Collections.sort(list,
                (o1, o2) -> Integer.compare(o1.getPlatforms(), o2.getPlatforms()));

        System.out.println("=======After Sorting by Platforms=======");

        list.forEach(station -> System.out.println(station));
    }
}
