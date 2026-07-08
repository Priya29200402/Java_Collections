package org.intejjiJ.methods.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MobileRunner {
    public static void main(String[] args) {
        List<Integer> rollNumbers = new ArrayList<>();
        rollNumbers.add(9);
        rollNumbers.add(98);
        rollNumbers.add(45);
        rollNumbers.add(13);
        rollNumbers.add(54);
        rollNumbers.add(65);

        System.out.println("Sorting rollNumbers in ascending order using Collections.sort()");
        Collections.sort(rollNumbers);
        rollNumbers.forEach(number -> System.out.println(number));
    }
}
