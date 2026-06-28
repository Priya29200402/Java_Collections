package com.xworkz.add.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class ShipmentDTO implements Serializable {
    
    private int shipmentId;
    private int orderId;
    private String carrier;
    private String trackingNumber;
    private LocalDate deliveryDate;

    public ShipmentDTO(int shipmentId, int orderId, String carrier, String trackingNumber, LocalDate deliveryDate) {
        this.shipmentId = shipmentId;
        this.orderId = orderId;
        this.carrier = carrier;
        this.trackingNumber = trackingNumber;
        this.deliveryDate = deliveryDate;
    }

    public int getShipmentId() {

        return shipmentId;
    }

    public void setShipmentId(int shipmentId) {
        this.shipmentId = shipmentId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

}
