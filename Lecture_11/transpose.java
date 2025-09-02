package Lecture_11;

import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows you want : ");
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns you want : ");
        int columns=sc.nextInt();

        int arr[][]=new int[rows][columns];

        System.out.println("Enter the elements in the array");

        // taking input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <columns; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Normal Print");
        // printing the array
         for (int i = 0; i < rows; i++) {
            for (int j = 0; j <columns; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Transpose ");

        // printing the array
         for (int i = 0; i < columns; i++) {
            for (int j = 0; j <rows; j++) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println("");
        }

        sc.close();
    }
}
