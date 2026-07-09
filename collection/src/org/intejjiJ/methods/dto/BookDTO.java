package org.intejjiJ.methods.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
@ToString


public class BookDTO implements Serializable,Comparable<BookDTO> {
    private String name;
    private int price;

    @Override
    public int compareTo(BookDTO o) {
        return Integer.compare(this.price, o.price);
    }
}
