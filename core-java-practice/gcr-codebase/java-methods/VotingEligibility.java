
import java.util.*;

public class VotingEligibility {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] studentAges = new int[10];              // initialise an array to store student ages
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = sc.nextInt();          // take student age from user
            boolean canVote = votingEligibility(studentAges[i]);
            if (studentAges[i] < 0) {
                System.out.println("Invalid age entered.");          // print output
            } else if (canVote) {
                System.out.println("Student " + (i + 1) + " is eligible to vote.");   // print output
            } else { 
                System.out.println("Student " + (i + 1) + " is NOT eligible to vote."); // print output
            }
        }
    }


    public static boolean votingEligibility(int age) {     // methoid to find student's  voting eligibility
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }
}
