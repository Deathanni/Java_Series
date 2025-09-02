package Lecture_12;

import java.util.Scanner;

public class replace_char1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        String result="";
        System.out.println("What charater you want to replace ?");
        char ch=sc.next().charAt(0);
        System.out.println("Enter the new character to replace");
        char ch1=sc.next().charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==ch){
                result=result+ch1;
            }
            else{
                result=result+str.charAt(i);
            }
        }

        System.out.println("The result is : "+result);
        sc.close();
    }
}
