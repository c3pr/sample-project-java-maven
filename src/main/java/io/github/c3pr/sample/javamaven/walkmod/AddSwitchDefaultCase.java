package io.github.c3pr.sample.javamaven.walkmod;

public class AddSwitchDefaultCase {

    public String addSwitchDefaultCase(String yay) {

        switch (yay) {
            case "one": System.out.println(1); break;
            case "two": System.out.println(2); break;
        }

        return "" + yay;
    }

}
