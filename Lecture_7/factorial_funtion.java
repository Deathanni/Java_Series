package Lecture_7;

import java.util.*;
public class factorial_funtion {

    public static void printfactorial(int n){
         if(n < 0) {
           System.out.println("Invalid Number");
           return;
       }
       int fact=1;
        for (int i =n; i>=1; i--) {
            fact*=i;
        }
        System.out.println("The factorial of "+n+" is :"+fact);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        printfactorial(n);
        sc.close();
    }
}
