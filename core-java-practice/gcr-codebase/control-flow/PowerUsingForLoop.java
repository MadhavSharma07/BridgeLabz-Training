   
import java.util.*;

public class PowerUsingForLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number:");
        int number = sc.nextInt();       // take number as input from user
        System.out.print("Enter the power:");
        int power = sc.nextInt();       // take powerr as input from user

        int result =1;

        if(number >0){
            for(int i=0;i<=number;i++){
                result*=number;
            }
        }

        else{
            System.out.println("Enter the valid input");
        }

        
    }
}