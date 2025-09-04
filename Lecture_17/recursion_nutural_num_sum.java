package Lecture_17;

import java.util.Scanner;

public class recursion_nutural_num_sum {

    public static int naturalNumberSum(int num) {
        if (num==1) {
            return 1;
        }
        return num+naturalNumberSum(num-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        System.out.println("The num of the number is : "+ naturalNumberSum(num) );
        sc.close();
    }
}
