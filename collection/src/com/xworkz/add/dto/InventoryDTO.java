package com.xworkz.add.dto;

import java.io.Serializable;

public class InventoryDTO implements Serializable {
    
    private int itemId;
    private String productName;
    private int quantity;
    private String location;
    private String supplier;

    public InventoryDTO(int itemId, String productName, int quantity, String location, String supplier) {
        this.itemId = itemId;
        this.productName = productName;
        this.quantity = quantity;
        this.location = location;
        this.supplier = supplier;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

}
