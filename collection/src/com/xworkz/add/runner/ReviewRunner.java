package com.xworkz.add.runner;

import com.xworkz.add.dto.ReviewDTO;
import java.util.*;

public class ReviewRunner {
    public static void main(String[] args) {
        ReviewDTO review1 = new ReviewDTO(1, 101, 1, 5, "Excellent product, highly recommended!");
        ReviewDTO review2 = new ReviewDTO(2, 102, 2, 4, "Good quality, fast delivery");
        ReviewDTO review3 = new ReviewDTO(3, 103, 3, 3, "Average product, meets expectations");
        ReviewDTO review4 = new ReviewDTO(4, 104, 4, 5, "Amazing! Will buy again");
        ReviewDTO review5 = new ReviewDTO(5, 105, 5, 2, "Not as described, disappointed");

        Collection<ReviewDTO> reviewDTOS = new ArrayList<>(15);
        reviewDTOS.add(review1);
        reviewDTOS.add(review2);
        reviewDTOS.add(review3);
        reviewDTOS.add(review4);
        reviewDTOS.add(review5);

        Collection<ReviewDTO> reviewDTOS1 = new LinkedList<>();
        reviewDTOS1.add(review1);
        reviewDTOS1.add(review2);
        reviewDTOS1.add(review3);
        reviewDTOS1.add(review4);
        reviewDTOS1.add(review5);

        Collection<ReviewDTO> reviewDTOS2 = new HashSet<>(12);
        reviewDTOS2.add(review1);
        reviewDTOS2.add(review2);

        Collection<ReviewDTO> reviewDTOS3 = new TreeSet<>();
        reviewDTOS3.add(review1);
        reviewDTOS3.add(review5);

        System.out.println("Total reviews in ArrayList:"+ reviewDTOS.size());
        System.out.println("Total reviews in LinkedList:"+ reviewDTOS1.size());
        System.out.println("Total reviews in HashSet:"+ reviewDTOS2.size());
        System.out.println("Total reviews in TreeSet:"+ reviewDTOS3.size());
    }
}
