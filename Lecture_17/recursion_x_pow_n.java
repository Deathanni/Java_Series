package Lecture_17;

import java.util.Scanner;

public class recursion_x_pow_n {

    public static int powerCalculator(int n, int pow){
        if(pow==0){
            return 1;
        }
        return n*powerCalculator(n, pow-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Enter the power of the number");
        int pow=sc.nextInt();

        int result=powerCalculator(n, pow);;
        System.out.println(result);
        sc.close();
    }
}
