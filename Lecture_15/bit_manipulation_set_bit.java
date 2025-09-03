package Lecture_15;

import java.util.Scanner;

public class bit_manipulation_set_bit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        System.out.println("Enter the postion to set :");
        int pos=sc.nextInt();

        int bitmask=1<<pos;
        int newNum=bitmask|n;

        System.out.println("The new number after  performing set bit at position "+pos+" is : "+newNum);
        sc.close();
    }
}
