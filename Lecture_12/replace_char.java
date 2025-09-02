package Lecture_12;

import java.util.Scanner;

public class replace_char {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sting :");
        String str=sc.nextLine();

        System.out.println("What character you want to replace?");
        char ch=sc.next().charAt(0);
        System.out.println("Enter the character you want to replace with :");
        char ch1=sc.next().charAt(0);

        System.out.println(str.replace(ch,ch1));

        sc.close();
    }
}
