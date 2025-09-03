package Lecture_15;

import java.util.Scanner;

public class bit_manipulation_update_bit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        System.out.println("Enter the postion you want to update the bit : ");
        int pos=sc.nextInt();

        System.out.println("You want to update 0 or 1 ?");
        int update=sc.nextInt();

        int bitMask=1<<pos;

        if(update==0){
            
            int notBitMask=~(bitMask);
            int result=notBitMask & num;
            System.out.println("The bit after update is : "+result);
        }
        else System.out.println("The bit after update is : "+(bitMask|num));
        sc.close();
    }
}
