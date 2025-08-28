package Lecture_7;

import java.util.*;
public class even_odd_function {

    public static void checkeven(int a){
        if(a%2==0){
            System.out.println(a+" : is even number");
        }
        else{
            System.out.println(a+" : is odd number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        checkeven(n);
        sc.close();
    }
}
