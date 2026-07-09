package org.intejjiJ.methods.runner;

import org.intejjiJ.methods.dto.MobileDTO;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MobileRunner {
    public static void main(String[] args) {
        List<MobileDTO> mobiles = new LinkedList<>();
        mobiles.add(new MobileDTO("Apple", 999, "Black"));
        mobiles.add(new MobileDTO("Samsung", 799, "White"));
        mobiles.add(new MobileDTO("Google", 699, "Blue"));
        mobiles.add(new MobileDTO("OnePlus", 599, "Gray"));
        mobiles.add(new MobileDTO("Xiaomi", 499, "Black"));

        System.out.println("Mobiles sorting by price");
        Collections.sort(mobiles);
        mobiles.forEach(mobileDTO -> System.out.println(mobileDTO));
    }
}
