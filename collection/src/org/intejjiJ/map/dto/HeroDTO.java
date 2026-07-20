package org.intejjiJ.map.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class HeroDTO implements Serializable {
    private String heroName;
    private int age;
}
