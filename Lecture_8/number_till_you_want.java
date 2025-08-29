import java.util.Scanner;

public class number_till_you_want {

    public static void numbers(){
        Scanner sc=new Scanner(System.in);
        int positive=0;
        int negative=0;
        int zero=0;
        String ch;
        do{
            int num=sc.nextInt();

            if(num<0){
                negative++;
            }
            else if(num>0){
                positive++;
            }
            else{
                zero++;
            }
            System.out.println("Do you want to give one more number ? (y/n)");
            ch=sc.next();
        } while(ch.equalsIgnoreCase("y"));
        System.out.println("\nCount of positive numbers: " + positive);
        System.out.println("Count of negative numbers: " + negative);
        System.out.println("Count of zeros: " + zero);

        sc.close();
    }
    public static void main(String[] args) {
        numbers();
    }
}

