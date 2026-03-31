import java.util.*;

public class ScoreAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt(); // take number of students from user
        int scores[] = new int[n];
        int totalScore = 0;
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Enter score for student " + (i + 1) + ": ");
                if (sc.hasNextInt()) {
                    int score = sc.nextInt();
                    if (score >= 0) {
                        scores[i] = score;   // check for valid score
                        totalScore += score; // calculate totalScore
                        break;
                    } else {
                        System.out.println("Score cannot be negative");  // if invalid score
                    }
                } else {
                    System.out.println("Invalid input");
                    break;
                }
            }
        }
        
        double average = (double) totalScore / n;  // calculate average
        int highest = scores[0];
        int lowest = scores[0];
        
        for (int score : scores) { // check for highest and lowest score
            if (score > highest)
                highest = score;
            if (score < lowest)
                lowest = score;
        }
        
        System.out.println("\nAverage Score: " + average); // print output
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.println("Scores above average:");
        
        for (int score : scores) {  // print scores above  average
            if (score > average) {
                System.out.print(score + " ");
            }
        }
    }
}