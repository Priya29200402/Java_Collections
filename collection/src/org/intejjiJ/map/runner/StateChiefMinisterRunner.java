package org.intejjiJ.map.runner;

import org.intejjiJ.map.dto.ChiefMinisterDTO;
import org.intejjiJ.map.dto.StateDTO;

import java.util.HashMap;
import java.util.Map;

public class StateChiefMinisterRunner {
    public static void main(String[] args) {

        Map<StateDTO, ChiefMinisterDTO> map = new HashMap<>();

        map.put(new StateDTO("Karnataka", 70000000), new ChiefMinisterDTO("D.K.Shivakumar", 76));
        map.put(new StateDTO("Tamil Nadu", 80000000), new ChiefMinisterDTO("Thalapati Vijay", 72));
        map.put(new StateDTO("Kerala", 35000000), new ChiefMinisterDTO("Pinarayi Vijayan", 80));
        map.put(new StateDTO("Telangana", 40000000), new ChiefMinisterDTO("Revanth Reddy", 56));
        map.put(new StateDTO("Andhra Pradesh", 50000000), new ChiefMinisterDTO("N. Chandrababu Naidu", 75));

        System.out.println("====State and Chief Minister Details=====");
        System.out.println("Size :" + map.size());

        System.out.println("\nOnly Keys");
        System.out.println(map.keySet());

        System.out.println("\nOnly Values");
        System.out.println(map.values());
    }
}
