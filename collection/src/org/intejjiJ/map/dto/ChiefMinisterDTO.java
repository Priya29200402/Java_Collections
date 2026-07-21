package org.intejjiJ.map.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class ChiefMinisterDTO implements Serializable {
    private String name;
    private int age;
}
