package org.intejjiJ.terminal.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor

public class DiseaseDTO implements Serializable,Comparable<DiseaseDTO> {
    private int id;
    private String name;
    private String description;
    private String symptoms;
    private String cause;
    private String treatment;
    private String cure;
    private String prevention;
    private String etiology;

    @Override
    public int compareTo(DiseaseDTO o) {
        return 0;
    }
}
