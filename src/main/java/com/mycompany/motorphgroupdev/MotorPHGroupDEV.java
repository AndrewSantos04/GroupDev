/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorphgroupdev;

/**
 *
 * @author Carl Warren
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotorPHGroupDEV {
    private static List<Employee> employees = new ArrayList<>();
    private static List<Attendance> attendanceRecords = new ArrayList<>();

    public static void main(String[] args) {
        // Load existing employee records from CSV
        employees = dataCSV.loadEmployees();
        System.out.println("✅ Employees loaded: " + employees.size());

        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;

            while (running) {
                System.out.println("\n🏢 MotorPH Payroll System");
                System.out.println("1. Add Employee");
                System.out.println("2. Remove Employee");
                System.out.println("3. View Employee Details");
                System.out.println("4. Update/View Attendance");
                System.out.println("5. Calculate Gross Salary");
                System.out.println("6. View Payslip");
                System.out.println("7. Save and Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1 -> addEmployee(scanner);
                    case 2 -> removeEmployee(scanner);
                    case 3 -> searchEmployee(scanner);
                    case 4 -> manageAttendance(scanner);
                    case 5 -> calculateGrossSalary(scanner);
                    case 6 -> viewPayslip(scanner);
                    case 7 -> {
                        System.out.println("📁 Saving data and exiting...");
                        dataCSV.saveEmployees(employees);
                        running = false;
                    }
                    default -> System.out.println("❌ Invalid choice. Try again.");
                }
            }
        }
    }

    private static void addEmployee(Scanner scanner) {
        System.out.println("\n➕ Add New Employee");
        // Code for adding an employee
    }

    private static void removeEmployee(Scanner scanner) {
        System.out.println("\n❌ Remove Employee");
        // Code for removing an employee
    }

    private static void searchEmployee(Scanner scanner) {
        System.out.println("\n🔍 Search Employee");
        // Code for searching an employee
    }

    private static void manageAttendance(Scanner scanner) {
        System.out.println("\n📋 Manage Attendance");
        // Code for managing attendance
    }

    private static void calculateGrossSalary(Scanner scanner) {
        System.out.println("\n💰 Calculate Gross Salary");

        System.out.print("Enter Employee ID: ");
        String employeeID = scanner.nextLine();

        Employee foundEmployee = null;
        Attendance foundAttendance = null;

        // Find employee and attendance records
        for (Employee emp : employees) {
            if (emp.getEmployeeID().equals(employeeID)) {
                foundEmployee = emp;
                break;
            }
        }

        for (Attendance att : attendanceRecords) {
            if (att.getEmployeeID().equals(employeeID)) {
                foundAttendance = att;
                break;
            }
        }

        if (foundEmployee != null && foundAttendance != null) {
            Payroll.displayPayroll(foundEmployee, foundAttendance);
        } else {
            System.out.println("❌ Employee or Attendance record not found.");
        }
    }

    private static void viewPayslip(Scanner scanner) {
        System.out.println("\n🧾 View Payslip");

        System.out.print("Enter Employee ID: ");
        String employeeID = scanner.nextLine();

        Employee foundEmployee = null;
        Attendance foundAttendance = null;

        // Find employee and attendance records
        for (Employee emp : employees) {
            if (emp.getEmployeeID().equals(employeeID)) {
                foundEmployee = emp;
                break;
            }
        }

        for (Attendance att : attendanceRecords) {
            if (att.getEmployeeID().equals(employeeID)) {
                foundAttendance = att;
                break;
            }
        }

        if (foundEmployee != null && foundAttendance != null) {
            double grossSalary = Payroll.calculateGrossSalary(foundEmployee, foundAttendance);
            double netSalary = Payroll.calculateNetSalary(foundEmployee, foundAttendance);

            Payslip payslip = new Payslip(foundEmployee, grossSalary, Payroll.calculateSSSDeduction(foundEmployee)
                    + Payroll.calculatePhilHealthDeduction(foundEmployee) + Payroll.calculateTax(foundEmployee)
                    + Payroll.calculatePagIBIG(foundEmployee), netSalary);

            System.out.println(payslip.formatPayslip());
        } else {
            System.out.println("❌ Employee or Attendance record not found.");
        }
    }
}



/*Loads employees from employees.csv on startup.
Menu options to:
Add new employees.
Remove employees by their Employee ID.
View all employees.
Saves updated data to employees.csv when exiting.*/