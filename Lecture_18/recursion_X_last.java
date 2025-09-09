package Lecture_18;

import java.util.Scanner;

public class recursion_X_last {

    public static String movingX(String str,int index,char character){
        if(index==str.length()){
            return"";
        }
        char currectChar=str.charAt(index);
        if(currectChar==character){
            return movingX(str, index+1, character) +currectChar;
        }
        else{
            return currectChar + movingX(str, index+1, character);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str=sc.nextLine();
        System.out.println("What character you want to push to last?");
        char ch=sc.nextLine().charAt(0);

        String result =movingX(str, 0, ch);
        System.out.println("The string after modification is : "+result);
        sc.close();
    }
}
