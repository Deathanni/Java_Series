package Lecture_15;

import java.util.Scanner;

public class bit_manipulation_clear_bit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        System.out.println("Which position bit you want to clear");
        int pos=sc.nextInt();

        int bitMask=1<<pos;
        int notBitMask=~(bitMask);

        int result=notBitMask & num;
        System.out.println("After performing clear bit at postion "+pos+" is : "+result);
        sc.close();
    }
}
