package org.intejjiJ.set.runner;

import org.intejjiJ.set.dto.SnackDTO;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Contract {
    public static void main(String[] args) {
        Set<SnackDTO> snackSet = new TreeSet<>();
        snackSet.add(new SnackDTO("Doritos", "Spicy", 50, 20));
        snackSet.add(new SnackDTO("Lays", "Masala", 40, 15));
        snackSet.add(new SnackDTO("Doritos", "Spicy", 50, 20));
        snackSet.add(new SnackDTO("KurKure", "Spicy", 30, 10));
        snackSet.add(new SnackDTO("Aa", "Spicy", 30, 10));
        snackSet.add(new SnackDTO("BB", "Spicy", 30, 10));
        snackSet.add(new SnackDTO("Aa", "Spicy", 30, 10));

        System.out.println("Snacks in the set:"+snackSet.size());
        System.out.println("hashCodes");
        for (SnackDTO snack : snackSet) {
            System.out.println(snack.hashCode());
        }

        snackSet.forEach(snack -> System.out.println(snack));
    }
}
