package com.practices.patterns.singleton;

/**
 * Bill Pugh Singleton Implementation
 * Prior to Java 5, java memory model had a lot of issues and above approaches used to fail in certain scenarios
 * where too many threads try to get the instance of the Singleton class simultaneously.
 * So Bill Pugh came up with a different approach to create the Singleton class using a inner static helper class.
 * The Bill Pugh Singleton implementation goes like this;
 *
 * This is the most widely used approach for Singleton class as it doesn’t require synchronization.
 * I am using this approach in many of my projects and it’s easy to understand and implement also.
 *
 * @author Created by andresmerida on 05/02/2018
 */
public class BillPughSingleton {

    private BillPughSingleton() {}

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void showMessage() {
        System.out.println("Message from BillPughSingleton class...");
    }
}
