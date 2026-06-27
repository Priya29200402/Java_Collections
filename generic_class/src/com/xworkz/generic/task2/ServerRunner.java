package com.xworkz.generic.task2;

public class ServerRunner {
    public static void main(String[] args) {
        Server<String,String,Integer> server = new Server<>();
        server.type="Web Server";
        server.name="Chrome";
        server.capacity=123;

        System.out.println("Type:"+server.type);
        System.out.println("Name:"+server.name);
        System.out.println("Capacity:"+server.capacity);

        Server<Character,String,Double> server2 = new Server<>();
        server2.type='A';
        server2.name="Chrome";
        server2.capacity=145.85;

        System.out.println("Type:"+server2.type);
        System.out.println("Name:"+server2.name);
        System.out.println("Capacity:"+server2.capacity);

    }
}
