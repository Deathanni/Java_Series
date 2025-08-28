package Lecture_6;

public class diamond_pattern {
    public static void main(String[] args) {
        int n=20;

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
// lower triangle
        for (int i = 1; i <n; i++) {
            for (int j =1; j<=i; j++) {
                 System.out.print("  ");
             }
            for (int j=1; j<=(n-i); j++) {
                System.out.print("* ");
            }
            for (int j =n-i-1; j>=1;j--) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
        
        
    }
}
