package io.github.c3pr.sample.javamaven.walkmod;

import io.github.c3pr.sample.javamaven.walkmod.support.Support;

public class AddCurlyBrackets {

    public String addCurlyBrackets(String yay) {

        if (yay.equals(new Support().someStringMethod())) System.out.println("hello");

        return "" + yay;
    }

}
