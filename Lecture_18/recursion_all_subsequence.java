package Lecture_18;

import java.util.Scanner;

public class recursion_all_subsequence {

    public static void allSubsequences(String str,int index, String newString){
        if(index==str.length()){
            System.out.println(newString);
            return;
        }
        char currentchar=str.charAt(index);
        allSubsequences(str, index+1, newString+currentchar);
        allSubsequences(str, index+1, newString);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        System.out.println("The new strings are : ");
        allSubsequences(str, 0, "");
        sc.close();
    }
}
