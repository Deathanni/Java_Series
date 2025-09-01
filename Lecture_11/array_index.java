package Lecture_11;

import java.util.Scanner;

public class array_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns you want: ");
        int columns = sc.nextInt();

        int arr[][] = new int[rows][columns];

        // taking input
        System.out.println("Enter the elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // printing the array
        System.out.println("Your array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the number you want to find:");
        int num = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (arr[i][j] == num) {
                    System.out.println("The index is: (" + i + "," + j + ")");
                    found = true;
                    break; // stop inner loop
                }
            }
            if (found) break; // stop outer loop too
        }

        if (!found) {
            System.out.println("Number not found in the array!");
        }

        sc.close();
    }
}
