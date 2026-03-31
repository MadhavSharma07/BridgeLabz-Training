import java.util.*;

public class TallestAndYoungestFriend {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = { "Amar", "Akbar", "Anthony" };
        int[] ageArray = new int[3];                // initailse age array
        double[] heightArray = new double[3];          // initiailise height array 
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age for " + names[i] + ": ");
            ageArray[i] = sc.nextInt();              // take age as input
            System.out.print("Enter heightArray for " + names[i] + ": ");
            heightArray[i] = sc.nextDouble();
        }
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ageArray[i] < ageArray[youngestIndex]) {     // find youngeest friend
                youngestIndex = i;
            }
        }
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heightArray[i] > heightArray[tallestIndex]) {     // find tallest friend
                tallestIndex = i;
            }
        }
        System.out.println("Youngest friend is  " + names[youngestIndex] + "  of age " + ageArray[youngestIndex]); // print youngest friend
        System.out.println("Tallest friend is : " + names[tallestIndex] + " of height " + heightArray[tallestIndex] );  // print tallest friend
    }
}