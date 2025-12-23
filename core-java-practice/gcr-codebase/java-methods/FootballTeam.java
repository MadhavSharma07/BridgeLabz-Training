package BridgeLabz-Training.core-java-practice.gcr-codebase.java-methods;

import java.util.*;

public class FootballTeam {
    public static void main(String[] args) {
        int[] heights = getHeights(11);          // array to store height
        displayResult(heights);                 // print output
    }

    public static int[] getHeights(int count) {          // method to get heights
        int[] heights = new int[count];
        for (int i = 0; i < count; i++) {
            heights[i] = 150 + (int)(Math.random() * 101); 
        }
        return heights;
    }

    public static int sumCalculation(int[] heights) {        // method to calculate sum of heights
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

     public static double meanCalculation(int[] heights) {      // mathod to calculate mean of heights
        return (double) sumCalculation(heights) / heights.length;
    }
    public static int shortestPlayer(int[] heights) {          // method to calculate shortest height
        int min = heights[0];
        for (int h : heights) {
            if (h < min) min = h;
        }
        return min;
    }
    public static int tallestPlayer(int[] heights) {                // method to find tallest height
        int max = heights[0];
        for (int h : heights) {
            if (h > max) max = h;
        }
        return max;
    }

    public static void displayResult(int[] heights) {              // method to print the results
        System.out.println("Player Heights (in cm): " + Arrays.toString(heights));
        System.out.println("Shortest Height: " + shortestPlayer(heights) + " cm");
        System.out.println("Tallest Height: " + tallestPlayer(heights) + " cm");
        System.out.printf("Mean Height: %.2f cm\n", meanCalculation(heights));
    }
}
