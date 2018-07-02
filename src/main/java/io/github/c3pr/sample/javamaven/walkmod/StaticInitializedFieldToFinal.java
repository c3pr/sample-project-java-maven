package io.github.c3pr.sample.javamaven.walkmod;

public class StaticInitializedFieldToFinal {

    public static String thisVariableWillBeFinal = "Some Value";

    public String something() {
        return "" + thisVariableWillBeFinal;
    }

}
