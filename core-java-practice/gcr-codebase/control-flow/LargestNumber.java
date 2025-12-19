package BridgeLabz-Training.core-java-practice.gcr-codebase.control-flow;
import java.util.*;


public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int number1 = sc.nextInt();       // take first number as input from user
        System.out.print("Enter the second number:");
        int number2 = sc.nextInt();       // take second number as input from user
        System.out.print("Enter the third number:");
        int number3 = sc.nextInt();       // take third number as input from user

        boolean firstLargest = false;          
        boolean secondLargest = false;
        boolean thirdLargest = false;

        if(number1>number2){           // condtion for number1 is larger than number2
            if(number1>number3){        //condtion for number1 is larger than number3
                firstLargest=true;    // first number is the largest
            }
        }
        else if(number2>number1){      // condtion for number2 is larger than number1
            if(number2>number3){          // condtion for number2 is larger than number3
                secondLargest=true;       // second number is the largest
            }
        }
        else if(number3>number1){        // condtion for number3 is larger than number1
            if(number3>number2){         // condtion for number3 is larger than number2
                thirdLargest=true;        // third number is the largest
            }
        }

        System.out.print("Is the first number the largest? "+firstLargest);
        System.out.print("Is the second number the largest? "+secondLargest);
        System.out.print("Is the third number the largest? "+thirdLargest);


    }
}
