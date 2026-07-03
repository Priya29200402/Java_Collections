package org.intejjiJ.methods.functions.interfaces;

public class ownRunner {
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
    }
}
