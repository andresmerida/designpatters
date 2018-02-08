package com.practices.patterns.prototype;

import java.util.List;

public class PrototypePatternDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        // First example
        Employees employees = new Employees();
        employees.loadData();

        //Use the clone method to get the Employee object
        Employees employees1 = (Employees) employees.clone();
        Employees employees2 = (Employees) employees.clone();

        List<String> list1 = employees1.getEmpList();
        list1.add("Fabian");

        List<String> list2 = employees2.getEmpList();
        list2.remove("Liz");

        System.out.println("employees list:: "+employees.getEmpList());
        System.out.println("employees1 list:: "+employees1.getEmpList());
        System.out.println("employees2 list:: "+employees2.getEmpList());

        // Second example

        // PrototypePatternDemo uses ShapeCache class to get clones of shapes stored in a Hashtable.
        ShapeCache.loadCache();
        System.out.println("");
        System.out.println("===== second example =====");
        System.out.println("");

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape: " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());

    }
}
