package Lecture_12;

import java.util.Scanner;

public class String_basics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        System.out.println("Your string is : "+str);
        sc.close();
    }
}
