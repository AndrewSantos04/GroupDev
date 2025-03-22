/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorphgroupdev;

/**
 * Class to track employee attendance.
 */
public class Attendance {
    private final String employeeID; // Made final for immutability
    private int daysWorked;
    private int absences;
    private double overtimeHours;

    // Constructor
    public Attendance(String employeeID, int daysWorked, int absences, double overtimeHours) {
        if (employeeID == null || employeeID.isEmpty()) {
            throw new IllegalArgumentException("Employee ID cannot be null or empty.");
        }
        this.employeeID = employeeID;

        // Validation for non-negative values
        if (daysWorked < 0 || absences < 0 || overtimeHours < 0) {
            throw new IllegalArgumentException("Days worked, absences, and overtime hours cannot be negative.");
        }
        this.daysWorked = daysWorked;
        this.absences = absences;
        this.overtimeHours = overtimeHours;
    }

    // Getters
    public String getEmployeeID() {
        return employeeID;
    }

    public int getDaysWorked() {
        return daysWorked;
    }

    public int getAbsences() {
        return absences;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    // Setters with validation
    public void setDaysWorked(int daysWorked) {
        if (daysWorked < 0) {
            throw new IllegalArgumentException("Days worked cannot be negative.");
        }
        this.daysWorked = daysWorked;
    }

    public void setAbsences(int absences) {
        if (absences < 0) {
            throw new IllegalArgumentException("Absences cannot be negative.");
        }
        this.absences = absences;
    }

    public void setOvertimeHours(double overtimeHours) {
        if (overtimeHours < 0) {
            throw new IllegalArgumentException("Overtime hours cannot be negative.");
        }
        this.overtimeHours = overtimeHours;
    }

    // Method to update attendance with validation
    public void updateAttendance(int daysWorked, int absences, double overtimeHours) {
        if (daysWorked < 0 || absences < 0 || overtimeHours < 0) {
            throw new IllegalArgumentException("Days worked, absences, and overtime hours cannot be negative.");
        }

        this.daysWorked += daysWorked;
        this.absences += absences;
        this.overtimeHours += overtimeHours;
    }

    // Method to display attendance details
    public void displayAttendance() {
        System.out.println("📊 Attendance Record for Employee ID: " + employeeID);
        System.out.println("Days Worked: " + daysWorked);
        System.out.println("Absences: " + absences);
        System.out.println("Overtime Hours: " + overtimeHours);
    }

    // Override toString() for easy printing
    @Override
    public String toString() {
        return String.format("Attendance[EmployeeID: %s, DaysWorked: %d, Absences: %d, OvertimeHours: %.2f]",
                employeeID, daysWorked, absences, overtimeHours);
    }
}
