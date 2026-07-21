package org.intejjiJ.map.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@ToString


public class MovieDTO implements Serializable, Comparable<MovieDTO> {
    private String movieName;
    private String language;

    @Override
    public int compareTo(MovieDTO o) {
        return this.movieName.compareTo(o.movieName);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MovieDTO movieDTO = (MovieDTO) o;
        return Objects.equals(movieName, movieDTO.movieName) && Objects.equals(language, movieDTO.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieName, language);
    }
}
