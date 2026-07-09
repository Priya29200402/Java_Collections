package org.intejjiJ.methods.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class MovieDTO implements Serializable,Comparable<MovieDTO> {
    private String name;
    private int rating;

    @Override
    public int compareTo(MovieDTO o) {
        return Integer.compare(this.rating, o.rating);
    }
}
