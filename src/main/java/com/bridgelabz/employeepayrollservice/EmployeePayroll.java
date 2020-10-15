package com.bridgelabz.employeepayrollservice;

public class EmployeePayroll {
    private int employeeId;
    private String employeeName;
    private double employeeSalary;

    /*Parameterized Constructor*/
    public EmployeePayroll(int employeeId, String employeeName, double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }
}
