/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorphgroupdev;

import java.util.List;

public class Payroll {

    // Calculate gross salary including overtime pay
    public static double calculateGrossSalary(Employee employee, Attendance attendance) {
        double basicSalary = employee.getBasicSalary();
        double totalAllowances = employee.calculateTotalAllowances();
        double hourlyRate = employee.getHourlyRate();
        double overtimeHours = attendance.getOvertimeHours();

        // Assume overtime multiplier is 1.25x for regular overtime
        double overtimeMultiplier = 1.25;
        double overtimePay = overtimeHours * hourlyRate * overtimeMultiplier;

        return basicSalary + totalAllowances + overtimePay;
    }

    // Display payroll details
    public static void displayPayroll(Employee employee, Attendance attendance) {
        double grossSalary = calculateGrossSalary(employee, attendance);

        System.out.println("\n📊 Payroll Summary for " + employee.getName());
        System.out.println("Basic Salary: " + employee.getBasicSalary());
        System.out.println("Total Allowances: " + employee.calculateTotalAllowances());
        System.out.println("Overtime Hours: " + attendance.getOvertimeHours());
        System.out.println("Overtime Pay: " + (attendance.getOvertimeHours() * employee.getHourlyRate() * 1.25));
        System.out.println("Gross Salary: " + grossSalary);
    }

    // Calculate SSS deduction
    public static double calculateSSSDeduction(Employee employee) {
        double salary = employee.getBasicSalary();
        return salary * 0.045; // Example: 4.5% SSS contribution
    }

    // Calculate PhilHealth deduction
    public static double calculatePhilHealthDeduction(Employee employee) { // Fixed method name
        double salary = employee.getBasicSalary();
        return salary * 0.035; // Example: 3.5% PhilHealth contribution
    }

    // Calculate tax deduction
    public static double calculateTax(Employee employee) { // Fixed method name
        double salary = employee.getBasicSalary();
        return salary * 0.10; // Example: 10% tax
    }

    // Calculate Pag-IBIG deduction
    public static double calculatePagIBIG(Employee employee) { // Fixed method name
        double salary = employee.getBasicSalary();
        return salary * 0.02; // Example: 2% Pag-IBIG contribution
    }

    // Calculate net salary
    public static double calculateNetSalary(Employee employee, Attendance attendance) {
        double grossSalary = calculateGrossSalary(employee, attendance);
        double totalDeductions = calculateSSSDeduction(employee)
                                + calculatePhilHealthDeduction(employee)
                                + calculateTax(employee)
                                + calculatePagIBIG(employee);
        return grossSalary - totalDeductions;
    }

    // Display net salary details
    public static void displayNetSalary(Employee employee, Attendance attendance) {
        double netSalary = calculateNetSalary(employee, attendance);

        System.out.println("\n💰 Net Salary Summary for " + employee.getName());
        System.out.println("Net Salary: " + netSalary);
    }
}//calculates the number of hours an employee has worked in a week.
//calculates the gross weekly salary of an employee based on hours worked.
//calculates the net weekly salary of an employee after applying generic deductions.
    