package com.xworkz.add.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class DiscountDTO implements Serializable {
    
    private int discountId;
    private String code;
    private String description;
    private double percentage;
    private LocalDate expiryDate;

    public DiscountDTO(int discountId, String code, String description, double percentage, LocalDate expiryDate) {
        this.discountId = discountId;
        this.code = code;
        this.description = description;
        this.percentage = percentage;
        this.expiryDate = expiryDate;
    }

    public int getDiscountId() {
        return discountId;
    }

    public void setDiscountId(int discountId) {
        this.discountId = discountId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

}
