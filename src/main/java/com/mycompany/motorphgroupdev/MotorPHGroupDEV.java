/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorphgroupdev;

/**
 *
 * @author Carl Warren
 */
public class MotorPHGroupDEV {
    public static void main(String[] args) {
        System.out.println("MotorPH Payroll System is running...");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create Attendance records
        Attendance employee1 = new Attendance(1001, "2025-02-19", "08:00", "17:00");
        Attendance employee2 = new Attendance(1002, "2025-02-19", "09:30", "18:15");

        // Display worked hours
        employee1.displayHours();
        employee2.displayHours();
    }
}