package Lecture_12;

import java.util.Scanner;

public class array_string_total_len {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=sc.nextInt();
        String arr[]=new String[size];
        int total_length=0;

        System.out.println("Enter the strings");{
            for (int i = 0; i < arr.length; i++) {
                arr[i]=sc.nextLine();
                total_length+=arr[i].length();
            }
        }

        System.out.println("The total length of all the characters in the array are : "+total_length);
        sc.close();
    }
}
