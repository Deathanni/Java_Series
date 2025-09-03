package Lecture_15;

import java.util.Scanner;

public class toggle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();

        System.out.println("Enter the position");
        int pos=sc.nextInt();

        int bitMask=1<<pos;
        int result=num^bitMask;

        System.out.println(result);
    }
}
