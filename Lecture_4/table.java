package Lecture_4;

import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("which number table you want");
        int n=sc.nextInt();
        sc.close();

        for (int i = 1; i <=10; i++) {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}
