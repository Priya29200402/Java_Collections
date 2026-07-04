package org.intejjiJ.methods.functions.interfaces;

public class OwnRunner {
    public static void main(String[] args) {
        SmartWatchPriceCalculator priceCalculator = (basePrice) -> basePrice;
        System.out.println("Price:" + priceCalculator.calculatePrice(1000));

        System.out.println("=======================");

        SmartWatchDiscountCalculator discountCalculator = (price) -> price * 0.9;
        System.out.println("Discount:" + discountCalculator.calculateDiscount(1000));

        System.out.println("=======================");

        AirIndiaFare airIndiaFare = (distance) -> distance * 0.1;
        System.out.println("AirIndiaFare:" + airIndiaFare.calculate(1000));

        System.out.println("=======================");

        MovieTicketCost movieTicketCost = (seats) -> seats * 100;
        System.out.println("MovieTicketCost:" + movieTicketCost.calculate(10));

        System.out.println("=======================");

        AppointmentValidator appointmentValidator = (doctorName) -> !doctorName.isEmpty();
        System.out.println("AppointmentValidator:" + appointmentValidator.validate("Dr. Smith"));

        System.out.println("=======================");

        RestaurantBill restaurantBill = (foodAmount) -> foodAmount * 1.1;
        System.out.println("RestaurantBill:" + restaurantBill.generate(1000));

        System.out.println("=======================");

        MobileRecharge mobileRecharge = (mobileNumber) -> "Recharged " + mobileNumber;
        System.out.println("MobileRecharge:" + mobileRecharge.recharge("1234567890"));

        System.out.println("=======================");

        InsurancePremium insurancePremium = (vehicleCost) -> vehicleCost * 0.05;
        System.out.println("InsurancePremium:" + insurancePremium.calculate(10000));

        System.out.println("=======================");

        HotelBooking hotelBooking = (roomsAvailable) -> roomsAvailable > 0;
        System.out.println("HotelBooking:" + hotelBooking.book(5));

        System.out.println("=======================");

        MedicineExpiryChecker medicineExpiryChecker = (expiryYear) -> expiryYear > 2023;
        System.out.println("MedicineExpiryChecker:" + medicineExpiryChecker.check(2024));

        System.out.println("=======================");

        PassportVerification passportVerification = (passportNumber) -> !passportNumber.isEmpty();
        System.out.println("PassportVerification:" + passportVerification.verify("P1234567"));

        System.out.println("=======================");

        ElectricityBillCalculator electricityBillCalculator = (units) -> units * 0.15;
        System.out.println("ElectricityBillCalculator:" + electricityBillCalculator.calculate(100));

        System.out.println("=======================");

        WaterBillCalculator waterBillCalculator = (litres) -> litres * 0.05;
        System.out.println("WaterBillCalculator:" + waterBillCalculator.calculate(1000));

        System.out.println("=======================");

        LaptopWarranty laptopWarranty = (years) -> years >= 2;
        System.out.println("LaptopWarranty:" + laptopWarranty.check(3));

        System.out.println("=======================");

        IPLPoints iplPoints = (wins) -> wins * 2;
        System.out.println("IPLPoints:" + iplPoints.calculate(10));

        System.out.println("=======================");

        MetroCardDeduction metroCardDeduction = (balance, fare) -> balance - fare;
        System.out.println("MetroCardDeduction:" + metroCardDeduction.deduct(100, 20));

        System.out.println("=======================");

        SmartWatchCreator smartWatchCreator = (brand, price) -> new SmartWatchDTO(brand, price);
        System.out.println("SmartWatchCreator:" + smartWatchCreator.create("Noise", 1300));

        System.out.println("=======================");

        AirIndiaBooking airIndiaBooking = (passenger, destination) -> new AirIndiaDTO(passenger, destination);
        System.out.println("AirIndiaBooking:" + airIndiaBooking.book("Priyanka", "Switzerland"));

        System.out.println("=======================");

        RestaurantRating restaurantRating = (rating) -> rating >= 4.0;
        System.out.println("RestaurantRating:" + restaurantRating.validate(4.5));

        System.out.println("=======================");

        BookSearch bookSearch = (title) -> !title.isEmpty();
        System.out.println("BookSearch:" + bookSearch.search("Java Programming"));

        System.out.println("=======================");

        FlightTicketGenerator flightTicketGenerator = (passenger) -> "Ticket for " + passenger;
        System.out.println("FlightTicketGenerator:" + flightTicketGenerator.generate("John Doe"));

        System.out.println("=======================");

        DoctorAvailabilityChecker doctorAvailabilityChecker = (doctor) -> !doctor.isEmpty();
        System.out.println("DoctorAvailabilityChecker:" + doctorAvailabilityChecker.available("Dr. Smith"));

        System.out.println("=======================");

        AppointmentGenerator appointmentGenerator = (patient) -> "Appointment for " + patient;
        System.out.println("AppointmentGenerator:" + appointmentGenerator.generate("John Doe"));

        System.out.println("=======================");

        MedicinePrescriber medicinePrescriber = (disease) -> "Prescription for " + disease;
        System.out.println("MedicinePrescriber:" + medicinePrescriber.prescribe("Flu"));

        System.out.println("=======================");

        BedAvailabilityChecker bedAvailabilityChecker = (beds) -> beds > 0;
        System.out.println("BedAvailabilityChecker:" + bedAvailabilityChecker.available(5));

        System.out.println("=======================");

        FuelCostCalculator fuelCostCalculator = (liters) -> liters * 85.0;
        System.out.println("FuelCostCalculator:" + fuelCostCalculator.calculate(10));

        Book book = (name) -> 100;

        Movie movie=(name)->100;

        Ticket ticket=(name)->100;

        Pen pen=(name)->100;

        Laptop laptop=(name)-> "HP";

        LaptopValidator laptopValidator=(name)->true;

        PenValidator penValidator=(name)->true;

        TicketValidator ticketValidator=(name)->true;

        Cloth cloth=(name)-> "Red";

        Curtain curtain=()-> System.out.println("Curtain Opened");

        Ring ring=(type)->  21000;

        Bottle bottle=(type)->  300;

        Youtube youtube=()-> System.out.println("Playing song on YouTube");

        Blanket blanket=()-> System.out.println("Blanket is warm");

        Sofa sofa=()-> System.out.println("Sofa is comfortable");

        Clip clip=()-> System.out.println("Clip is attached to curtain");

        Charger charger=()-> System.out.println("I put my mobile in charging");

        Cubboard cubboard=()-> System.out.println("I stored my clothes in cubboard");

        Table table=()-> System.out.println("I placed my books on the table");

        Bike bike=()-> System.out.println("I am going to solo trip in my bike");

        Slipper slipper=(price)-> 8;

        Knife knife=()-> System.out.println("I am cutting the onion");

        Pillow pillow=()-> System.out.println("I cannot sleep without pillow");

        Broom broom=()-> System.out.println("I am sweeping the floor");

        StudyTable studyTable=()-> System.out.println("I am studying on the table");

        Library library=()-> System.out.println("I going to library everyday and reading books");

        Wall wall=()-> System.out.println("I want to paint my home wall levendar color");

        Door door=()-> System.out.println("Please Open the door");

        Fan fan=()-> System.out.println("Why Fan is rotating Anti-Clockwise?");

        Watch watch=()-> System.out.println("I need to charge my Smart Watch");

        Priyanka priyanka=()-> System.out.println("Good Priyanka You Successfully Completed 58 lambda Expressions");




    }
}
