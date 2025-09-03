package Lecture_15;

import java.util.Scanner;

public class count_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int count = 0;

        while (num > 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num=num>>1;
        }
        System.out.println("The number of 1 in the number is : " + count);

        sc.close();
    }
}
