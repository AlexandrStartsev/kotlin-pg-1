package edu.alex;

import edu.alex.subfolder.SomeKotlinClass;

public class Application {

    public static void main(String... args) {
        SomeKotlinClass test = new SomeKotlinClass("java");

        System.out.println(test.sum());
    }
}