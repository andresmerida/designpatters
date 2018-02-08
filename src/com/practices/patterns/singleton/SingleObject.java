package com.practices.patterns.singleton;

/**
 * The SingleObject class implement a basic example to show Singleton pattern
 * If your singleton class is not using a lot of resources, this is the approach to use
 * @author created by andresmerida on 02/05/2018
 */
public class SingleObject {
    // create an object of single
    private static SingleObject instance = new SingleObject();

    // make the constructor private so that this class cannot be instantiated
    private SingleObject() {}

    // get the only object available
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Message from SingleObject...");
    }
}
