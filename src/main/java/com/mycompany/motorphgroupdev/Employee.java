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
    /* Employee attributes
    this will be used to create our objects or actual employee info
    */
    private int employeeNumber;
    private String lastName;
    private String firstName;
    private String birthDate;
    private String address;
    private String phoneNumber;
    private String sssNumber;
    private String philhealthNumber;
    private String taxidentificationNumber;
    private String pagibigNumber;
    private String status;
    private String position;
    private String immediateSupervisor;
    private int basicSalary;
    private int riceSubsidy;
    private int phoneAllowance;
    private int clothingAllowance;
    private int grosssemimonthlyRate;
    private double hourlyRate;
    
    /* Constructor, special method in Java that is called automatically when you create an object. 
    It is used to initialize an object’s attributes.
    */
    
    public Employee(int employeeNumber, String lastName, String firstName, String birthDate, String address, String phoneNumber, String sssNumber, String philhealthNumber, String taxidentificationNumber, String pagibigNumber, String status, String position, String immediateSupervisor, int basicSalary, int riceSubsidy, int phoneAllowance, int clothingAllowance, int grosssemimonthlyRate, double hourlyRate) {// used double on hourlyRate bc it has decimal
            
    // "this" is a constructor parameter: helps pass values into an object when it is created.
    // "instance variable" is also called class attribute, which are values assgined to an object.
        this.employeeNumber = employeeNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.sssNumber = sssNumber;
        this.philhealthNumber = philhealthNumber;
        this.taxidentificationNumber = taxidentificationNumber;
        this.pagibigNumber = pagibigNumber;
        this.status = status;
        this.position = position;
        this.immediateSupervisor = immediateSupervisor;
        this.basicSalary = basicSalary;
        this.riceSubsidy = riceSubsidy;
        this.phoneAllowance = phoneAllowance;
        this.clothingAllowance = clothingAllowance;
        this.grosssemimonthlyRate = grosssemimonthlyRate;
        this.hourlyRate = hourlyRate;
    }
    
     // Method to display employee details
    /* public void because this is only meanth to print, not return a value. "===================================" is used to as visual separator so that printed output is easier to read. "+" as String concatenation. 
    It joins "Employee Number: " with the actual value of employeeNumber.
    
    */
    public void displayEmployeeInfo() {
        System.out.println("===================================");
        System.out.println("Employee Number: " + employeeNumber);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Birthdate: " + birthDate);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("SSS #: " + sssNumber);
        System.out.println("PhilHealth #: " + philhealthNumber);
        System.out.println("TIN #: " + taxidentificationNumber);
        System.out.println("Pag-IBIG #: " + pagibigNumber);
        System.out.println("Status: " + status);
        System.out.println("Position: " + position);
        System.out.println("Immediate Supervisor: " + immediateSupervisor);
        System.out.println("Basic Salary: ₱" + basicSalary);
        System.out.println("Rice Subsidy: ₱" + riceSubsidy);
        System.out.println("Phone Allowance: ₱" + phoneAllowance);
        System.out.println("Clothing Allowance: ₱" + clothingAllowance);
        System.out.println("Gross Semi-Monthly Rate: ₱" + grosssemimonthlyRate);
        System.out.println("Hourly Rate: ₱" + hourlyRate);
        System.out.println("===================================");
    }
    // Placeholder methods
    public void addEmployee() {
        // TODO: Implement add employee logic
    }

    public void removeEmployee() {
        // TODO: Implement remove employee logic
    }

    public void viewEmployeeDetails() {
        // TODO: Fetch and display employee details
    }
}employee.java,