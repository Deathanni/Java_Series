package Lecture_6;

public class butterfly_pattern {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n; i++) {

            //stars first
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }

            //space 
            for (int j =1; j <=(n-i)*2; j++) {
                System.out.print("  ");
            }

            //stars second
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i =n-1 ;i>=1 ; i--) {

            //stars first
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }

            //space 
            for (int j =1; j <=(n-i)*2; j++) {
                System.out.print("  ");
            }

            //stars second
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }


    }
}
