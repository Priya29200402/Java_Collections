package in.xworkz.stream.runner;

import in.xworkz.stream.dto.PincodeDTO;

import java.util.LinkedList;
import java.util.List;

public class PincodeRunner {
    public static void main(String[] args) {

        List<PincodeDTO> pincodeDTOs = new LinkedList();
        pincodeDTOs.add(new PincodeDTO("Bangalore", 560001));
        pincodeDTOs.add(new PincodeDTO("Mysore", 570001));
        pincodeDTOs.add(new PincodeDTO("Delhi", 110001));
        pincodeDTOs.add(new PincodeDTO("Mumbai", 400001));
        pincodeDTOs.add(new PincodeDTO("Chennai", 600001));
        pincodeDTOs.add(new PincodeDTO("Hyderabad", 500001));
        pincodeDTOs.add(new PincodeDTO("Pune", 411001));
        pincodeDTOs.add(new PincodeDTO("Mangalore", 575001));
        pincodeDTOs.add(new PincodeDTO("Davanagere", 577002));
        pincodeDTOs.add(new PincodeDTO("Dharwad", 580001));
        pincodeDTOs.add(new PincodeDTO("Madurai", 625001));
        pincodeDTOs.add(new PincodeDTO("Jaipur", 302001));
        pincodeDTOs.add(new PincodeDTO("Nagpur", 440001));
        pincodeDTOs.add(new PincodeDTO("Ahmedabad", 380001));
        pincodeDTOs.add(new PincodeDTO("Manipal", 576104));

        System.out.println("======citries with Pincode range 500000-599999 ======");

        pincodeDTOs.stream()
                .filter(pincode -> pincode.getPincode() >= 500000 && pincode.getPincode() <= 599999)
                .forEach(pincode -> System.out.println(pincode.getCityName()+"->"+ pincode.getPincode()));

        System.out.println("======Filtering cities with names longer than 6 characters=======");
        pincodeDTOs.stream()
                .filter(pincode -> pincode.getCityName().length() > 6)
                .forEach(pincode -> System.out.println(pincode.getCityName()+"->"+ pincode.getPincode()));

        System.out.println("======Filtering cities with names shorter than 6 characters=======");
        pincodeDTOs.stream()
                .filter(pincode -> pincode.getCityName().length() < 6)
                .forEach(pincode -> System.out.println(pincode.getCityName()+"->"+ pincode.getPincode()));

        System.out.println("======Filtering cities where pincode contains digit 1=======");
        pincodeDTOs.stream()
                .filter(pincode -> String.valueOf(pincode.getPincode()).contains("1"))
                .forEach(pincode -> System.out.println(pincode.getCityName()+"->"+pincode.getPincode()));

        System.out.println("==========cities with even pincode numbers==========");
        pincodeDTOs.stream()
                .filter(pincode -> pincode.getPincode() % 2 == 0)
                .forEach(pincode -> System.out.println(pincode.getCityName()+"->"+ pincode.getPincode()));

        System.out.println("==========cities with odd pincode numbers==========");
        pincodeDTOs.stream()
                .filter(pincode -> pincode.getPincode() % 2 != 0)
                .forEach(pincode -> System.out.println(pincode.getCityName()+"->"+ pincode.getPincode()));

        System.out.println("========== cities starting with 'M' or 'D'==========");
        pincodeDTOs.stream()
                .filter(pincode -> pincode.getCityName().startsWith("M") || pincode.getCityName().startsWith("D"))
                .forEach(pincode -> System.out.println(pincode.getCityName()+"->"+ pincode.getPincode()));

        System.out.println("cities where pincode is divisible by 3 ");
        pincodeDTOs.stream()
                .filter(pincode -> pincode.getPincode() % 3 == 0)
                .forEach(pincode -> System.out.println(pincode.getCityName()+"->"+ pincode.getPincode()));

        System.out.println("Filtering by city name containing specific letter: Get cities containing 'a' in name");
        pincodeDTOs.stream()
                .filter(pincode -> pincode.getCityName().contains("a"))
                .forEach(pincode -> System.out.println(pincode.getCityName()+"->"+ pincode.getPincode()));

        System.out.println("Find cities with pincode ending in '001'");
        pincodeDTOs.stream()
                .filter(pincode -> String.valueOf(pincode.getPincode()).endsWith("001"))
                .forEach(pincode -> System.out.println(pincode.getCityName()+"->"+ pincode.getPincode()));
    }
}
