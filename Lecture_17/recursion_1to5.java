package Lecture_17;

import java.util.Scanner;

public class recursion_1to5 {
    public static void recursion_step(int start, int end) {
        if (start <= end) {
            System.out.print(start + " ");
            recursion_step(start + 1, end);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last number : ");
        int end = sc.nextInt();
        recursion_step(1, end);
        sc.close();
    }
}
