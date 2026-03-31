
import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal: ");
        int principal = sc.nextInt();                  // take principal amount from user
        System.out.println("Enter the rate: ");
        double rate = sc.nextDouble();                // take rate of interest from user 
        System.out.println("Enter the time period: ");
        int time = sc.nextInt();                      // take time from user

        int si = simpleInterest(principal, rate, time);
        System.out.println("The Simple Interest is "+si+" for Principal "+principal+" , Rate of Interest "+rate+" and Time " + time);
                    

    }

    public static int simpleInterest(int principal, double rate, int time) {       // method to find simple interest

        double si = (principal * rate * time) / 100;          // calculate simple interest
        return (int) si;
    }
}
