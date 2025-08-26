package Lecture_4;

import java.util.*;
public class for_0_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number till which you want the loop to run starting from 0");
        int n=sc.nextInt();
        sc.close();

        for (int i = 0; i <=n; i++) {
            System.out.print(i+" ");
        }
    }
}
