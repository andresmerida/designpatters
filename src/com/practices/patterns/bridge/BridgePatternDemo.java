package com.practices.patterns.bridge;

public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape triangle = new Triangle(new RedColor());
        triangle.applyColor();

        Shape pentagono = new Pentagon(new GreenColor());
        pentagono.applyColor();
    }
}
