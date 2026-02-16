package employee_wage;

import java.util.Scanner;

public class EmployeeWageMain {

    public static void main(String[] args) {

        EmpWageBuilder builder = new EmpWageBuilder();

        builder.addCompany("TCS", 20, 20, 100);
        builder.addCompany("Infosys", 25, 20, 100);
        builder.addCompany("CapGemini", 45, 20, 100);

        builder.computeWage();

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter company name: ");
        String name = sc.next();

        System.out.println("Total Wage: " + builder.getTotalWage(name));
    }
}
