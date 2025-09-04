package Lecture_17;

import java.util.Scanner;

public class recursion_5to1 {

    public static void recursion_step(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        recursion_step(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        System.out.println("The number printed through recursion are : ");
        recursion_step(num);
        sc.close();
    }
}
