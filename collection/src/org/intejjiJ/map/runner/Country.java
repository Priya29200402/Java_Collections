package org.intejjiJ.map.runner;

import java.util.HashMap;
import java.util.Map;

public class Country {
    public static void main(String[] args) {
        Map<Integer, String> countryMap = new HashMap<>();
        countryMap.put(1, "USA");
        countryMap.put(2, "CAN");
        countryMap.put(3, "MEX");
        countryMap.put(4, "BRA");
        countryMap.put(5, "ARG");
        countryMap.put(6, "PER");
        countryMap.put(7, "CHI");
        countryMap.put(8, "ECU");
        countryMap.put(9, "BOL");
        countryMap.put(10, "PAR");
        countryMap.put(11, "IND");

        countryMap.forEach((key, value) -> System.out.println("Key:" + key + ", Value:" + value));

        System.out.println(countryMap);
    }
}
