package oops-practice.gcr-codebase.object-oriented-design-principles;

import java.util.*;


class Employee {   // Employee class (exists only inside Department)

    private String name;
    private int empId;

    public Employee(int empId, String name) { // Employee constructor
        this.empId = empId;
        this.name = name;
    }

    public void printEmployee() {
        System.out.println("Employee ID: " + empId + ", Name: " + name);
    }
}


class Department {   // Department class (exists only inside Company)

    private String deptName;
    private ArrayList<Employee> employees;

    public Department(String deptName) {   // Department class constructor
        this.deptName = deptName;
        this.employees = new ArrayList<Employee>();
    }

    public void addEmployee(int id, String name) {
        employees.add(new Employee(id, name));
    }

    public void displayDepartment() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.printEmployee();
        }
    }

    public void clearDepartment() {
        employees.clear(); // employees removed
    }
}


class Company {  // Company class (owner of departments)

    private String companyName;
    private ArrayList<Department> departments;

    public Company(String companyName) {  // Company class constructor
        this.companyName = companyName;
        this.departments = new ArrayList<Department>();
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void displayCompany() {
        System.out.println("Company Name: " + companyName);
        for (Department d : departments) {
            d.displayDepartment();
            System.out.println();
        }
    }

    
    public void closeCompany() {   //deletion of company
        for (Department d : departments) {
            d.clearDepartment(); // employees removed
        }
        departments.clear(); // departments removed
        System.out.println("Company closed. All departments and employees removed.");
    }
}


public class CompanyComposition {  // main class

    public static void main(String[] args) {

        Company company = new Company("TechSoft Ltd");

        Department d1 = new Department("Development");
        d1.addEmployee(101, "Amit");
        d1.addEmployee(102, "Neha");

        Department d2 = new Department("HR");
        d2.addEmployee(201, "Rahul");

        company.addDepartment(d1);
        company.addDepartment(d2);

        System.out.println("Company Details:\n");
        company.displayCompany();

        
        company.closeCompany();  // Closing company (composition behavior)
    }
}
