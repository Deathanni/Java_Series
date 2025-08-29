import java.util.*;
public class greater_than_two_funtion {

    public static void calculateGreater(int a, int b){
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }
        else{
            System.out.println(b+" is greater than "+a);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        calculateGreater(a, b);
        sc.close();
    }
}
