package Lecture_11;
import java.util.Scanner;

public class SpiralFill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter cols: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;

        System.out.println("Enter " + (rows * cols) + " numbers:");

        // Fill directly in spiral order
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) matrix[top][i] = sc.nextInt();
            top++;

            for (int i = top; i <= bottom; i++) matrix[i][right] = sc.nextInt();
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) matrix[bottom][i] = sc.nextInt();
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) matrix[i][left] = sc.nextInt();
                left++;
            }
        }

        // Print the spiral-filled matrix
        System.out.println("\nSpiral Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
