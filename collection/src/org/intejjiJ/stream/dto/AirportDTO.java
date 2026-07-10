package org.intejjiJ.stream.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class AirportDTO {
    private String airportName;
    private int passengerCapacity;
}

