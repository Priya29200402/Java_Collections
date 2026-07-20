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

public class ChiefMinisterDTO implements Serializable {
    private String name;
    private int age;
}
