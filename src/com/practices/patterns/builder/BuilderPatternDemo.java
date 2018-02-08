package com.practices.patterns.builder;

/**
 * Builder pattern solves the issue with large number of optional parameters and inconsistent state
 * by providing a way to build the object step-by-step and provide a method that will actually return the final Object.
 *
 * Ref: https://www.journaldev.com/1425/builder-design-pattern-in-java
 *
 * @author Created by andresmerida on 02/06/2018 mm/dd/yyyy
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues
        Computer computer = new Computer.ComputerBuilder("500 GB", "4 GB")
                .setGraphicsCardEnabled(true).setBluetoothEnabled(true).build();

        System.out.println("Builder:: "+computer.toString());
    }
}
