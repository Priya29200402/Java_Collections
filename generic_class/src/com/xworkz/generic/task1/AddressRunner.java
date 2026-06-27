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

        Address <String,Integer,String> address2 = new Address<>();
        address2.type="Urban";
        address2.pincode=123;
        address2.city="Belagavi";

    }
}
