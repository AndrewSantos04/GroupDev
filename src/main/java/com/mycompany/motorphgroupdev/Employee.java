/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Carl Warren
 */
package com.mycompany.motorphgroupdev;

public class Employee {
    private String employeeID;
    private String lastName;
    private String firstName;
    private String birthday;
    private String address;
    private String phoneNumber;
    private String sssNumber;
    private String philhealthNumber;
    private String tinNumber;
    private String pagIbigNumber;
    private String status;
    private String position;
    private String immediateSupervisor;
    private double basicSalary;
    private double riceSubsidy;
    private double phoneAllowance;
    private double clothingAllowance;
    private double grossSemiMonthlyRate;
    private double hourlyRate;

    // Constructor
    public Employee(String employeeID, String lastName, String firstName, String birthday, String address,
                    String phoneNumber, String sssNumber, String philhealthNumber, String tinNumber, String pagIbigNumber,
                    String status, String position, String immediateSupervisor, double basicSalary, double riceSubsidy,
                    double phoneAllowance, double clothingAllowance, double grossSemiMonthlyRate, double hourlyRate) {
        this.employeeID = employeeID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.sssNumber = sssNumber;
        this.philhealthNumber = philhealthNumber;
        this.tinNumber = tinNumber;
        this.pagIbigNumber = pagIbigNumber;
        this.status = status;
        this.position = position;
        this.immediateSupervisor = immediateSupervisor;
        this.basicSalary = basicSalary;
        this.riceSubsidy = riceSubsidy;
        this.phoneAllowance = phoneAllowance;
        this.clothingAllowance = clothingAllowance;
        this.grossSemiMonthlyRate = grossSemiMonthlyRate;
        this.hourlyRate = hourlyRate;
    }

    // Getters
    public String getEmployeeID() { return employeeID; }
    public String getLastName() { return lastName; }
    public String getFirstName() { return firstName; }
    public String getBirthday() { return birthday; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getSssNumber() { return sssNumber; }
    public String getPhilhealthNumber() { return philhealthNumber; }
    public String getTinNumber() { return tinNumber; }
    public String getPagIbigNumber() { return pagIbigNumber; }
    public String getStatus() { return status; }
    public String getPosition() { return position; }
    public String getImmediateSupervisor() { return immediateSupervisor; }
    public double getBasicSalary() { return basicSalary; }
    public double getRiceSubsidy() { return riceSubsidy; }
    public double getPhoneAllowance() { return phoneAllowance; }
    public double getClothingAllowance() { return clothingAllowance; }
    public double getGrossSemiMonthlyRate() { return grossSemiMonthlyRate; }
    public double getHourlyRate() { return hourlyRate; }

    // Setters
    public void setAddress(String address) { this.address = address; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setBasicSalary(double basicSalary) { this.basicSalary = basicSalary; }

    // Calculate Total Allowances
    public double calculateTotalAllowances() {
        return riceSubsidy + phoneAllowance + clothingAllowance;
    }

    // Calculate Gross Monthly Salary (Basic + Allowances)
    public double calculateGrossMonthlySalary() {
        return basicSalary + calculateTotalAllowances();
    }

    // Display Employee Info
    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeID + ", Name: " + firstName + " " + lastName);
        System.out.println("Position: " + position + ", Supervisor: " + immediateSupervisor);
        System.out.println("Gross Monthly Salary: " + calculateGrossMonthlySalary());
    }

    // Method to get basic salary (used in Payroll calculations)
    public double getSalary() {
        return this.basicSalary;
    }

    // Method to get full name
    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    // Placeholder for attendance - adapt as needed
    public int getAttendance() {
        return 0; // Adjust based on how you track attendance
    }
}
