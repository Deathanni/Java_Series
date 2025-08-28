package Lecture_7;

import java.util.*;
public class table_function {

    public static void printTable(int a){
        for (int i = 1; i <=10; i++) {
            System.out.println(a+" * "+i+" = "+i*a);
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the table number : ");
        int n=sc.nextInt();
        printTable(n);
        sc.close();
    }
}
