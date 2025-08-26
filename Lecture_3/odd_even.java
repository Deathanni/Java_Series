package Lecture_3;

import java.util.*;
public class odd_even {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number : ");
    int num=sc.nextInt();
    sc.close();

    if (num%2==0)
        System.out.println(num+" is even number");
    else
        System.out.println(num+ " is odd number");
   } 
}
