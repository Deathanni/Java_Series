package Lecture_3;

import java.util.*;
public class comparison {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first value ");
        int num1=sc.nextInt();
        System.out.println("Enter Second value ");
        int num2=sc.nextInt();
        sc.close();

        if(num1==num2){
            System.out.println(num1+" == "+num2);
        }
        else if (num1>num2) {
            System.out.println(num1+" > "+num2);
        }
        else{
            System.out.println(num1+" < "+num2);
        }
    }
}
