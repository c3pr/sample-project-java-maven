package io.github.c3pr.sample.javamaven.walkmod;

public class IssueUseStringEquals {

    public static void main(String[] args) {
        String blueHardcoded = "blue";
        String blueViaConstructor = new String("blue");


        //region COVERED BY CURRENT sonar:UseStringEquals
        if (blueHardcoded == "blue") {
            System.out.println("blueHardcoded is \"blue\""); // prints
        }
        if (blueViaConstructor == "blue") {
            System.out.println("blueViaConstructor is \"blue\""); // DOESN'T print
        }
        if (blueHardcoded != "blue") {
            System.out.println("blueHardcoded is not \"blue\""); // DOESN'T print
        }
        if (blueViaConstructor != "blue") {
            System.out.println("blueViaConstructor is not \"blue\""); // prints
        }
        //endregion

        //region NOT covered by current sonar:UseStringEquals
        if (blueHardcoded == blueViaConstructor) {
            System.out.println("comparing two string references, not one string reference and one literal");
        }
        //endregion
    }

}
