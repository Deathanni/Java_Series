package Lecture_10;

import java.util.Scanner;

public class array_min_max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many numbers you want ?");
        int num=sc.nextInt();
        int arr[]=new int[num];

        System.out.println("Enter the numbers : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("The number are as follows :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        //to find minimum and maximum number
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The maximum value is : "+max);
        System.out.println("The minimum value is : "+min);
        sc.close();
    }
}
