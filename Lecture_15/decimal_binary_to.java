package Lecture_15;

import java.util.Scanner;

public class decimal_binary_to {

    // Binary to Decimal
    public static void binaryToDecimal(int n) {
        int original = n;
        int count = 0;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum += rem * Math.pow(2, count);
            count++;
            n = n / 10;
        }

        System.out.println("The number " + original + " after converting into decimal is: " + sum);
    }

    // Decimal to Binary
    public static void decimalToBinary(int n) {
        int original = n;
        String binary = "";

        while (n > 0) {
            int rem = n % 2;
            binary = rem + binary;
            n = n / 2;
        }

        System.out.println("The number " + original + " after converting into binary is: " + binary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter D to convert decimal to binary");
        System.out.println("Enter B to convert binary to decimal");
        char ch = sc.next().charAt(0);

        if (ch == 'D') {
            System.out.println("Enter a decimal number: ");
            int num = sc.nextInt();
            decimalToBinary(num);
        } else {
            System.out.println("Enter a binary number: ");
            int num = sc.nextInt();
            binaryToDecimal(num);
        }

        sc.close();
    }
}
