package org.intejjiJ.map.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class HeroDTO implements Serializable {
    private String heroName;
    private int age;
}
