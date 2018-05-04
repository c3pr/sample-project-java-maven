package io.github.c3pr.sample.javamaven;

public class IssueUseStringEquals {

    public static void main(String[] args) {
        String strOne = "blue";
        String strTwo = new String("blue");


        //region COVERED BY CURRENT sonar:UseStringEquals
        if (strOne == "blue") {
            System.out.println("strOne is \"blue\""); // prints
        }
        if (strTwo == "blue") {
            System.out.println("strTwo is \"blue\""); // DOESN'T print
        }
        if (strOne != "blue") {
            System.out.println("strOne is not \"blue\""); // prints
        }
        if (strTwo != "blue") {
            System.out.println("strTwo is not \"blue\""); // DOESN'T print
        }
        //endregion

        //region NOT covered by current sonar:UseStringEquals
        String strThree = strOne;
        if (strOne == strTwo) {
            System.out.println("comparing two string references, not one string reference and one literal");
        }
        //endregion
    }

}
