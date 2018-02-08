package com.practices.patterns.singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {}

    // Below code snippet provides the double checked locking implementation.
    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }

        return instance;
    }

    public void showMessage() {
        System.out.println("Message from ThreadSafeSingleton class...");
    }
}
