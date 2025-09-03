package Lecture_15;

import java.util.Scanner;

public class two_power_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if (num > 0 && (num & (num - 1)) == 0) {
            System.out.println("The following number is a power of 2");
        } else {
            System.out.println("The following number is NOT a power of 2");
        }

        sc.close();
    }
}
