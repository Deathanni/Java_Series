package Lecture_7;

import java.util.*;
public class prime_function {

    public static boolean primecheck(int a){
        boolean isprime=true;
        if(a==1){
            isprime=false;
        }
        for (int i = 2; i <=a/2; i++) {
            if(a%i==0){
                isprime=false;
            }
        }
        return isprime;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        boolean n=primecheck(num);
        if(n==true){
            System.out.println(num+" is prime");
        }
        else{
            System.out.println(num+" is not prime");
        }
        sc.close();
    }
}
