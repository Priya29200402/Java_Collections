package org.intejjiJ.map.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class StateDTO implements Serializable {
    private String stateName;
    private int population;
}
