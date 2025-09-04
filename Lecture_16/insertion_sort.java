package Lecture_16;

import java.util.Scanner;

public class insertion_sort {

    public static void printArray(int arr[]){
        System.out.println("The array after insertion sort is : ");
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

        for (int i = 1; i < arr.length; i++) {
            int j=i-1;
            int current=arr[i];

            while (j>=0 && current<arr[j]) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }

        printArray(arr);
        sc.close();
    }
}
