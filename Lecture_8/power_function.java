import java.util.Scanner;

public class power_function {

    public static int calculatePower(int x, int n){
        int pow=(int)Math.pow(x, n);
        return pow;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want : ");
        int x=sc.nextInt();
        System.out.println("Enter the power of the number : ");
        int n=sc.nextInt();

        System.out.println(x+" to the power "+n+" is : "+calculatePower(x, n));
        sc.close();
    }
}
