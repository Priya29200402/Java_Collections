package org.intejjiJ.methods.runner;

import javafx.print.Collation;
import org.intejjiJ.methods.dto.BookDTO;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BookRunner {
    public static void main(String[] args) {
        List<BookDTO> books = new LinkedList<>();
        books.add(new BookDTO("Master Your Emotions", 150));
        books.add(new BookDTO("PathFinder", 700));
        books.add(new BookDTO("How to Win Friends and Influence People", 180));
        books.add(new BookDTO("The 7 Habits of Highly Effective People", 250));
        books.add(new BookDTO("The Power of Now", 300));
        books.add(new BookDTO("Atomic Habits", 200));

        Collections.sort(books);
        books.forEach(bookDTO -> System.out.println(bookDTO));
    }
}
