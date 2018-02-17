package io.github.c3pr.sample.javamaven;

public class Main {

    public static void main(String[] args) {
        String someString = args[0];
        // changing one more time!
        if (someString.equals("a string at the right-hand side")) {
            System.out.println("Equals...");
        } else System.out.println("Else without braces");
    }

}
