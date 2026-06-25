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
    }
}
