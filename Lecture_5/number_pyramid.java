package Lecture_5;

public class number_pyramid {
    public static void main(String[] args) {
        int n=5;

        for (int i =n; i>=1; i--) {
            for (int j =i-1; j>=1; j--) {
                System.out.print("0 ");
            }
            System.out.println("");
        }
    }
}
