package io.github.c3pr.sample.javamaven;

public class Main {

    public static void main(String[] args) {
        String someString = args[0];
        // trigger
        if ("a string at the right-hand side".equals(someString)) {
            System.out.println("Equals...");
        } else System.out.println("Else without braces");
    }

}
