package com.java9.features.trywithresources;

public class MyResource implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Closing MyResource");
    }

    public void doSomething() {
        System.out.println("Do Something..");
    }

}
