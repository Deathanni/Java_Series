import java.util.*;
public class circle_circumference_function {

    public static double calculate_circumference(int r){
        double cir=2*Math.PI*r;
        return cir;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle :");
        int r=sc.nextInt();

        System.out.println("The circumference of the cricle is : "+calculate_circumference(r));
        sc.close();
    }
}
