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
        int overtimeHours = attendance.getOvertimeHours();

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
}

//calculates the number of hours an employee has worked in a week.
//calculates the gross weekly salary of an employee based on hours worked.
//calculates the net weekly salary of an employee after applying generic deductions.