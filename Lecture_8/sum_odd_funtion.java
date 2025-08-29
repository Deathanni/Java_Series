import java.util.*;

public class sum_odd_funtion {

    public static int calculateOddSum(int n){
        int sum=0;
        for (int i =1; i <=n; i++) {
            if(i%2==1){
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println("The num of all the odd numbers till "+ n+ " is : "+calculateOddSum(n));
        sc.close();
    }
}
