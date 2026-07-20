package org.intejjiJ.map.runner;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {
    public static void main(String[] args) {
        Map<String,String> userIds=new HashMap<>();
        userIds.put("Priya", "Priya@29");
        userIds.put("Ravi", "Ravi@30");
        userIds.put("Amit", "Amit@31");
        userIds.put("Pooja","Pooja@13");
        userIds.put("Rahul", "Rahul@22");
        userIds.put("Priya", "Priya@29");

        System.out.println("========Print both key and value========");
        userIds.forEach((k, v) -> System.out.println(k +":" + v));

        System.out.println("========Print only keys=======");
        userIds.forEach((k, v) -> System.out.println(k));

        System.out.println("===========Print only keys=======");
        userIds.forEach((k, v) -> System.out.println(v));


        System.out.println("=========Room NO with person Name========");
        Map<Integer,String> roomNoWithPerson = new HashMap<>();
        roomNoWithPerson.put(101, "Priya");
        roomNoWithPerson.put(102, "Ravi");
        roomNoWithPerson.put(103, "Amit");
        roomNoWithPerson.put(104, "Pooja");
        roomNoWithPerson.put(105, "Rahul");

        System.out.println("=========Room NO with person Name========");
        roomNoWithPerson.forEach((k, v) -> System.out.println(k +":" + v));

        System.out.println("========Print only keys=======");
        roomNoWithPerson.forEach((k, v) -> System.out.println(k));

        System.out.println("========Print only values=======");
        roomNoWithPerson.forEach((k, v) -> System.out.println(v));

        Map<String, Integer> areaWithHouseNo = new HashMap<>();
        areaWithHouseNo.put("Btm 2nd stage", 64);
        areaWithHouseNo.put("NS Palya", 12);
        areaWithHouseNo.put("Electronic City", 103);
        areaWithHouseNo.put("Hebbal", 150);
        areaWithHouseNo.put("Koramangala", 85);

        System.out.println("=========Area with House No========");
        areaWithHouseNo.forEach((k, v) -> System.out.println(k +":" + v));

        System.out.println("========Print only keys=======");
        areaWithHouseNo.forEach((k, v) -> System.out.println(k));

        System.out.println("========Print only values=======");
        areaWithHouseNo.forEach((k, v) -> System.out.println(v));

        Map<String,String> emailWithUserName = new HashMap<>();
        emailWithUserName.put("priya@gmail.com", "Priya");
        emailWithUserName.put("ravi@gmail.com", "Ravi");
        emailWithUserName.put("amit@gmail.com", "Amit");
        emailWithUserName.put("pooja@gmail.com", "Pooja");
        emailWithUserName.put("rahul@gmail.com", "Rahul");

        System.out.println("=========Email with User Name========");
        emailWithUserName.forEach((k, v) -> System.out.println(k +":" + v));

        System.out.println("========Print only keys=======");
        emailWithUserName.forEach((k, v) -> System.out.println(k));

        System.out.println("========Print only values=======");
        emailWithUserName.forEach((k, v) -> System.out.println(v));

        
    }
}
