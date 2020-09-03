package com.java9.features.trywithresources;

public class Test {

    public static void main(String[] args) {
        MyResource myResource = new MyResource();
        try(myResource) {
            myResource.doSomething();
        } catch (Exception e) {

        }
    }

}
