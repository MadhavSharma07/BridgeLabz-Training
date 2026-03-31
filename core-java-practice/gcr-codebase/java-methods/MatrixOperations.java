package BridgeLabz-Training.core-java-practice.gcr-codebase.java-methods;

import java.util.*;

public class MatrixOperations {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();                         // take rows from user
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();               // take columns from user
        int[][] A = getRandomMatrix(rows, cols);             // matrix A
        int[][] B = getRandomMatrix(rows, cols);            // matrix B
        matrixPrint("Matrix A:", A);
        matrixPrint("Matrix B:", B);
        int[][] sum = matrixAddition(A, B);                  // store matrix addition 
        matrixPrint("Addition (A + B):", sum);         // print sum of matrices
        int[][] diff = matrixSubtraction(A, B);              //  store matrix subtractuiuon
        matrixPrint("Subtraction (A - B):", diff);      // print subtraction
        System.out.print("Enter columns for second matrix (for multiplication): ");
        int cols2 = sc.nextInt();
        int[][] B2 = getRandomMatrix(cols, cols2); 
        matrixPrint("Matrix B (for multiplication):", B2);
        int[][] product = matrixMultiplication(A, B2);            // store multiplication of matrix
        matrixPrint("Multiplication (A x B):", product);           // print multipliaction

    }

     public static int[][] getRandomMatrix(int rows, int cols) {          // mwthod to get martix
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); 
            }
        }
        return matrix;
    }
    public static int[][] matrixAddition(int[][] a, int[][] b) {           // method to add matrices
        int[][] result = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }
    public static int[][] matrixSubtraction(int[][] a, int[][] b) {         // method to subtract matrices
        int[][] result = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }
    public static int[][] matrixMultiplication(int[][] a, int[][] b) {     // method to multiply matrices
        int rows = a.length;
        int cols = b[0].length;
        int common = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }
    public static void matrixPrint(String label, int[][] matrix) {   // method to print matrix
        System.out.println(label);
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
        System.out.println();
    }
}
