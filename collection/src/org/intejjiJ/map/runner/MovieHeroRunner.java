package org.intejjiJ.map.runner;

import org.intejjiJ.map.dto.HeroDTO;
import org.intejjiJ.map.dto.MovieDTO;

import java.util.HashMap;
import java.util.Map;

public class MovieHeroRunner {
    public static void main(String[] args) {
        Map<MovieDTO, HeroDTO> map = new HashMap<>();

        System.out.println("=====put() method=====");
        map.put(new MovieDTO("Yare Koogadali", "Kannada"), new HeroDTO("Puneeth Rajkumar", 45));
        map.put(new MovieDTO("Seeta Ramam", "Hindi"), new HeroDTO("Dulquer Salmaan", 46));
        map.put(new MovieDTO("Dangal", "Hindi"), new HeroDTO("Amir Khan", 49));
        map.put(new MovieDTO("Leo", "Tamil"), new HeroDTO("Vijay", 51));
        map.put(new MovieDTO("Jai Bhim", "Hindi"), new HeroDTO("Surya", 40));
        System.out.println("Size:" + map.size());


        System.out.println("\n===get() method===");
        MovieDTO searchKey = new MovieDTO("Dangal", "Hindi");
        HeroDTO hero = map.get(searchKey);
        System.out.println("Hero Name For Dangal:" + hero);


        System.out.println("\n====== containsKey() Method======");
        MovieDTO searchMovie=new MovieDTO("Seeta Ramam", "Hindi");
        System.out.println("Contains :" + map.containsKey(searchMovie));
        System.out.println("Contains KGF:" + map.containsKey(new MovieDTO("KGF", "Kannada")));


        System.out.println("\n======containsValue() Method=====");
        System.out.println("Contains Puneeth Rajkumar:" + map.containsValue(new HeroDTO("Puneeth Rajkumar", 45)));


        System.out.println("\n=====size() Method===");
        System.out.println("Map size:" + map.size());

        System.out.println("\n======isEmpty() Method=======");
        System.out.println("Check is map empty:" + map.isEmpty());


        System.out.println("\n======keySet() method=======");
        System.out.println("All keys:" + map.keySet());


        System.out.println("\n======values() Method======");
        System.out.println("All values:" + map.values());

        System.out.println("\n======= forEach() Method=======");
        map.forEach((movie, actor) -> System.out.println("Movie:" + movie.getMovieName() + "Hero:" + actor.getHeroName()));


        System.out.println("\n======== remove() method======");
        MovieDTO removeMovie = new MovieDTO("Leo", "Tamil");
        System.out.println("Removed:" + map.remove(removeMovie));
        System.out.println("Size after removing movie:" + map.size());


        System.out.println("\n======= replace() Method=======");
        MovieDTO replaceMovie = new MovieDTO("Jai Bhim", "Hindi");
        HeroDTO oldValue = map.replace(replaceMovie, new HeroDTO("Surya Sivakumar", 41));
        System.out.println("Old value:" + oldValue);
        System.out.println("New value:" + map.get(replaceMovie));


        System.out.println("\n===== putIfAbsent() method===");
        MovieDTO newMovie = new MovieDTO("Amaran", "Hindi");
        HeroDTO newHero = new HeroDTO("Sivakarthikeyan", 40);
        map.putIfAbsent(newMovie, newHero);
        System.out.println("Size after adding new movie:" + map.size());


        System.out.println("\n======= putAll() Method =======");
        Map<MovieDTO, HeroDTO> newMap = new HashMap<>();
        newMap.put(new MovieDTO("Kantara", "Kannada"), new HeroDTO("Rishabh Shetty", 38));
        newMap.put(new MovieDTO("Galipata", "Kannada"), new HeroDTO("Ganesh", 44));
        map.putAll(newMap);
        System.out.println("Size:" + map.size());


        System.out.println("\n=======computeIfAbsent() method=======");
        MovieDTO computeKey = new MovieDTO("Pushpa", "Telugu");
        map.computeIfAbsent(computeKey, k -> new HeroDTO("Allu Arjun", 40));
        System.out.println("Size after computed if absent:" + map.size());


        System.out.println("\n======= computeIfPresent() method======");
        MovieDTO existingKey = new MovieDTO("Dangal", "Hindi");
        map.computeIfPresent(existingKey, (movie, actor) -> new HeroDTO(actor.getHeroName(), actor.getAge() + 1));
        System.out.println("Updated age for Dangal actor:" + map.get(existingKey));


        System.out.println("\n====== clear() method======");
        System.out.println("Size before clear: " + map.size());
        map.clear();
        System.out.println("Size after clear: " + map.size());


        System.out.println("\n===Completed 16 Methods====");
    }
}
