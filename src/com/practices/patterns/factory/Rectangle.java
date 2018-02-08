package com.practices.patterns.factory;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside rectangle:: draw() method.");
    }
}
