package Lecture_10;

import java.util.Scanner;

public class array_name_entry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("How many names you want to enter ?");
         int num=sc.nextInt();
         String arr[]=new String[num];
         System.out.println("Enter the names :");
         for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextLine();
         }

         System.out.println();
         System.out.println("The names are as follows :");
         for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
         }
        sc.close(); 
    }
}
