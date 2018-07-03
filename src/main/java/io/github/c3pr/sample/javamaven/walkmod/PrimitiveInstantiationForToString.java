package io.github.c3pr.sample.javamaven.walkmod;

public class PrimitiveInstantiationForToString {

    public String primitiveInstantiationForToString(int myInt) {
        new Integer(myInt).toString();
        new Integer(myInt+"").toString();

        return "" + myInt;
    }

}
