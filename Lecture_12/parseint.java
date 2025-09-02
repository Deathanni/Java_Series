package Lecture_12;

import java.util.Scanner;

public class parseint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        String str=sc.nextLine();

        int num=Integer.parseInt(str);
        System.out.println("The number is: "+num);

        System.out.println("Enter a number");
        int no=sc.nextInt();
        String number=Integer.toString(no);
        System.out.println("The string is : "+number);
        sc.close();
    }
}
