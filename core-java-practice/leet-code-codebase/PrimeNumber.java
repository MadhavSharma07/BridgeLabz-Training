import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number."); 
        int num = sc.nextInt(); //input the number from user
        int count=0; // counter to find factors other than 1 and number itself
        for(int i=0;i<num/2;num++){ // loop to find other factors
            if(num%i==0){
                count++;
                break;
            }
            
        }
        if(count==0){                // count is 0 then number is prime
            System.out.println("Number is prime.");
        }
        else{                          // count is not 0 number is not prime
            System.out.println("Number is not prime.");
        }
        
    }
}
