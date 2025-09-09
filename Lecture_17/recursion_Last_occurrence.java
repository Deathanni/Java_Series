package Lecture_17;

import java.util.Scanner;

public class recursion_Last_occurrence {
    
    public static int first=-1;
    public static int last=-1;

    public static void lastOccurence(String str, int index,char element){
        if(index==str.length()){
            System.out.println("First time occurence is : "+first);
            System.out.println("Last time occurence is : "+last);
            return;
        }
        char currentChar=str.charAt(index);
        if(currentChar==element){
            if(first==-1){
                first=index;
            }
            else{
                last=index;
            }
        }
        lastOccurence(str, index+1, element);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str=sc.nextLine();
        System.out.println("Enter the character you want to find");
        char ch=sc.nextLine().charAt(0);

        lastOccurence(str, 0, ch);
        sc.close();
    }
}
