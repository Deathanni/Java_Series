package Lecture_3;
import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number :");
        int a=sc.nextInt();
        System.out.println("Enter Secound number :");
        int b=sc.nextInt();
        System.out.println("1 add\n2 sub \n3 mul \n4 div \n5 rem");
        int ch=sc.nextInt();
        System.out.println("The result is : ");

        switch (ch) {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                if(a>b){
                    System.out.println(a/b);
                }
                else{
                    System.out.println(b/a);
                }
                break;
            case 5:
                 System.out.println(a%b);
                break;
        
            default:
            System.out.println("Invalid entry");
                break;
        }
        sc.close();


    }
}
