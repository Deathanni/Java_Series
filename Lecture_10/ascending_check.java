package Lecture_10;

import java.util.Scanner;

public class ascending_check {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number you want :");
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.println("Enter the numbers : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        // check ascedending
        boolean asc=true;

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                asc=false;
                break;
            }
        }
        if(asc)
            System.out.println("Yes! its in ascending order");
        else
            System.out.println("No! its not in ascending order");

    sc.close();
    }
}
