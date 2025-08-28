package Lecture_7;

import java.util.*;
public class product_function {
    public static int product(int a, int b) {
        int mul=a*b;
        System.out.print(mul);
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print("The product is : ");
        product(a, b);
        sc.close();
    }
}
