/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorphgroupdev;

/**
 *
 * @author Carl Warren
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class dataCSV {
    private static final String FILE_PATH = "employees.csv";

    // Load employee records from CSV
    public static List<Employee> loadEmployees() {
        List<Employee> employees = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            br.readLine(); // Skip header
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                Employee emp = new Employee(
                        data[0], data[1], data[2], data[3], data[4], data[5],
                        data[6], data[7], data[8], data[9], data[10], data[11],
                        data[12], Double.parseDouble(data[13]), Double.parseDouble(data[14]),
                        Double.parseDouble(data[15]), Double.parseDouble(data[16]),
                        Double.parseDouble(data[17]), Double.parseDouble(data[18])
                );
                employees.add(emp);
            }
        } catch (IOException e) {
            System.out.println("Error loading employees: " + e.getMessage());
        }
        return employees;
    }

    // Save employee records to CSV
    public static void saveEmployees(List<Employee> employees) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            // Write CSV header
            bw.write("Employee #,Last Name,First Name,Birthday,Address,Phone Number," +
                     "SSS #,Philhealth,TIN #,Pag-Ibig #,Status,Position," +
                     "Immediate Supervisor,Basic Salary,Rice Subsidy,Phone Allowance," +
                     "Clothing Allowance,Gross Semi-monthly Rate,Hourly Rate\n");

            // Write employee data
            for (Employee emp : employees) {
                bw.write(String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%.2f,%.2f,%.2f,%.2f,%.2f,%.2f\n",
                        emp.getEmployeeID(), emp.getLastName(), emp.getFirstName(),
                        emp.getBirthday(), emp.getAddress(), emp.getPhoneNumber(),
                        emp.getSssNumber(), emp.getPhilhealthNumber(), emp.getTinNumber(),
                        emp.getPagIbigNumber(), emp.getStatus(), emp.getPosition(),
                        emp.getImmediateSupervisor(), emp.getBasicSalary(),
                        emp.getRiceSubsidy(), emp.getPhoneAllowance(),
                        emp.getClothingAllowance(), emp.getGrossSemiMonthlyRate(),
                        emp.getHourlyRate()));
            }
        } catch (IOException e) {
            System.out.println("Error saving employees: " + e.getMessage());
        }
    }
}