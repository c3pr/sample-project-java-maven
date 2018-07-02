package io.github.c3pr.sample.javamaven.walkmod;

import io.github.c3pr.sample.javamaven.walkmod.support.Support;

public class RemoveUselessVariables {

    public String removeUselessVariables(Support support) {
        String uselessVariableOne = "value";
        String uselessVariableTwo = support.someStringMethod();
        String uselessVariableThree = "value";

        return "" + uselessVariableOne;
    }

}
