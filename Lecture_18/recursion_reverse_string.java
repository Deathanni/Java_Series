package Lecture_18;

import java.util.Scanner;

public class recursion_reverse_string {
    public static void reverseString(String str, int index) {
        if(index==0){
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        reverseString(str, index-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        reverseString(str, str.length()-1);
        sc.close();
    }
}
