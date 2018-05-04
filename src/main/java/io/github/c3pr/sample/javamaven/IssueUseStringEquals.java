package io.github.c3pr.sample.javamaven;

public class IssueUseStringEquals {

    public static void main(String[] args) {
        String str1 = "blue";
        String str2 = new String("blue");
        String str3 = str1;


        //region COVERED BY CURRENT sonar:UseStringEquals
        if (str1 == "blue") {
            System.out.println("they're both 'blue' 2"); // this prints
        }
        if (str2 == "blue") {
            System.out.println("they're both 'blue' 3"); // this doesn't print because the objects are different
        }
        //endregion

        //region NOT covered by current sonar:UseStringEquals
        if (str1 != "blue") {
            System.out.println("they're both 'blue' 2"); // this prints
        }
        if (str2 != "blue") {
            System.out.println("they're both 'blue' 3"); // this doesn't print because the objects are different
        }
        if (str1 == str2) {
            System.out.println("they're both 'blue' 1"); // this doesn't print because the objects are different
        }
        if (str1 == str3) {
            System.out.println("they're the same object"); // this prints
        }
        //endregion
    }

}
