package Lecture_17;

import java.util.Scanner;

public class recursion_1to5_easy {

    public static void recursion_step(int start, int end) {
        if(start==end+1){
            return;
        }
        System.out.print(start+" ");
        recursion_step(start+1, end);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=sc.nextInt();
        recursion_step(1, num);
        sc.close();
    }
}
