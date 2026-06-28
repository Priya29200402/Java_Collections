package com.xworkz.add.dto;

import java.io.Serializable;

public class SupplierDTO implements Serializable {
    
    private int supplierId;
    private String name;
    private String address;
    private String contactPerson;
    private long phone;

    public SupplierDTO(int supplierId, String name, String address, String contactPerson, long phone) {
        this.supplierId = supplierId;
        this.name = name;
        this.address = address;
        this.contactPerson = contactPerson;
        this.phone = phone;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

}
