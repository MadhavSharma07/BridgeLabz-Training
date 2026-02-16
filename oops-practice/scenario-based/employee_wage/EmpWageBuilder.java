package employee_wage;

import java.util.*;
import java.util.stream.*;

class EmpWageBuilder implements BuilderInterface {

    private List<Company> companies = new ArrayList<>();
    private Random random = new Random();

    private static final int ABSENT = 0;
    private static final int FULL_TIME = 1;
    private static final int PART_TIME = 2;

    @Override
    public void addCompany(String name, int wagePerHour, int maxDays, int maxHours) {
        companies.add(new Company(name, wagePerHour, maxDays, maxHours));
    }

    // UC1 – Check Attendance
    private int checkAttendance() {
        return random.nextInt(3);  // 0,1,2
    }

    // UC2 + UC3 – Get Working Hours
    private int getWorkingHours(int empType) {

        switch (empType) {
            case FULL_TIME:
                return 8;
            case PART_TIME:
                return 4;
            default:
                return 0;
        }
    }

    @Override
    public void computeWage() {

        companies.forEach(company -> {

            int totalHours = 0;
            int totalDays = 0;

            while (totalDays < company.maxDays &&
                    totalHours < company.maxHours) {

                totalDays++;

                int empType = checkAttendance();   
                int hours = getWorkingHours(empType); 

                if (totalHours + hours > company.maxHours) {
                    hours = company.maxHours - totalHours;
                }

                int dailyWage = hours * company.wagePerHour;

                totalHours += hours;
                company.dailyWages.add(dailyWage);
            }

            // calculate total wage
            company.totalWage = company.dailyWages
                    .stream()
                    .mapToInt(Integer::intValue)
                    .sum();

            System.out.println("\nCompany: " + company.name);
            System.out.println("Total Wage: " + company.totalWage);
            System.out.println("Daily Wages: " + company.dailyWages);
        });
    }

    @Override
    public int getTotalWage(String name) {

        return companies.stream()
                .filter(c -> c.name.equals(name))
                .map(c -> c.totalWage)
                .findFirst()
                .orElse(0);
    }
}

