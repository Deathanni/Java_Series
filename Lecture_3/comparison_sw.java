package Lecture_3;

import java.util.*;
public class comparison_sw {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Namaste, 2 for Hello, 3 for Bonjour ");
        int ch=sc.nextInt();
        sc.close();

        switch (ch) {
            case 1:
                System.out.println("Namaste!");
                break;
            case 2:
                System.out.println("Hello");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
        
            default:
                System.out.println("Invalid Input");
                break;
        }

    }
}
