package org.intejjiJ.methods.runner;

import org.intejjiJ.methods.dto.StudyTableDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudyTableRunner {
    public static void main(String[] args) {
        List<StudyTableDTO> studyTables = new ArrayList<>();
        studyTables.add(new StudyTableDTO("Brown", 150.0, "Wood"));
        studyTables.add(new StudyTableDTO("Black", 200.0, "Metal"));
        studyTables.add(new StudyTableDTO("White", 120.0, "Plastic"));
        studyTables.add(new StudyTableDTO("Red", 180.0, "Wood"));
        studyTables.add(new StudyTableDTO("Green", 180.0, "Wood"));

        Collections.sort(studyTables);
        studyTables.forEach(studyTableDTO -> System.out.println(studyTableDTO));

    }

}
