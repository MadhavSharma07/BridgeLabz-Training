import java.util.*;


class Employee{
    static final int ABSENT=0;  // final variables
    static final int FULL_TIME_EMPLOYEE=1;
    static final int PART_TIME_EMPLOYEE=2; 
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR  =8; 
    static final int PART_DAY_HOUR = 4;
    static final int MAX_WORKING_DAYS=20;
    static final int MAX_WORKING_HOURS=100;

    static ArrayList<Integer> dailyWages = new ArrayList<>();
    
    static boolean isPresent ;
    
    private static void checkAttendance(){  // Use Case 1   and method to check attendance
        Random random = new Random();
        int attendance = random.nextInt(2);

        if(attendance==1){
        isPresent=true;
        System.out.println("Employee is present ("+ attendance+") .");
        }
        else{
        isPresent=false;
        System.out.println("Employee is absent ("+attendance+") .");
        }
    }

    public static void getAttendance(){  // encapsulated getter public method to get attendance 
        checkAttendance();
    }

    private static int calculateDailyWage(int employeeType){  // Use Case 2 and 3   and method to calculate daily wage
        int dailyHours=0;
        
        if(isPresent==true){
            switch(employeeType){
                case  FULL_TIME_EMPLOYEE:  // 1
                    dailyHours=FULL_DAY_HOUR;
                    break;

                case PART_TIME_EMPLOYEE:  // 2
                    dailyHours = PART_DAY_HOUR;
                    break;

                default:
                    dailyHours=0;  //  absent
            }
            
        }
        else{
            System.out.println("Employee is absent");
        }
        return dailyHours*WAGE_PER_HOUR;
                
    }
    public static int getDailyWage(int employeeType){  // encapsulated getter public method to get daily wage
        return calculateDailyWage(employeeType);
    }

    private static int employeeStatus(){  // Use Case 3  and method to find employee status
        Random random = new Random();
        int status = random.nextInt(2)+1;
        if(status==FULL_TIME_EMPLOYEE){
            return 1;
        }
        return 2;
    }

    public static int getEmployeeStatus(){ // encapsulated getter public method to get emplopyee status
        return employeeStatus();
    }

    private static void calculateMonthlyWage(){  // use case 4,5 & 6 and method to calculate monthly wage
        int totalWorkingDays=0;
        int totalWorkingHours=0;
        int totalSalary=0;
        Random random = new Random();
        while(totalWorkingDays<MAX_WORKING_DAYS && totalWorkingHours<MAX_WORKING_HOURS){
            totalWorkingDays++;
            int employeeType = random.nextInt(3);  // 0 ,1 & 2

            int dailyWage = calculateDailyWage(employeeType);
            int hoursWorked = dailyWage/WAGE_PER_HOUR;
            if (totalWorkingHours + hoursWorked > MAX_WORKING_HOURS) {
                hoursWorked = MAX_WORKING_HOURS - totalWorkingHours;
                dailyWage = hoursWorked * WAGE_PER_HOUR;
            }
            totalWorkingHours+=hoursWorked;
            totalSalary+=dailyWage;

            dailyWages.add(dailyWage);

            System.out.println("Total working days: "+totalWorkingDays);
            System.out.println("Total working hours: "+totalWorkingHours);
            System.out.println("Total monthly salary: "+totalSalary);
            System.out.println();

        }
    }

    public static void getMonthlyWage(){  // encapsulated getter public method to get monthly wage
        calculateMonthlyWage();
    }
}

public class EmployeeWageComputation {  // main class
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.getAttendance();
        int employeeStatus = employee.getEmployeeStatus();
        if(employeeStatus==1){
            System.out.println("FULL TIME EMPLOYEE ("+employeeStatus+")");
        }
        else{
            System.out.println("PART TIME EMPLOYEE ("+employeeStatus+")");
        }

        System.out.println("The daily wage of employee is: "+employee.getDailyWage(employeeStatus));

        employee.getMonthlyWage();
    }
    
}