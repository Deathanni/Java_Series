import java.util.Scanner;

public class fibonacci_function {

    public static void printFibonacciSeries(int n){
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        int sum;
        for (int i = 1; i <=n; i++) {
            sum=a+b;
            a=b;
            b=sum;
            System.out.print(sum+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();

        printFibonacciSeries(num);
        sc.close();
    }
}
