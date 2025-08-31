package Lecture_10;

import java.util.Scanner;

public class array_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int len=sc.nextInt();
        int arr[]=new int[len];

        System.out.println("Enter the numbers in the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("The number in the array are as follows :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
