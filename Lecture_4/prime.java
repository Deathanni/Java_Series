package Lecture_4;

import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        sc.close();
        int count=1;

        for (int i = 2; i <=n/2; i++) {
            if(n%i==0){
                count++;
            }
        }
        if(count>1){
            System.out.println("Not a prime number");
        }
        else{
            System.out.println("Prime number");
        }
    }
}
