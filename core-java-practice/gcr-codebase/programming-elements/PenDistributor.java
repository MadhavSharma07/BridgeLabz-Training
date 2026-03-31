package BridgeLabz-Training.core-java-practice.gcr-codebase.programming-elements;

public class PenDistributor {
    public static void main(String[] args) {
        int totalPen=14;       // total number of pens
        int totalStudents=3;    // total number of students
        int distributedPenPerStudent = totalPen / totalStudents ;  // calculate number of pens each student have
        int remainingPen = totalPen % totalStudents;         //  calculate number of remaining pens
        
        System.out.print("The Pen Per Student is "+distributedPenPerStudent+"and the remaining pen not distributed is "+remainingPen); // print the output
    }
}
