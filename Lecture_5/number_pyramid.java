package Lecture_5;

public class number_pyramid {
    public static void main(String[] args) {
        int n=5;

        for (int i =1; i<=n; i++) {
            // for (int j =i-1; j>=1; j--) {
            //     System.out.print("0 ");
            // }
            for (int j = n-i; j>=1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}
