package com.amit.java8.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by amit on 6/11/14.
 */
public class Excercise2 {

    public static void main(String[] args){

        /**
         * Given below is a implementation of Comparator using the old way. Implement it using the functional way.
         * Try to implement the for loop also using functional programming concepts.
         */
        // OOO Style
        Book book1 = new Book("Hands On Java", "Java");
        Book book2 = new Book("Hands On dotNet", ".Net");
        Book book3 = new Book("Hands On Python", "Python");
        Book book4 = new Book("Hands On PHP", "PHP");

        List<Book> booksOldWay = Arrays.asList(book1, book2, book3, book4);

        System.out.println("OOO way....");
        Collections.sort(booksOldWay, new Comparator<Book>() {
            public int compare(Book b1, Book b2) {
                return b1.getTechnology().compareTo(b2.getTechnology());
            }
        });

        for(Book book: booksOldWay) {
            System.out.println(book);
        }

        System.out.println("Functional programming way....");

        Comparator<Book> comp = (b1, b2) -> b1.getTechnology().compareTo(b2.getTechnology());

        // Lambda Style
        booksOldWay.stream()
                .sorted(comp)
                .forEach(name -> System.out.println(name));

    }


}
