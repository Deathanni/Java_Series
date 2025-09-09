package Lecture_17;

import java.util.Scanner;

public class recursion_sorted_array {

    public static boolean checkSortArray(int arr[],int length){
        
        if(length<=0){
            return true;
        }
        
        if(arr[length]>arr[length-1]){
            return checkSortArray(arr, length-1);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Whats the length of the array ?");
        int len=sc.nextInt();
        int arr[]=new int[len];
        System.out.println("Enter the elements in the array");

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }    

        boolean result=checkSortArray(arr, len-1);
        if(result==true) System.out.println("YES! the array is strictly increasing");
        else  System.out.println("NO! the array is not strictly increasing");
        sc.close();
    }
}
