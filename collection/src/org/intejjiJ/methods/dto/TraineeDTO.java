package org.intejjiJ.methods.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@ToString
@Setter
public class TraineeDTO implements Serializable,Comparable<TraineeDTO> {
    String name;
    int rollNumber;
    String branch;

    @Override
    public int compareTo(TraineeDTO o) {
        return this.branch.compareTo(o.branch);
    }
}


