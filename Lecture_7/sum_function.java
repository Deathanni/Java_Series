package Lecture_7;

import java.util.*;
public class sum_function {

    public static int sum(int a, int b) {
        int add=a+b;
        System.out.print(add);
        return add;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print("The sum is : ");
        sum(a, b);
        sc.close();
    }
}
