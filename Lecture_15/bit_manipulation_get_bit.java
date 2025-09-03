package Lecture_15;

import java.util.Scanner;

public class bit_manipulation_get_bit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
        System.out.println("Enter the position");
        int position=sc.nextInt();

        int bitmask=1<<position;

        if((bitmask & num)==0) System.out.println("The bit was 0");
        else System.out.println("The bit was 1");
        sc.close();
    }
}
