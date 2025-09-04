package Lecture_17;

import java.util.Scanner;

public class recursion_factorial {

    public static int factorial(int num){
        if (num==1|| num==0){
            return 1;
        }
        return num * factorial(num-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        System.out.println("The factorial of teh number "+num+" is : "+factorial(num));
        sc.close();
    }
}
