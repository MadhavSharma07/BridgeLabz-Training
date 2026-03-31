import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number."); 
        int num = sc.nextInt();        //input the number from user
        int factorial=0;   
        
        for(int i=1;i<num;i++){        // loop to calculate factorial
            factorial*=i;
        }
        System.out.println("The factorial is:"+ factorial);   // print factorial
    }
}
