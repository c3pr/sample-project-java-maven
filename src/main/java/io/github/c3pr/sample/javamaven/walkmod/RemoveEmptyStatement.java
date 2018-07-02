package io.github.c3pr.sample.javamaven.walkmod;

import io.github.c3pr.sample.javamaven.walkmod.support.Support;

public class RemoveEmptyStatement {

    public String removeEmptyStatement() {
        String yay = "yay";
        {
            {

            }
        }

        for (int i = 0; i < 42; i++){}

        if (yay.equals(new Support().someStringMethod())) {

        }
        ;
        ;
        ;
        ;

        return "" + yay;
    }

}
