package Lecture_4;

import java.util.*;
public class n_natural_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the last natural number");
        int n=sc.nextInt();
        sc.close();

        for (int i = 1; i <=n; i++) {
            System.out.print(i+" ");
        }
    }
}
