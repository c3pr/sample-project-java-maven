package io.github.c3pr.sample.javamaven.walkmod;

public class StaticInitializedFieldToFinal {

    public static String bobNelson = "Bob Nelson";

    public String something() {
        bobNelson += "bobz";
        return "" + bobNelson;
    }

}
