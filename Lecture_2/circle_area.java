package Lecture_2;

import java.util.*;
public class circle_area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius");
        int r=sc.nextInt();
        double pi=Math.PI;

        double area=pi*r*r;
        System.out.println("Radius of circle is : "+r);
        System.out.println("Area of circle is : "+area);
        sc.close();
    }
}
