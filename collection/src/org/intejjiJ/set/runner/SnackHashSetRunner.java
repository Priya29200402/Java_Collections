package org.intejjiJ.set.runner;

import org.intejjiJ.set.dto.SnackDTO;

import java.util.*;

public class SnackHashSetRunner {
    public static void main(String[] args) {

        HashSet<SnackDTO> snacks = new HashSet<>();

        SnackDTO s1 = new SnackDTO("Lays", "Masala", 50, 20);
        SnackDTO s2 = new SnackDTO("Kurkure", "Chilli", 60, 25);
        SnackDTO s3 = new SnackDTO("Bingo", "Tomato", 45, 15);
        SnackDTO s4 = new SnackDTO("Pringles", "Cheese", 100, 99);
        SnackDTO s5 = new SnackDTO("Doritos", "Nacho", 75, 50);

        snacks.add(s1);
        snacks.add(s2);
        snacks.add(s3);
        snacks.add(s4);
        snacks.add(s5);

        System.out.println("Task 1: Create HashSet of 5 SnackDTO objects");
        snacks.forEach(snack -> System.out.println(snack));


        snacks.add(new SnackDTO("Lays", "Masala", 50, 20));
        System.out.println("\nTask 2: Add duplicate snack");
        System.out.println("Size : " + snacks.size());

        snacks.remove(s2);
        System.out.println("\nTask 3: Remove snack using new object");
        snacks.forEach(snack -> System.out.println(snack));


        System.out.println("\nTask 4: contains()");
        System.out.println("contains:"+ snacks.contains(new SnackDTO("Lays", "Masala", 50, 20)));

        System.out.println("\nTask 5: Size");
        System.out.println("Size:"+snacks.size());


        Set<SnackDTO> clearSet = new HashSet<>(snacks);
        clearSet.clear();
        System.out.println("\nTask 6:Clear");
        System.out.println("clear set:"+clearSet);


        System.out.println("\nTask 7:isEmpty");
        System.out.println("isEmpty:"+clearSet.isEmpty());


        System.out.println("\nTask 8:Convert to array");
        Object[] array = snacks.toArray();
        for (Object obj : array) {
            System.out.println(obj);
        }


        System.out.println("\nTask 9:forEach lambda");
        snacks.forEach(snack -> System.out.println(snack));


        System.out.println("\nTask 10:Iterator");
        Iterator<SnackDTO> iterator = snacks.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        Set<SnackDTO> removeIfSet = new HashSet<>(snacks);
        removeIfSet.removeIf(snack -> snack.getPrice() < 30);
        System.out.println("\nTask 11:removeIf");
        removeIfSet.forEach(snack -> System.out.println(snack));


        Set<SnackDTO> capacitySet = new HashSet<>(20);
        capacitySet.add(s1);
        System.out.println("\nTask 12:Initial Capacity");
        System.out.println(capacitySet);


        HashSet<SnackDTO> loadFactorSet = new HashSet<>(20, 0.75f);
        loadFactorSet.add(s2);
        System.out.println("\nTask 13:Load Factor");
        System.out.println(loadFactorSet);


        HashSet<SnackDTO> set1 = new HashSet<>();
        HashSet<SnackDTO> set2 = new HashSet<>();
        set1.add(s1);
        set1.add(s2);
        set2.add(s3);
        set2.add(s4);
        set1.addAll(set2);
        System.out.println("\nTask 14:addAll");
        set1.forEach(snack -> System.out.println(snack));


        HashSet<SnackDTO> retain1 = new HashSet<>();
        HashSet<SnackDTO> retain2 = new HashSet<>();
        retain1.add(s1);
        retain1.add(s2);
        retain2.add(s1);
        retain2.add(s3);
        retain1.retainAll(retain2);
        System.out.println("\nTask 15:retainAll");
        retain1.forEach(snack -> System.out.println(snack));


        HashSet<SnackDTO> remove1 = new HashSet<>();
        HashSet<SnackDTO> remove2 = new HashSet<>();
        remove1.add(s1);
        remove1.add(s2);
        remove1.add(s3);
        remove2.add(s2);
        remove1.removeAll(remove2);
        System.out.println("\nTask 16:removeAll");
        remove1.forEach(snack -> System.out.println(snack));


        HashSet<SnackDTO> contain1 = new HashSet<>();
        HashSet<SnackDTO> contain2 = new HashSet<>();
        contain1.add(s1);
        contain1.add(s2);
        contain2.add(s1);
        System.out.println("\nTask 17:containsAll");
        System.out.println(contain1.containsAll(contain2));


        List<SnackDTO> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        HashSet<SnackDTO> listSet = new HashSet<>(list);
        System.out.println("\nTask 18:HashSet from List");
        listSet.forEach(snack -> System.out.println(snack));


        SnackDTO[] snacksArray = {s1, s2, s3};
        HashSet<SnackDTO> arraySet = new HashSet<>(Arrays.asList(snacksArray));
        System.out.println("\nTask 19:HashSet from Array");
        arraySet.forEach(snack -> System.out.println(snack));


        SnackDTO highest = null;
        for (SnackDTO snack : snacks) {
            if (highest == null ||
                    snack.getPrice() > highest.getPrice()) {
                highest = snack;
            }
        }
        System.out.println("\nTask 20:Highest Price Snack");
        System.out.println(highest);


        long count = snacks.stream()
                .filter(snack -> snack.getFlavor().equalsIgnoreCase("Masala"))
                .count();
        System.out.println("\nTask 21:Count snacks with flavor Masala");
        System.out.println(count);


        double totalWeight = 0;
        for (SnackDTO snack : snacks) {
            totalWeight += snack.getWeight();
        }
        System.out.println("\nTask 22:Total Weight");
        System.out.println(totalWeight);


        System.out.println("\nTask 23:Price below threshold");
        for (SnackDTO snack : snacks) {
            if (snack.getPrice() < 30) {
                System.out.println(snack);
            }
        }


        System.out.println("\nTask 24:Group by Flavor");
        Map<String, List<SnackDTO>> map = new HashMap<>();
        for (SnackDTO snack : snacks) {
            if (!map.containsKey(snack.getFlavor())) {
                map.put(snack.getFlavor(),
                        new ArrayList<>());
            }
            map.get(snack.getFlavor()).add(snack);
        }
        System.out.println(map);


        HashSet<SnackDTO> cloned = (HashSet<SnackDTO>) snacks.clone();
        System.out.println("\nTask 25:Clone HashSet");
        System.out.println(cloned);

    }
}
