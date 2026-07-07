package in.xworkz.stream.runner;

import in.xworkz.stream.dto.WarDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class WarRunner {
    public static void main(String[] args) {
        List<WarDTO> warList = new LinkedList<>();
        warList.add(new WarDTO("World War I", LocalDate.of(1914, 7, 28), LocalDate.of(1918, 11, 11),
                "Europe", Arrays.asList("Germany", "France", "United Kingdom", "Russia"), 17000000, "Victory", 1567, "General Haig", "Territorial dispute"));

        warList.add(new WarDTO("World War II", LocalDate.of(1939, 9, 1), LocalDate.of(1945, 9, 2), "Europe",
                               Arrays.asList("Germany", "USA", "United Kingdom", "USSR"), 70000000, "Victory", 2192, "General Eisenhower", "Expansionism"));

        warList.add(new WarDTO("Kargil War", LocalDate.of(1999, 5, 3), LocalDate.of(1999, 7, 26), "Asia",
                              Arrays.asList("India", "Pakistan"), 30000, "Victory", 85, "General Malik", "Territorial dispute"));

        warList.add(new WarDTO("Vietnam War", LocalDate.of(1955, 11, 1), LocalDate.of(1975, 4, 30), "Asia",
                              Arrays.asList("Vietnam", "USA"), 2000000, "Defeat", 7119, "General Westmoreland", "Ideological conflict"));

        warList.add(new WarDTO("Napoleonic Wars", LocalDate.of(1803, 5, 18), LocalDate.of(1815, 11, 20), "Europe",
                               Arrays.asList("France", "Britain", "Austria"), 3500000, "Defeat", 4569, "Napoleon", "Political domination"));

        warList.add(new WarDTO("Gulf War", LocalDate.of(1990, 8, 2), LocalDate.of(1991, 2, 28), "Middle East",
                              Arrays.asList("Iraq", "USA", "Saudi Arabia"), 50000, "Victory", 210, "General Schwarzkopf", "Territorial dispute"));

        warList.add(new WarDTO("Winter War", LocalDate.of(1939, 11, 30), LocalDate.of(1940, 3, 13), "Europe",
                              Arrays.asList("Finland", "USSR"), 150000, "Victory", 105, "General Mannerheim", "Territorial dispute"));

        warList.add(new WarDTO("Indo-China War", LocalDate.of(1962, 10, 20), LocalDate.of(1962, 11, 21), "Asia",
                              Arrays.asList("India", "China"), 12000, "Defeat", 32, "General Kaul", "Border conflict"));

        warList.add(new WarDTO("War of 1812", LocalDate.of(1812, 6, 18), LocalDate.of(1815, 2, 18), "North America",
                             Arrays.asList("USA", "Britain"), 25000, "Victory", 975, "General Jackson", "Trade restrictions"));

        warList.add(new WarDTO("Waterloo Campaign", LocalDate.of(1815, 6, 15), LocalDate.of(1815, 7, 8), "Europe",
                           Arrays.asList("France", "Britain"), 65000, "Defeat", 23, "Napoleon", "Political domination"));

        System.out.println("=============Wars Name start with W =============");
        warList.stream()
                .filter(war -> war.getWarName().startsWith("W"))
                .forEach(warDTO -> System.out.println(warDTO.getWarName()));

        System.out.println("======Filtering wars by location (e.g., wars fought in Europe)======");
        warList.stream()
                .filter(war -> war.getLocation().equals("Europe"))
                .forEach(warDTO -> System.out.println(warDTO.getWarName()));

        System.out.println("======wars with outcome Victory======");
        warList.stream()
                .filter(war -> war.getOutcome().equals("Victory"))
                .forEach(warDTO -> System.out.println(warDTO.getWarName()));

        System.out.println("======wars commanded by Napoleon======");
        warList.stream()
                .filter(war -> war.getCommander().equals("Napoleon"))
                .forEach(warDTO -> System.out.println(warDTO.getWarName()));

        System.out.println("=======wars caused by \"Territorial dispute\"======");
        warList.stream()
                .filter(war -> war.getReason().equals("Territorial dispute"))
                .forEach(warDTO -> System.out.println(warDTO.getWarName()));

        System.out.println("========wars that started after a specific date (e.g., after 1900)========");
        warList.stream()
                .filter(war -> war.getStartDate().isAfter(LocalDate.of(1900, 1, 1)))
                .forEach(warDTO -> System.out.println(warDTO.getWarName()));

        System.out.println("=======wars that ended before a specific date (e.g., before 1800)========");
        warList.stream()
                .filter(war -> war.getEndDate().isBefore(LocalDate.of(1800, 1, 1)))
                .forEach(warDTO -> System.out.println(warDTO.getWarName()));

        System.out.println("========wars that occurred in a specific century (e.g., 20th century)=========");
        warList.stream()
                .filter(war -> war.getStartDate().getYear() >= 1901 && war.getStartDate().getYear() <= 2000)
                .forEach(warDTO -> System.out.println(warDTO.getWarName()));

        System.out.println("===========wars with duration greater than X days (e.g., > 284 days)===========");
        warList.stream()
                .filter(war -> war.getDurationDays() > 284)
                .forEach(warDTO -> System.out.println(warDTO.getWarName()));

        System.out.println("========wars with duration less than X days (e.g., < 30 days)=========");
        warList.stream()
                .filter(war -> war.getDurationDays() < 30)
                .forEach(warDTO -> System.out.println(warDTO.getWarName()));

        System.out.println("======wars with casualties greater than a threshold (e.g., > 100,000)===========");
        warList.stream()
                .filter(war -> war.getCasualties() > 100000)
                .forEach(warDTO -> System.out.println(warDTO.getWarName()));

        System.out.println("============wars with casualties less than a threshold (e.g., < 10,000)===========");
        warList.stream()
                .filter(war -> war.getCasualties() < 10000)
                .forEach(warDTO -> System.out.println(warDTO.getWarName()));

        System.out.println("========wars with casualties in a specific range (e.g., 50,000-500,000)=======");
        warList.stream()
                .filter(war -> war.getCasualties() >= 50000 && war.getCasualties() <= 500000)
                .forEach(warDTO -> System.out.println(warDTO.getWarName()));

        System.out.println("==========wars with duration divisible by a number (e.g., duration % 7 == 0)=========");
        warList.stream()
                .filter(war -> war.getDurationDays() % 7 == 0)
                .forEach(warDTO -> System.out.println(warDTO.getWarName()));

        System.out.println("========wars involving specific countries (e.g., wars involving \"India\")==========");
        warList.stream()
                .filter(war -> war.getCountriesInvolved().contains("India"))
                .forEach(warDTO -> System.out.println(warDTO.getWarName()));

        System.out.println("=========wars involving more than X countries (e.g., > 3 countries)==========");
        warList.stream()
                .filter(war -> war.getCountriesInvolved().size() > 3)
                .forEach(warDTO -> System.out.println(warDTO.getWarName()));

        System.out.println("=========wars involving exactly X countries (e.g., exactly 2 countries)========");
        warList.stream()
                .filter(war -> war.getCountriesInvolved().size() == 2)
                .forEach(warDTO -> System.out.println(warDTO.getWarName()));

        System.out.println("=======wars with multiple conditions (e.g., casualties > 50,000 AND duration > 100 days)=======");
        warList.stream()
                .filter(war -> war.getCasualties() > 50000 && war.getDurationDays() > 100)
                .forEach(warDTO -> System.out.println(warDTO.getWarName()));

        System.out.println("===========wars where commander name contains a substring (e.g., contains \"Gen\")=========");
        warList.stream()
                .filter(war -> war.getCommander().contains("Gen"))
                .forEach(warDTO -> System.out.println(warDTO.getWarName()));

        System.out.println("==========wars by combined criteria (e.g., location = \"Asia\" AND outcome = \"Victory\" AND casualties > 10,000)===========");
        warList.stream()
                .filter(war -> war.getLocation().equals("Asia") && war.getOutcome().equals("Victory") && war.getCasualties() > 10000)
                .forEach(warDTO -> System.out.println(warDTO.getWarName()));
    }

}
