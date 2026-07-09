package org.intejjiJ.methods.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor

public class PatientDTO implements Serializable,Comparable<PatientDTO> {
    private String name;
    private int age;

    @Override
    public int compareTo(PatientDTO o) {
        return this.name.compareTo(o.name);
    }
}
