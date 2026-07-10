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

public class MetroStationDTO implements Serializable, Comparator<MetroStationDTO> {

    private String stationName;
    private int dailyPassengers;
    private double distanceFromCityCenter;
    private int platforms;

    @Override
    public int compare(MetroStationDTO o1, MetroStationDTO o2) {
        return 0;
    }
}
