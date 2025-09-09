package Lecture_18;

import java.util.Scanner;

public class recursion_remove_duplicate {
    public static boolean duplicate[] = new boolean[26];

    public static void removeDuplicate(String str, int index, String newString) {
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(index);
        if (duplicate[currentChar - 'a'] == true) {
            removeDuplicate(str, index + 1, newString);
        } else {
            newString += currentChar;
            duplicate[currentChar - 'a'] = true;
            removeDuplicate(str, index + 1, newString);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        removeDuplicate(str, 0, "");
        sc.close();
    }
}
