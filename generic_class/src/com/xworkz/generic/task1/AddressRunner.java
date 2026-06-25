package com.xworkz.generic.task1;

public class AddressRunner {
    public static void main(String[] args) {
        Address <String,Integer,String> address = new Address<>();
        address.type="Urban";
        address.pincode=123;
        address.city="Belagavi";

        System.out.println("Type:"+address.type);
        System.out.println("Pincode:"+address.pincode);
        System.out.println("city:"+address.city);

    }
}
