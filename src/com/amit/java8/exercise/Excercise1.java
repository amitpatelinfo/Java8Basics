package com.amit.java8.exercise;

/**
 * Created by amit on 6/11/14.
 */
public class Excercise1 {

    public static void main(String[] args){

        /**
         * Given below is an implementation of Runnable interface using the pre-functional way.
         * Convert it using functional features of Java 8. Also change the message appropriately.
         */
        // OOO Style
        Runnable runOldWay = new Runnable() {
            @Override
            public void run() {
                System.out.println("Basics: runnable exercise using the old way");
            }
        };
        runOldWay.run();


        // Lambda Style
        Runnable task = () -> System.out.println("Hey I am running using Lambda style...");
        task.run();

    }


}
