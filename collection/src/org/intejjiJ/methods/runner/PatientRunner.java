package org.intejjiJ.methods.runner;

import org.intejjiJ.methods.dto.PatientDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PatientRunner {
    public static void main(String[] args) {

        List<PatientDTO> patients = new ArrayList<>();
        patients.add(new PatientDTO("John", 18));
        patients.add(new PatientDTO("Jane", 25));
        patients.add(new PatientDTO("Bob", 31));
        patients.add(new PatientDTO("Alice", 22));
        patients.add(new PatientDTO("Charlie", 29));
        patients.add(new PatientDTO("Daniel", 35));
        patients.add(new PatientDTO("aaniel", 35));

        Collections.sort(patients);
        patients.forEach(patient -> System.out.println(patient));
    }
}
