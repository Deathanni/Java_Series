package Lecture_12;

import java.util.Scanner;

public class string_function {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string");
        String str1=sc.nextLine();
        System.out.println("Enter first string");
        String str2=sc.nextLine();

        String con=str1+" "+str2;
        System.out.println("String after concatenation is : " +con);
        System.out.println("Length if the string after concatenation is : "+con.length());
        System.out.println("The character at 3 position is : "+con.charAt(2));
        if(str1.compareTo(str2)==0) System.out.println("String are same");
        else System.out.println("Strings are different");
        System.out.println("The substring from 3 to 8 is : "+con.substring(3, 8));
        sc.close();
    }
}
