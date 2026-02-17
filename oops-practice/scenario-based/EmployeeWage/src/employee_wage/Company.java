package employee_wage;

import java.util.ArrayList;
import java.util.List;

class Company {

    String name;
    int wagePerHour;
    int maxDays;
    int maxHours;
    int totalWage = 0;
    List<Integer> dailyWages = new ArrayList<>();

    Company(String name, int wagePerHour, int maxDays, int maxHours) {
        this.name = name;
        this.wagePerHour = wagePerHour;
        this.maxDays = maxDays;
        this.maxHours = maxHours;
    }
}

