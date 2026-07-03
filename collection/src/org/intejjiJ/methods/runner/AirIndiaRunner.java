package org.intejjiJ.methods.runner;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import org.intejjiJ.methods.dto.AirIndiaDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class AirIndiaRunner {
    public static void main(String[] args) {
        List<AirIndiaDTO> airIndiaDTOs = new ArrayList<>();
        airIndiaDTOs.add(new AirIndiaDTO("Rahul Sharma", "Delhi", "New York", "Indira Gandhi International Airport", "John F. Kennedy International Airport", "India", "USA", LocalDate.of(2022, 1, 5)));
        airIndiaDTOs.add(new AirIndiaDTO("Priya Patil", "Mumbai", "London", "Chhatrapati Shivaji Maharaj International Airport", "Heathrow Airport", "India", "UK", LocalDate.of(2022, 2, 12)));
        airIndiaDTOs.add(new AirIndiaDTO("Amit Kumar", "Bengaluru", "Dubai", "Kempegowda International Airport", "Dubai International Airport", "India", "UAE", LocalDate.of(2022, 3, 18)));
        airIndiaDTOs.add(new AirIndiaDTO("Sneha Reddy", "Hyderabad", "Singapore", "Rajiv Gandhi International Airport", "Changi Airport", "India", "Singapore", LocalDate.of(2022, 4, 22)));
        airIndiaDTOs.add(new AirIndiaDTO("Vikram Singh", "Chennai", "Toronto", "Chennai International Airport", "Toronto Pearson International Airport", "India", "Canada", LocalDate.of(2022, 5, 10)));

        airIndiaDTOs.add(new AirIndiaDTO("Anjali Desai", "Delhi", "Paris", "Indira Gandhi International Airport", "Charles de Gaulle Airport", "India", "France", LocalDate.of(2022, 6, 14)));
        airIndiaDTOs.add(new AirIndiaDTO("Karan Mehta", "Mumbai", "Sydney", "Chhatrapati Shivaji Maharaj International Airport", "Sydney Kingsford Smith Airport", "India", "Australia", LocalDate.of(2022, 7, 19)));
        airIndiaDTOs.add(new AirIndiaDTO("Neha Joshi", "Kolkata", "Bangkok", "Netaji Subhas Chandra Bose International Airport", "Suvarnabhumi Airport", "India", "Thailand", LocalDate.of(2022, 8, 25)));
        airIndiaDTOs.add(new AirIndiaDTO("Arjun Nair", "Kochi", "Doha", "Cochin International Airport", "Hamad International Airport", "India", "Qatar", LocalDate.of(2022, 9, 9)));
        airIndiaDTOs.add(new AirIndiaDTO("Pooja Kulkarni", "Ahmedabad", "Muscat", "Sardar Vallabhbhai Patel International Airport", "Muscat International Airport", "India", "Oman", LocalDate.of(2022, 10, 3)));

        airIndiaDTOs.add(new AirIndiaDTO("Rohan Gupta", "Delhi", "Frankfurt", "Indira Gandhi International Airport", "Frankfurt Airport", "India", "Germany", LocalDate.of(2022, 11, 15)));
        airIndiaDTOs.add(new AirIndiaDTO("Meera Rao", "Mumbai", "Tokyo", "Chhatrapati Shivaji Maharaj International Airport", "Haneda Airport", "India", "Japan", LocalDate.of(2022, 12, 20)));
        airIndiaDTOs.add(new AirIndiaDTO("Suresh Iyer", "Bengaluru", "Amsterdam", "Kempegowda International Airport", "Amsterdam Schiphol Airport", "India", "Netherlands", LocalDate.of(2023, 1, 7)));
        airIndiaDTOs.add(new AirIndiaDTO("Divya Menon", "Chennai", "Kuala Lumpur", "Chennai International Airport", "Kuala Lumpur International Airport", "India", "Malaysia", LocalDate.of(2023, 2, 11)));
        airIndiaDTOs.add(new AirIndiaDTO("Manish Agarwal", "Hyderabad", "San Francisco", "Rajiv Gandhi International Airport", "San Francisco International Airport", "India", "USA", LocalDate.of(2023, 3, 16)));

        airIndiaDTOs.add(new AirIndiaDTO("Kavya Shetty", "Mangaluru", "Dubai", "Mangalore International Airport", "Dubai International Airport", "India", "UAE", LocalDate.of(2023, 4, 21)));
        airIndiaDTOs.add(new AirIndiaDTO("Nikhil Verma", "Pune", "London", "Pune International Airport", "Heathrow Airport", "India", "UK", LocalDate.of(2023, 5, 6)));
        airIndiaDTOs.add(new AirIndiaDTO("Swathi Gowda", "Bengaluru", "Singapore", "Kempegowda International Airport", "Changi Airport", "India", "Singapore", LocalDate.of(2023, 6, 13)));
        airIndiaDTOs.add(new AirIndiaDTO("Harsh Malhotra", "Delhi", "Melbourne", "Indira Gandhi International Airport", "Melbourne Airport", "India", "Australia", LocalDate.of(2023, 7, 27)));
        airIndiaDTOs.add(new AirIndiaDTO("Ritika Jain", "Jaipur", "Bangkok", "Jaipur International Airport", "Suvarnabhumi Airport", "India", "Thailand", LocalDate.of(2023, 8, 8)));

        airIndiaDTOs.add(new AirIndiaDTO("Aditya Rao", "Goa", "Doha", "Manohar International Airport", "Hamad International Airport", "India", "Qatar", LocalDate.of(2023, 9, 12)));
        airIndiaDTOs.add(new AirIndiaDTO("Shreya Das", "Kolkata", "Abu Dhabi", "Netaji Subhas Chandra Bose International Airport", "Zayed International Airport", "India", "UAE", LocalDate.of(2023, 10, 18)));
        airIndiaDTOs.add(new AirIndiaDTO("Yash Chavan", "Mumbai", "New York", "Chhatrapati Shivaji Maharaj International Airport", "John F. Kennedy International Airport", "India", "USA", LocalDate.of(2023, 11, 23)));
        airIndiaDTOs.add(new AirIndiaDTO("Tanvi Bhat", "Bengaluru", "Paris", "Kempegowda International Airport", "Charles de Gaulle Airport", "India", "France", LocalDate.of(2023, 12, 5)));
        airIndiaDTOs.add(new AirIndiaDTO("Pranav Mishra", "Delhi", "Zurich", "Indira Gandhi International Airport", "Zurich Airport", "India", "Switzerland", LocalDate.of(2024, 1, 9)));

        airIndiaDTOs.add(new AirIndiaDTO("Isha Kapoor", "Mumbai", "Toronto", "Chhatrapati Shivaji Maharaj International Airport", "Toronto Pearson International Airport", "India", "Canada", LocalDate.of(2024, 2, 14)));
        airIndiaDTOs.add(new AirIndiaDTO("Deepak Yadav", "Lucknow", "Dubai", "Chaudhary Charan Singh International Airport", "Dubai International Airport", "India", "UAE", LocalDate.of(2024, 3, 19)));
        airIndiaDTOs.add(new AirIndiaDTO("Nandini Hegde", "Bengaluru", "Tokyo", "Kempegowda International Airport", "Haneda Airport", "India", "Japan", LocalDate.of(2024, 4, 25)));
        airIndiaDTOs.add(new AirIndiaDTO("Sanjay Pillai", "Kochi", "Muscat", "Cochin International Airport", "Muscat International Airport", "India", "Oman", LocalDate.of(2024, 5, 30)));
        airIndiaDTOs.add(new AirIndiaDTO("Bhavana Naik", "Goa", "Singapore", "Manohar International Airport", "Changi Airport", "India", "Singapore", LocalDate.of(2024, 6, 4)));

        airIndiaDTOs.add(new AirIndiaDTO("Akash Banerjee", "Kolkata", "London", "Netaji Subhas Chandra Bose International Airport", "Heathrow Airport", "India", "UK", LocalDate.of(2024, 7, 10)));
        airIndiaDTOs.add(new AirIndiaDTO("Madhuri Patil", "Pune", "Frankfurt", "Pune International Airport", "Frankfurt Airport", "India", "Germany", LocalDate.of(2024, 8, 16)));
        airIndiaDTOs.add(new AirIndiaDTO("Vivek Ramesh", "Chennai", "Kuala Lumpur", "Chennai International Airport", "Kuala Lumpur International Airport", "India", "Malaysia", LocalDate.of(2024, 9, 21)));
        airIndiaDTOs.add(new AirIndiaDTO("Simran Kaur", "Delhi", "Vancouver", "Indira Gandhi International Airport", "Vancouver International Airport", "India", "Canada", LocalDate.of(2024, 10, 28)));
        airIndiaDTOs.add(new AirIndiaDTO("Gaurav Saxena", "Hyderabad", "Amsterdam", "Rajiv Gandhi International Airport", "Amsterdam Schiphol Airport", "India", "Netherlands", LocalDate.of(2024, 11, 2)));

        airIndiaDTOs.add(new AirIndiaDTO("Keerthi Rao", "Bengaluru", "Sydney", "Kempegowda International Airport", "Sydney Kingsford Smith Airport", "India", "Australia", LocalDate.of(2024, 12, 12)));
        airIndiaDTOs.add(new AirIndiaDTO("Omkar Kulkarni", "Mumbai", "Doha", "Chhatrapati Shivaji Maharaj International Airport", "Hamad International Airport", "India", "Qatar", LocalDate.of(2025, 1, 18)));
        airIndiaDTOs.add(new AirIndiaDTO("Lavanya Reddy", "Hyderabad", "New York", "Rajiv Gandhi International Airport", "John F. Kennedy International Airport", "India", "USA", LocalDate.of(2025, 2, 24)));
        airIndiaDTOs.add(new AirIndiaDTO("Rakesh Sharma", "Delhi", "Singapore", "Indira Gandhi International Airport", "Changi Airport", "India", "Singapore", LocalDate.of(2025, 3, 6)));
        airIndiaDTOs.add(new AirIndiaDTO("Aishwarya Nair", "Kochi", "Abu Dhabi", "Cochin International Airport", "Zayed International Airport", "India", "UAE", LocalDate.of(2025, 4, 11)));

        airIndiaDTOs.add(new AirIndiaDTO("Tejaswini Deshpande", "Nagpur", "Dubai", "Dr. Babasaheb Ambedkar International Airport", "Dubai International Airport", "India", "UAE", LocalDate.of(2025, 5, 17)));
        airIndiaDTOs.add(new AirIndiaDTO("Mohit Bansal", "Ahmedabad", "London", "Sardar Vallabhbhai Patel International Airport", "Heathrow Airport", "India", "UK", LocalDate.of(2025, 6, 22)));
        airIndiaDTOs.add(new AirIndiaDTO("Chaitra Gowda", "Bengaluru", "Bangkok", "Kempegowda International Airport", "Suvarnabhumi Airport", "India", "Thailand", LocalDate.of(2025, 7, 29)));
        airIndiaDTOs.add(new AirIndiaDTO("Ankit Tiwari", "Varanasi", "Sharjah", "Lal Bahadur Shastri International Airport", "Sharjah International Airport", "India", "UAE", LocalDate.of(2025, 8, 3)));
        airIndiaDTOs.add(new AirIndiaDTO("Sahana Murthy", "Mysuru", "Doha", "Mysore Airport", "Hamad International Airport", "India", "Qatar", LocalDate.of(2025, 9, 15)));

        airIndiaDTOs.add(new AirIndiaDTO("Rajesh Khanna", "Delhi", "Chicago", "Indira Gandhi International Airport", "O'Hare International Airport", "India", "USA", LocalDate.of(2025, 10, 20)));
        airIndiaDTOs.add(new AirIndiaDTO("Monika Arora", "Mumbai", "Hong Kong", "Chhatrapati Shivaji Maharaj International Airport", "Hong Kong International Airport", "India", "Hong Kong", LocalDate.of(2025, 11, 26)));
        airIndiaDTOs.add(new AirIndiaDTO("Abhishek Shetty", "Mangaluru", "Muscat", "Mangalore International Airport", "Muscat International Airport", "India", "Oman", LocalDate.of(2025, 12, 8)));
        airIndiaDTOs.add(new AirIndiaDTO("Pallavi Joshi", "Pune", "Paris", "Pune International Airport", "Charles de Gaulle Airport", "India", "France", LocalDate.of(2026, 1, 13)));
        airIndiaDTOs.add(new AirIndiaDTO("Darshan Patil", "Belagavi", "Dubai", "Belagavi Airport", "Dubai International Airport", "India", "UAE", LocalDate.of(2026, 2, 19)));

        System.out.println("Total Air India DTOs:" + airIndiaDTOs.size());

        System.out.println("==========addAll()==========");

        List<AirIndiaDTO> newAirIndiaDTOs = new ArrayList<>();

        newAirIndiaDTOs.add(new AirIndiaDTO("Ravi Kumar", "Delhi", "Dubai", "Indira Gandhi International Airport", "Dubai International Airport", "India", "UAE", LocalDate.of(2026, 3, 10)));
        newAirIndiaDTOs.add(new AirIndiaDTO("Anusha Shetty", "Bengaluru", "Singapore", "Kempegowda International Airport", "Changi Airport", "India", "Singapore", LocalDate.of(2026, 4, 15)));
        newAirIndiaDTOs.add(new AirIndiaDTO("Kiran Patil", "Mumbai", "London", "Chhatrapati Shivaji Maharaj International Airport", "Heathrow Airport", "India", "UK", LocalDate.of(2026, 5, 20)));

        System.out.println("Size before addAll:" + airIndiaDTOs.size());

        boolean addAllResult = airIndiaDTOs.addAll(newAirIndiaDTOs);

        System.out.println("Data added using addAll:" + addAllResult);
        System.out.println("Size after addAll:" + airIndiaDTOs.size());

        System.out.println("\n==========contains()==========");
        AirIndiaDTO checkDTO = new AirIndiaDTO("Rahul Sharma", "Delhi", "New York", "Indira Gandhi International Airport", "John F. Kennedy International Airport", "India", "USA", LocalDate.of(2022, 1, 5));

        boolean contains = airIndiaDTOs.contains(checkDTO);
        System.out.println("List contains Rahul Sharma data: " + contains);

        System.out.println("\n==========containsAll()==========");
        List<AirIndiaDTO> checkList = new ArrayList<>();

        checkList.add(new AirIndiaDTO("Rahul Sharma", "Delhi", "New York", "Indira Gandhi International Airport", "John F. Kennedy International Airport", "India", "USA", LocalDate.of(2022, 1, 5)));
        checkList.add(new AirIndiaDTO("Priya Patil", "Mumbai", "London", "Chhatrapati Shivaji Maharaj International Airport", "Heathrow Airport", "India", "UK", LocalDate.of(2022, 2, 12)));

        boolean containsAllResult = airIndiaDTOs.containsAll(checkList);

        System.out.println("Main list contains all checkList data:" + containsAllResult);

        System.out.println("\n==========removeAll()==========");

        System.out.println("Size before removeAll:" + airIndiaDTOs.size());

        boolean removeAllResult = airIndiaDTOs.removeAll(checkList);

        System.out.println("Data removed from main list:" + removeAllResult);
        System.out.println("Size after removeAll:" + airIndiaDTOs.size());

        System.out.println("\n==========listIterator() Forward==========");

        ListIterator<AirIndiaDTO> listIterator = airIndiaDTOs.listIterator();
        while (listIterator.hasNext()){
            AirIndiaDTO dto=listIterator.next();
            System.out.println(dto);
        }

        System.out.println("\n==========listIterator() Backward==========");
        while (listIterator.hasPrevious()){
            AirIndiaDTO dto = listIterator.previous();
            System.out.println(dto);
        }

        System.out.println("\n==========listIterator() from index 25==========");
        ListIterator<AirIndiaDTO> listIterator2 = airIndiaDTOs.listIterator(25);
        while (listIterator2.hasNext()){
            AirIndiaDTO dto = listIterator2.next();
            System.out.println(dto);
        }

        System.out.println("\n==========isEmpty()==========");
        boolean checkEmpty = airIndiaDTOs.isEmpty();
        System.out.println("List is empty:"+ checkEmpty);

        System.out.println("\n=========add at specific index=========");
        airIndiaDTOs.add(25, new AirIndiaDTO("Rohit Sharma", "Mumbai", "India", "Indira Gandhi International Airport", "John F. Kennedy International Airport", "India", "USA", LocalDate.of(2022, 1, 5)));
        System.out.println("Size after add at specific index:" + airIndiaDTOs.size());

        System.out.println("\n=========addAll at specific index=========");
        List<AirIndiaDTO> newAirIndiaDTOs2 = new ArrayList<>();
        newAirIndiaDTOs2.add(new AirIndiaDTO("Ashok Varma", "Hyderabad", "India", "Indira Gandhi International Airport", "John F. Kennedy International Airport", "India", "USA", LocalDate.of(2022, 1, 5)));
        newAirIndiaDTOs2.add(new AirIndiaDTO("Sneha Yadav", "Kochi", "India", "Indira Gandhi International Airport", "John F. Kennedy International Airport", "India", "USA", LocalDate.of(2022, 1, 5)));
        newAirIndiaDTOs2.add(new AirIndiaDTO("Amit Sharma", "Delhi", "India", "Indira Gandhi International Airport", "John F. Kennedy International Airport", "India", "USA", LocalDate.of(2022, 1, 5)));
        airIndiaDTOs.addAll(25, newAirIndiaDTOs2);
        System.out.println("Size after addAll at specific index:" + airIndiaDTOs.size());

        System.out.println("\n=========get mathod from List=========");
        System.out.println("Data at index 25:" + airIndiaDTOs.get(25));

        System.out.println("\n=========set method=========");
        airIndiaDTOs.set(25, new AirIndiaDTO("Shilpa Singh", "Panjab", "India", "Indira Gandhi International Airport", "John F. Kennedy International Airport", "India", "USA", LocalDate.of(2022, 1, 5)));
        System.out.println("Data at index 25 after set:" + airIndiaDTOs.get(25));

        System.out.println("\n=========indexOf method=========");
        int index = airIndiaDTOs.indexOf(new AirIndiaDTO("Shilpa Singh", "Panjab", "India", "Indira Gandhi International Airport", "John F. Kennedy International Airport", "India", "USA", LocalDate.of(2022, 1, 5)));
        System.out.println("Index of Shilpa Singh data:" + index);

        System.out.println("\n=========lastIndexOf method=========");
        int lastIndex = airIndiaDTOs.lastIndexOf(new AirIndiaDTO("Shilpa Singh", "Panjab", "India", "Indira Gandhi International Airport", "John F. Kennedy International Airport", "India", "USA", LocalDate.of(2022, 1, 5)));
        System.out.println("Last index of Shilpa Singh data:" + lastIndex);

        System.out.println("\n=========subList method=========");
        List<AirIndiaDTO> subList = airIndiaDTOs.subList(25, 30);
        System.out.println("SubList from index 25 to 30:" + subList);

        System.out.println("\n===========ListIterator(int index)============");
        ListIterator<AirIndiaDTO> listIterator3 = airIndiaDTOs.listIterator(25);
        while (listIterator3.hasNext()){
            AirIndiaDTO dto = listIterator3.next();
            System.out.println(dto);
        }

        System.out.println("\n===========clear method============");
        airIndiaDTOs.clear();
        System.out.println("Size after clear:" + airIndiaDTOs.size());

    }
}
