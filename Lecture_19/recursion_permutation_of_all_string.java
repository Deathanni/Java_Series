//package Lecture_19;

public class recursion_permutation_of_all_string {
    public static void printPerm(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);

            // remove currChar from str
            String newStr = str.substring(0, i) + str.substring(i + 1);

            // call recursion with reduced string
            printPerm(newStr, permutation + currChar);
        }
    }

    public static void main(String args[]) {
        String str = "abc";
        printPerm(str, "");
    }
}
