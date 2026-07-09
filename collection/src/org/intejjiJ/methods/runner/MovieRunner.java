package org.intejjiJ.methods.runner;

import org.intejjiJ.methods.dto.MovieDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieRunner {
    public static void main(String[] args) {
        MovieDTO movie1 = new MovieDTO("Inception", 9);
        MovieDTO movie2 = new MovieDTO("The Dark Knight", 10);
        MovieDTO movie3 = new MovieDTO("Interstellar", 8);
        MovieDTO movie4 = new MovieDTO("The Matrix", 9);
        MovieDTO movie5 = new MovieDTO("Pulp Fiction", 10);

        List<MovieDTO> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);

        System.out.println("Movies sorting by rating");
        Collections.sort(movies);
        movies.forEach(movie -> System.out.println(movie));
    }
}
