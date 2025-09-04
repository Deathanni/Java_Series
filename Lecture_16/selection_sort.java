package Lecture_16;

import java.util.Scanner;

public class selection_sort {

    public static void printArray(int arr[]){
        System.out.println("The array after Selection sort is : ");
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
            int smallest=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;
        }
        printArray(arr);

        sc.close();
    }
}
