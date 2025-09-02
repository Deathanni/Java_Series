package Lecture_12;

import java.util.Scanner;

public class email_username {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you email");
        String email=sc.nextLine();
        String username="";

        for (int i = 0; i < email.length(); i++) {
            if(email.charAt(i)!='@'){
                username=username+email.charAt(i);
            }
            else{
                break;
            }
        }
        System.out.println("The username is : "+ username);
        sc.close();
    }
}
