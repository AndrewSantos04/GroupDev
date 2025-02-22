/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorphgroupdev;

/**
 *
 * @author Carl Warren
 */
public class Attendance {

    // Placeholder methods
    public void updateAttendance(int employeeID, String date, double hoursWorked, boolean isAbsent, boolean isOnLeave) {
        // TODO: Implement attendance tracking
    }

    public void viewAttendance(int employeeID) {
        // TODO: Implement attendance viewing logic
    }
}

import java.time.LocalTime;
import java.time.Duration;

public class Attendance {
    private int employeeUD;
    private string date;
    private LocalTime clockIn;
    private LocalTime clockOut;
    
    // Constructor
    public Attendance(int employeeID, String date, String ClockIn, String clockOut) {
        this.employeeID = employeeID;
        this.date = date;
        this.clockIn = LocalTime.parse(clockIn); //converts string to localTime
        this.clockOut = LocalTime.parse(clockOut);
    }
    // Method to calculate hours worked
    public double calculateHoursWorked() {
        Duration duration = Duration.between(clockIn, clockOut);
        return duration.toMinutes() / 60.0; //Convert minutes to hours
    }
    
   
    // Display method
    public void displayHours() {
        System.out.printIn("Employee #" + employeeID +  " worked " + calculateHoursWorked() + " hours on " + date);
    }
}
    
    
    
