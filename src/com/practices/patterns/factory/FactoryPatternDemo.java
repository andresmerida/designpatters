package com.practices.patterns.factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("PC", "2 GB", "500 GB", "1.4 GHz");
        Computer server = ComputerFactory.getComputer("Server", "16 GB", "1 TB", "3 GHz");

        System.out.println("Factory PC config:: "+pc);
        System.out.println("Factory Server config:: "+server);

        System.out.println("");

        Shape shape1 = ShapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = ShapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}
