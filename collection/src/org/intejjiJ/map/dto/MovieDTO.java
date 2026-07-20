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

public class MovieDTO implements Serializable {
    private String movieName;
    private String language;

}
