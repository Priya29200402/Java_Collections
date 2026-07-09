package org.intejjiJ.methods.runner;

import org.intejjiJ.methods.dto.TraineeDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TraineeRunner {
    public static void main(String[] args) {
        List<TraineeDTO> trainees = new ArrayList<>();
        trainees.add(new TraineeDTO("John", 1, "CS"));
        trainees.add(new TraineeDTO("Jane", 2, "IT"));
        trainees.add(new TraineeDTO("Bob", 3, "ME"));
        trainees.add(new TraineeDTO("Alice", 4, "CE"));
        trainees.add(new TraineeDTO("Charlie", 5, "EC"));
        trainees.add(new TraineeDTO("David", 6, "ME"));

        Collections.sort(trainees);
        trainees.forEach(traineeDTO -> System.out.println(traineeDTO));
    }
}
