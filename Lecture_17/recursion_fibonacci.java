package Lecture_17;

import java.util.Scanner;

public class recursion_fibonacci {

    public static void fibonacciCalculator(int a, int b, int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.print(c+" ");
        fibonacciCalculator(b, c, n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        System.out.print("0 ");
        System.out.print("1 ");
        fibonacciCalculator(0, 1, num);
        sc.close();
    }
}
