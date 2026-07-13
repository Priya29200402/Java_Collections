package org.intejjiJ.terminal.runner;

import org.intejjiJ.terminal.dto.DiseaseDTO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DiseaseRunner {
    public static void main(String[] args) {
        List<DiseaseDTO> diseases = new ArrayList<>();
        diseases.add(new DiseaseDTO(1, "Covid-19", "Corona Virus", "Fever, Cough, Cold", "Virus", "Antibiotics", "Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(2, "Malaria", "Plasmodium", "Fever, Chills, Sweating", "Parasite", "Antimalarial drugs", "Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(3, "Dengue", "Dengue Virus", "Fever, Headache, Joint Pain", "Virus", "Supportive care", "Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(4, "Tuberculosis", "Mycobacterium tuberculosis", "Cough, Fever, Weight Loss", "Bacteria", "Antibiotics", "Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(5, "HIV/AIDS", "Human Immunodeficiency Virus", "Fever, Fatigue, Weight Loss", "Virus", "Antiretroviral therapy", "No Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(6, "Influenza", "Influenza Virus", "Fever, Cough, Sore Throat", "Virus", "Antiviral drugs", "Vaccine", "Prevention", "Etiology"));
        diseases.add(new DiseaseDTO(7, "Hepatitis B", "Hepatitis B Virus", "Fever, Fatigue, Jaundice", "Virus", "Antiviral drugs", "Vaccine", "Prevention", "Etiology"));

        System.out.println("Filter names longer than 5 characters");
        diseases.stream()
                .filter(disease -> disease.getName().length() > 5)
                .forEach(disease -> System.out.println(disease));

        System.out.println("Filter diseases starting with 'T' ");
        diseases.stream()
                .filter(disease -> disease.getName().startsWith("T"))
                .forEach(disease -> System.out.println(disease));

        System.out.println("Convert all disease names to uppercase");
        diseases.stream()
                .map(disease -> disease.getName().toUpperCase())
                .forEach(disease -> System.out.println(disease));

        System.out.println("Convert all names to lowercase");
        diseases.stream()
                .map(disease -> disease.getName().toLowerCase())
                .forEach(disease -> System.out.println(disease));

        System.out.println("Get length of each string 'H'");
        diseases.stream()
                .filter(disease -> disease.getName().startsWith("H"))
                .forEach(disease -> System.out.println(disease));

        System.out.println("Filter numbers id > 10, then double them ");
        diseases.stream()
                .filter(disease -> disease.getId() > 10)
                .map(disease -> disease.getId() * 2)
                .forEach(disease -> System.out.println(disease));

        System.out.println(" Remove null values from a list");
        diseases.stream()
                .filter(disease -> disease.getName() != null)
                .forEach(disease -> System.out.println(disease));

    }
}
