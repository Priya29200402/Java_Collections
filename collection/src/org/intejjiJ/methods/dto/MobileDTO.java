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
public class MobileDTO implements Serializable,Comparable<MobileDTO> {
   private String brand;
   private int price;
   private String color;

    @Override
    public int compareTo(MobileDTO o) {
        return Integer.compare(this.price, o.price);
    }
}
