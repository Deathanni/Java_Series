package Lecture_15;

import java.util.Scanner;

public class ShortDecimalBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Decimal → Binary
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        System.out.println("Binary: " + Integer.toBinaryString(decimal));

        // Binary → Decimal
        System.out.print("Enter a binary number: ");
        String binary = sc.next();
        System.out.println("Decimal: " + Integer.parseInt(binary, 2));

        sc.close();
    }
}
