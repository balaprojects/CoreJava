package com.java9.features.privatemethods;

public interface PrivateStaticMethod {

    static void makeCoffee() {
        getMilk();
        System.out.println("Add Coffee powder");
    }

    default void makeTea() {
        getMilk();
        System.out.println("Add Tea powder");
    }

    private static void getMilk() {
        System.out.println("Get the milk");
    }

}
