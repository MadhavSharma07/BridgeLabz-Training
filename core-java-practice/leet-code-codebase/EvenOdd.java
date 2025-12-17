import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number."); 
        int num = sc.nextInt();        //input the number from user
        if(num%2==0){           // condition  for even number
            System.out.println("Number is even");      // print even 
        }
        else{
            System.out.println("Number is odd");      // print odd
        }
    }
}
