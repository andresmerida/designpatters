package com.practices.patterns.singleton;

/**
 * In this class we are going to show Singleton pattern in java
 *
 * Singleton pattern restricts the instantiation of a class and ensures that
 * only one instance of the class exists in the java virtual machine.
 *
 * The singleton class must provide a global access point to get the instance of the class.
 *
 * Singleton pattern is used for logging, drivers objects, caching and thread pool.
 *
 * Singleton design pattern is also used in other design patterns like Abstract Factory,
 * Builder, Prototype, Facade etc.
 *
 * Singleton design pattern is used in core java classes also, for example java.lang.Runtime, java.awt.Desktop
 *
 * references:
 * https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
 * https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm
 *
 * @author Created by andresmerida on 05/02/2018
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {
        // If your singleton class is not using a lot of resources, this is the approach to use.
        SingleObject.getInstance().showMessage();

        // thread-safety for singleton
        ThreadSafeSingleton.getInstance().showMessage();

        // if you are using many resources in the singleton and it needs to be thread-safe
        // this is the best way to implement singleton
        BillPughSingleton.getInstance().showMessage();
    }
}
