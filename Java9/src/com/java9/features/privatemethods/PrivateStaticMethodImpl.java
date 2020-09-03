package com.java9.features.privatemethods;

public class PrivateStaticMethodImpl implements PrivateStaticMethod {

    public static void main(String[] args) {
        PrivateStaticMethod privateStaticMethod = new PrivateStaticMethodImpl();
        PrivateStaticMethod.makeCoffee();
        privateStaticMethod.makeTea();
    }
}
