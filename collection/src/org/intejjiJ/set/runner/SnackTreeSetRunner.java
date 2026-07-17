package org.intejjiJ.set.runner;


import org.intejjiJ.set.dto.SnackDTO;

import java.util.*;

public class SnackTreeSetRunner {
    public static void main(String[] args) {

        SnackDTO s1 = new SnackDTO("Lays", "Masala", 50, 20);
        SnackDTO s2 = new SnackDTO("Kurkure", "Chilli", 60, 25);
        SnackDTO s3 = new SnackDTO("Bingo", "Tomato", 45, 15);
        SnackDTO s4 = new SnackDTO("Pringles", "Cheese", 100, 99);
        SnackDTO s5 = new SnackDTO("Doritos", "Nacho", 75, 50);

        Set<SnackDTO> treeSet = new TreeSet<>();
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);
        treeSet.add(s5);
        System.out.println("Task 26:TreeSet Ordering (Price)");
        treeSet.forEach(treeSnack -> System.out.println(treeSnack));


        TreeSet<SnackDTO> byName = new TreeSet<>(Comparator.comparing(SnackDTO::getName));
        byName.addAll(treeSet);
        System.out.println("\nTask 27:Comparator By Name");
        byName.forEach(snackDTO ->  System.out.println(snackDTO));


        TreeSet<SnackDTO> byFlavor = new TreeSet<>(Comparator.comparing(SnackDTO::getFlavor));
        byFlavor.addAll(treeSet);
        System.out.println("\nTask 28:Comparator By Flavor");
        byFlavor.forEach(snackDTO -> System.out.println(snackDTO));


        TreeSet<SnackDTO> byWeight = new TreeSet<>(Comparator.comparingDouble(SnackDTO::getWeight));
        byWeight.addAll(treeSet);
        System.out.println("\nTask 29:Comparator By Weight");
        byWeight.forEach(snackDTO -> System.out.println(snackDTO));


        treeSet.add(new SnackDTO("Lays", "Masala", 50, 20));
        System.out.println("\nTask 30:Duplicate Snack");
        System.out.println("Size:" +treeSet.size());


        TreeSet<SnackDTO> pollFirstSet = new TreeSet<>(treeSet);
        System.out.println("\nTask 40:pollFirst");
        System.out.println(pollFirstSet.pollFirst());
        System.out.println(pollFirstSet);


        TreeSet<SnackDTO> pollLastSet = new TreeSet<>(treeSet);
        System.out.println("\nTask 41:pollLast");
        System.out.println(pollLastSet.pollLast());
        System.out.println(pollLastSet);


        System.out.println("\nTask 44:Find Snack by Name");
        for (SnackDTO snack : treeSet) {
            if (snack.getName().equalsIgnoreCase("Doritos")) {
                System.out.println(snack);
            }
        }


        System.out.println("\nTask 45:Find Snacks in Price Range");
        for (SnackDTO snack : treeSet) {
            if (snack.getPrice() >= 20 && snack.getPrice() <= 60) {
                System.out.println(snack);
            }
        }


        TreeSet<SnackDTO> multiple = new TreeSet<>(Comparator.comparing(SnackDTO::getFlavor)
                                .thenComparing(SnackDTO::getPrice)
                                .thenComparing(SnackDTO::getName));

        multiple.addAll(treeSet);
        System.out.println("\nTask 46:Comparator Chaining");
        multiple.forEach(snackDTO -> System.out.println(snackDTO));


        TreeSet<SnackDTO> reverse = new TreeSet<>(Collections.reverseOrder());
        reverse.addAll(treeSet);
        System.out.println("\nTask 47:Reverse Order");
        reverse.forEach(snackDTO -> System.out.println(snackDTO));


        TreeSet<SnackDTO> tree1 = new TreeSet<>();
        TreeSet<SnackDTO> tree2 = new TreeSet<>();
        tree1.add(s1);
        tree1.add(s2);
        tree2.add(s3);
        tree2.add(s4);
        tree1.addAll(tree2);
        System.out.println("\nTask 48:Merge Two TreeSets");
        tree1.forEach(snackDTO -> System.out.println(snackDTO));


        TreeSet<SnackDTO> common1 = new TreeSet<>();
        TreeSet<SnackDTO> common2 = new TreeSet<>();
        common1.add(s1);
        common1.add(s2);
        common2.add(s1);
        common2.add(s5);
        common1.retainAll(common2);
        System.out.println("\nTask 49:Common Elements");
        common1.forEach(snackDTO -> System.out.println(snackDTO));


        Set<SnackDTO> hashSet = new HashSet<>(treeSet);
        TreeSet<SnackDTO> treeFromHash =
                new TreeSet<>(hashSet);
        System.out.println("\nTask 50:TreeSet from HashSet and vice versa");
        System.out.println("HashSet");
        System.out.println(hashSet);

        System.out.println("TreeSet");
        System.out.println(treeFromHash);
    }
}
