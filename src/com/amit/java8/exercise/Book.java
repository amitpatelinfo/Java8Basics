package com.amit.java8.exercise;

/**
 * Created by amit on 6/11/14.
 */
public class Book {

    String name;
    String technology;

    public Book(String name, String technology) {
        this.name = name;
        this.technology = technology;
    }
    public String getName() {
        return name;
    }
    public String getTechnology() {
        return technology;
    }

    public String toString() {
        return technology + ": "+ name;
    }

}
