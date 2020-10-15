package com.bridgelabz.employeepayrollservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    public enum IOService {
        CONSOLE_IO, FILE_IO
    }

    private List<EmployeePayroll> employeePayrollList;

    /*Welcome Message*/
    public boolean printWelcomeMessage() {
        System.out.println("Welcome to the Employee PayRoll Service Program");
        return true;
    }

    /*Default Constructor*/
    public EmployeePayrollService() {
        super();
        this.employeePayrollList = new ArrayList<>();
    }

    /*parameterized Constructor*/
    public EmployeePayrollService(List<EmployeePayroll> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    /*Method to read employee data*/
    public void readEmployeeData(IOService ioService) {
        if(ioService.equals(IOService.CONSOLE_IO)){
            Scanner consoleInput = new Scanner(System.in);
            System.out.println("Enter Employee ID: ");
            int employeeId = consoleInput.nextInt();
            System.out.println("Enter Employee Name: ");
            String employeeName = consoleInput.next();
            System.out.println("Enter Employee Salary: ");
            double employeeSalary = consoleInput.nextDouble();
            employeePayrollList.add(new EmployeePayroll(employeeId,employeeName,employeeSalary));
        }else if(ioService.equals(IOService.FILE_IO)){
            ArrayList<EmployeePayroll> employeePayrollList = new EmployeePayrollFileIOService().readData();
        }
    }

    /*Method to write Employee Data*/
    public void writeEmployeeData(IOService ioservice) {
        if (ioservice.equals(IOService.CONSOLE_IO))
            System.out.println("Writing to console\n" + employeePayrollList);
        else if (ioservice.equals(IOService.FILE_IO))
            new EmployeePayrollFileIOService().writeData(employeePayrollList);
    }

    /* Counting entries of employees*/
    public long countEntries(IOService ioservice) {
        if (ioservice.equals(IOService.CONSOLE_IO))
            return employeePayrollList.size();
        else if (ioservice.equals(IOService.FILE_IO))
            return new EmployeePayrollFileIOService().countEntries();
        return 0;
    }
    /* Print data */
    public void printData(IOService ioservice) {
        if (ioservice.equals(IOService.CONSOLE_IO))
            System.out.println("Writing to console\n" + employeePayrollList);
        else if (ioservice.equals(IOService.FILE_IO))
            new EmployeePayrollFileIOService().printData();
    }
    /* Count of employees when read from file and stored to employeePayrollList*/
    public long employeeCount() {
        return employeePayrollList.size();
    }
}
