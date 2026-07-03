package org.intejjiJ.methods.functions.interfaces;

import lombok.ToString;

@FunctionalInterface
interface SmartWatchPriceCalculator {
    double calculatePrice(double basePrice);
}

@FunctionalInterface
interface SmartWatchDiscountCalculator {
    double calculateDiscount(double price);
}

@FunctionalInterface
interface AirIndiaFare {
    double calculate(double distance);
}

@FunctionalInterface
interface MovieTicketCost {
    double calculate(int seats);
}

@FunctionalInterface
interface AppointmentValidator {
    boolean validate(String doctorName);
}

@FunctionalInterface
interface RestaurantBill {
    double generate(double foodAmount);
}

@FunctionalInterface
interface MobileRecharge {
    String recharge(String mobileNumber);
}

@FunctionalInterface
interface InsurancePremium {
    double calculate(double vehicleCost);
}

@FunctionalInterface
interface HotelBooking {
    boolean book(int roomsAvailable);
}

@FunctionalInterface
interface MedicineExpiryChecker {
    boolean check(int expiryYear);
}

@FunctionalInterface
interface PassportVerification {
    boolean verify(String passportNumber);
}

@FunctionalInterface
interface AadhaarFormatter {
    String format(String aadhaar);
}

@FunctionalInterface
interface ElectricityBillCalculator {
    double calculate(int units);
}

@FunctionalInterface
interface WaterBillCalculator {
    double calculate(int litres);
}

@FunctionalInterface
interface LaptopWarranty {
    boolean check(int years);
}

@FunctionalInterface
interface IPLPoints {
    int calculate(int wins);
}

@FunctionalInterface
interface MetroCardDeduction {
    double deduct(double balance, double fare);
}

@FunctionalInterface
interface SmartWatchCreator {
    SmartWatchDTO create(String brand,double price);
}

@FunctionalInterface
interface AirIndiaBooking {
    AirIndiaDTO book(String passenger,String destination);
}

@FunctionalInterface
interface RestaurantRating {
    boolean validate(double rating);
}

@FunctionalInterface
interface BookSearch {
    boolean search(String title);
}

@FunctionalInterface
interface FlightTicketGenerator{
    String generate(String passenger);
}

@FunctionalInterface
interface DoctorAvailabilityChecker{
    boolean available(String doctor);
}

@FunctionalInterface
interface AppointmentGenerator{
    String generate(String patient);
}

@FunctionalInterface
interface MedicinePrescriber{
    String prescribe(String disease);
}

@FunctionalInterface
interface BedAvailabilityChecker{
    boolean available(int beds);
}

@FunctionalInterface
interface FuelCostCalculator{
    double calculate(double liters);
}



