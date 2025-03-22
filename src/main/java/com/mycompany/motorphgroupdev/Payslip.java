/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorphgroupdev;

/**
 *
 * @author Carl Warren
 */
public class Payslip {
    private Employee employee;
    private double grossSalary;
    private double deductions;
    private double netSalary;

    public Payslip(Employee employee, double grossSalary, double deductions, double netSalary) {
        this.employee = employee;
        this.grossSalary = grossSalary;
        this.deductions = deductions;
        this.netSalary = netSalary;
    }

    public void displayPayslip() {
        System.out.println("\n=== Payslip ===");
        System.out.println("Employee: " + employee.getName());
        System.out.println("Position: " + employee.getPosition());
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Deductions: " + deductions);
        System.out.println("Net Salary: " + netSalary);
        System.out.println("================\n");
    }
}