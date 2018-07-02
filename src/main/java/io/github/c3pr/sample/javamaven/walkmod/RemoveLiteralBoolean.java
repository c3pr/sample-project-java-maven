package io.github.c3pr.sample.javamaven.walkmod;

import java.util.Date;

public class RemoveLiteralBoolean {

    public void removeLiteralBoolean() {
        if (booleanMethod() == true) { /* ... */ }
        if (booleanMethod() == false) { /* ... */ }
        if (booleanMethod() || false) { /* ... */ }
        doSomething(!false);
        doSomething(booleanMethod() == true);

        boolean booleanVariable = booleanMethod();

        booleanVariable = booleanMethod() ? true : false;
        booleanVariable = booleanMethod() ? true : booleanMethod();
        booleanVariable = booleanMethod() ? false : booleanMethod();
        booleanVariable = booleanMethod() ? booleanMethod() : true;
        booleanVariable = booleanMethod() ? booleanMethod() : false;
    }

    private void doSomething(boolean b) {

    }

    private boolean booleanMethod() {
        return new Date() != new Date();
    }

}
