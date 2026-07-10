package org.intejjiJ.stream.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Comparator;

@Getter
@Setter
@ToString
@AllArgsConstructor

public class MetroStationDTO implements Serializable {

    private String stationName;
    private int dailyPassengers;
    private double distanceFromCityCenter;
    private int platforms;
}
