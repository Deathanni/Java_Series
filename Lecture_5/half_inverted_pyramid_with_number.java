package Lecture_5;

public class half_inverted_pyramid_with_number {
    public static void main(String[] args) {
        int n=5;

        for (int i =n; i>=1; i--) {
            for (int j =1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
