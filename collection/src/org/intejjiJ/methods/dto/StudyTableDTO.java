package org.intejjiJ.methods.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudyTableDTO implements Serializable, Comparable<StudyTableDTO> {
    String color;
    double price;
    String material;

    @Override
    public int compareTo(StudyTableDTO o) {
        StudyTableDTO left = this;
        StudyTableDTO right = o;
        if(left.price==right.price)
            return 0;
        else if(left.price>right.price)
            return 1;
        else return -1;
    }
}


