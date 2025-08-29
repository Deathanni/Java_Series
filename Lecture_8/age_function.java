import java.util.*;
public class age_function {

    public static void age(int age){
        if(age>18)
            System.out.println("Person is eligible to vote");
        else
            System.out.println("Not eligible to vote");
        return;
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the age :");
      int age=sc.nextInt();

      age(age);
      sc.close();  
    }
}
