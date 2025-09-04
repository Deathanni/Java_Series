package Lecture_16;

import java.util.Scanner;

public class bubble_sort {

    public static void printArray(int arr[]){
        System.out.println("The array after bubble sort is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many numbers you want to enter :");
        int num=sc.nextInt();
        int arr[]=new int[num];

        System.out.println("Enter the numbers : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            }
        }
        printArray(arr);
        sc.close();
    }
}
