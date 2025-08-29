import java.util.*;

public class average_function {

    public static void calculateAverage(int a, int b, int c){
        float avg = (a + b + c) / 3.0f; // use float division
        System.out.println("The average is : " + avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        calculateAverage(a, b, c);
        sc.close();
    }
}
