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
        System.out.println("Size :"+ userIds.size());
        userIds.forEach((key,value)-> System.out.println("Key:"+key+" Value:"+value));

        System.out.println("========Print only keys=======");
        System.out.println("Only Keys:"+ userIds.keySet());

        System.out.println("===========Print only keys=======");
        System.out.println("Only Values:"+ userIds.values());


        System.out.println("=========Room NO with person Name========");
        Map<Integer,String> roomNoWithPerson = new HashMap<>();
        roomNoWithPerson.put(101, "Priya");
        roomNoWithPerson.put(102, "Ravi");
        roomNoWithPerson.put(103, "Amit");
        roomNoWithPerson.put(104, "Pooja");
        roomNoWithPerson.put(105, "Rahul");

        System.out.println("=========Room NO with person Name========");
        System.out.println("Size :"+ roomNoWithPerson.size());

        System.out.println("========Print only keys=======");
        System.out.println("Only Keys:"+ roomNoWithPerson.keySet());

        System.out.println("========Print only values=======");
        System.out.println("Only Values:"+ roomNoWithPerson.values());


        System.out.println("================Area with House No========================");
        Map<String, Integer> areaWithHouseNo = new HashMap<>();
        areaWithHouseNo.put("Btm 2nd stage", 64);
        areaWithHouseNo.put("NS Palya", 12);
        areaWithHouseNo.put("Electronic City", 103);
        areaWithHouseNo.put("Hebbal", 150);
        areaWithHouseNo.put("Koramangala", 85);

        System.out.println("=========Area with House No========");
        System.out.println("Size :"+ areaWithHouseNo.size());

        System.out.println("========Print only keys=======");
        System.out.println("Only Keys:"+ areaWithHouseNo.keySet());

        System.out.println("========Print only values=======");
        System.out.println("Only Values:"+ areaWithHouseNo.values());


        System.out.println("=========Email with User Name========");
        Map<String,String> emailWithUserName = new HashMap<>();
        emailWithUserName.put("priya@gmail.com", "Priya");
        emailWithUserName.put("ravi@gmail.com", "Ravi");
        emailWithUserName.put("amit@gmail.com", "Amit");
        emailWithUserName.put("pooja@gmail.com", "Pooja");
        emailWithUserName.put("rahul@gmail.com", "Rahul");

        System.out.println("=========Email with User Name========");
        System.out.println("Size :"+ emailWithUserName.size());

        System.out.println("========Print only keys=======");
        System.out.println("Only Keys:"+ emailWithUserName.keySet());

        System.out.println("========Print only values=======");
        System.out.println("Only Values:"+ emailWithUserName.values());

        System.out.println("=========Religion with God Name========");
        Map<String, String> religionWithGodName = new HashMap<>();
        religionWithGodName.put("Hindu", "Vishnu");
        religionWithGodName.put("Christian", "Jesus");
        religionWithGodName.put("Islam", "Mohammed");
        religionWithGodName.put("Sikh", "Guru Nanak");
        religionWithGodName.put("Buddhist", "Buddha");

        System.out.println("=========Religion with God Name========");
        System.out.println("Size :"+ religionWithGodName.size());

        System.out.println("========Print only keys=======");
        System.out.println("Only Keys:"+ religionWithGodName.keySet());

        System.out.println("========Print only values=======");
        System.out.println("Only Values:"+ religionWithGodName.values());


        System.out.println("=========Bank Account with Person Name========");
        Map<Integer,String> bankAccountWithPersonName = new HashMap<>();
        bankAccountWithPersonName.put(1001, "Rahul");
        bankAccountWithPersonName.put(1002, "Priya");
        bankAccountWithPersonName.put(1003, "Ravi");
        bankAccountWithPersonName.put(1004, "Pooja");
        bankAccountWithPersonName.put(1005, "Amit");

        System.out.println("=========Bank Account with Person Name========");
        System.out.println("Size :"+ bankAccountWithPersonName.size());

        System.out.println("========Print only keys=======");
        System.out.println("Only Keys:"+ bankAccountWithPersonName.keySet());

        System.out.println("========Print only values=======");
        System.out.println("Only Values:"+ bankAccountWithPersonName.values());

    }
}
