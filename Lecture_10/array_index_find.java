package Lecture_10;

import java.util.Scanner;

public class array_index_find {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements in the array");

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("You array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println("Which number index you want to find? ");
        int num=sc.nextInt();

        int index=-1;
        for (int i = 0; i < arr.length; i++) {
            if(num==arr[i]){
                index=i;
                break;
            }
        }

        if(index>-1){
            System.out.println("The index of "+ num +" is : "+index);
        }
        else{
            System.out.println("Number not in the array!");
        }
        sc.close();
    }
}
