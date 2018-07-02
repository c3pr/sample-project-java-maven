package io.github.c3pr.sample.javamaven.walkmod;

import io.github.c3pr.sample.javamaven.walkmod.support.Support;

public class RemoveEmptyStatement {

    public String removeEmptyStatement() {
        String yay = "yay";
        {
            {

            }
        }

        return "" + yay;
    }

}
