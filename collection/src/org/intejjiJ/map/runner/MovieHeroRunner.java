package org.intejjiJ.map.runner;

import org.intejjiJ.map.dto.HeroDTO;
import org.intejjiJ.map.dto.MovieDTO;

import java.util.HashMap;
import java.util.Map;

public class MovieHeroRunner {
    public static void main(String[] args) {
        Map<MovieDTO, HeroDTO> map = new HashMap<>();

        map.put(new MovieDTO("Yare Koogadali", "Kannada"), new HeroDTO("Puneeth Rajkumar", 45));

        map.put(new MovieDTO("Seeta Ramam", "Hindi"), new HeroDTO("Dulquer Salmaan", 46));

        map.put(new MovieDTO("Dangal", "Hindi"), new HeroDTO("Amir Khan", 49));

        map.put(new MovieDTO("Leo", "Tamil"), new HeroDTO("Vijay", 51));

        map.put(new MovieDTO("Jai Bhim", "Hindi"), new HeroDTO("Surya", 40));

        System.out.println("Size : " + map.size());

        System.out.println("\nOnly Keys");
        System.out.println(map.keySet());

        System.out.println("\nOnly Values");
        System.out.println(map.values());
    }
}
