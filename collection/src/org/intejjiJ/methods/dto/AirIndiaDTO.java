package org.intejjiJ.methods.dto;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class AirIndiaDTO implements Serializable {

    private String nameOfPassenger;
    private String headQuarter;
    private String location;
    private String status;
    private String flightNumber;
    private String source;
    private String destination;
    private LocalDate date;



}
