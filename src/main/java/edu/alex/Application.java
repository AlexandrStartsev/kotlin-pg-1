package edu.alex;

import edu.alex.subfolder.SomeKotlinClass;
import edu.alex.subfolder.SomeKotlinInterface;
import org.jetbrains.annotations.NotNull;

public class Application {

    public static void main(String... args) {
        SomeKotlinClass test = new SomeKotlinClass(new SomeKotlinInterface() {
            @NotNull
            @Override
            public String foo() {
                return "java";
            }

            @NotNull
            @Override
            public String foo2(@NotNull String a) {
                return a + " + java";
            }
        });

        System.out.println(test.report2());
    }
}