package BridgeLabz-Training.core-java-practice.gcr-codebase.extras;


import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.*;

public class DateOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date in the format dd-MM-yyyy:");
        String inputDate = sc.next(); //   take input date from user
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(inputDate, format);

        date = date.plusDays(07);    // plus days
        date = date.plusMonths(01); // subtract months
        date = date.plusYears(02);     // add years
        date = date.minusWeeks(03);  // subtract weeks

        System.out.println("The final date is: " + date.format(format));   // print output

    }
}
