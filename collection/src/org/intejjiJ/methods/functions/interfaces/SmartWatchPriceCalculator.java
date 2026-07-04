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

@FunctionalInterface
interface Book{
    double getBookPrice(String name);
}

@FunctionalInterface
interface Movie{
    double getMoviePrice(String name);
}

@FunctionalInterface
interface Ticket{
    double getTicketPrice(String name);
}

@FunctionalInterface
interface TicketGenerator{
    String generate(String name);
}

@FunctionalInterface
interface TicketValidator{
    boolean validate(String name);
}

@FunctionalInterface
interface Pen{
    int getPenPrice(String name);
}

@FunctionalInterface
interface PenValidator{
    boolean validate(String name);
}

@FunctionalInterface
interface Laptop{
    String getBrand(String name);
}

@FunctionalInterface
interface LaptopValidator{
    boolean validate(String name);
}

@FunctionalInterface
interface Cloth{
    String getColor(String name);
}

@FunctionalInterface
interface Curtain{
    void open();
}

@FunctionalInterface
interface Ring{
    double getPrice(String type);
}

@FunctionalInterface
interface Bottle{
    double getPrice(String type);
}

@FunctionalInterface
interface Youtube{
    void play();
}

@FunctionalInterface
interface Blanket{
    void warm();
}

@FunctionalInterface
interface Sofa{
    void relax();
}

@FunctionalInterface
interface Clip{
    void attach();
}

@FunctionalInterface
interface Charger{
    void charge();
}

@FunctionalInterface
interface Cubboard{
    void store();
}

//47
@FunctionalInterface
interface Table{
    void place();
}

//48
@FunctionalInterface
interface Bike{
    void ride();
}

@FunctionalInterface
interface Slipper{
    int size(double price);
}

@FunctionalInterface
interface Knife{
    void cut();
}

@FunctionalInterface
interface Pillow{
    void sleep();
}

@FunctionalInterface
interface Broom{
    void sweep();
}

@FunctionalInterface
interface StudyTable{
    void study();
}

@FunctionalInterface
interface Library{
    void read();
}

@FunctionalInterface
interface Wall{
    void paint();
}

@FunctionalInterface
interface Door{
    void open();
}

@FunctionalInterface
interface Fan{
    void rotate();
}

@FunctionalInterface
interface Watch{
    void charge();
}

@FunctionalInterface
interface Priyanka{
    void work();
}





