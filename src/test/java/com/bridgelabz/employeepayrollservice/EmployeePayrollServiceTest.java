package com.bridgelabz.employeepayrollservice;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

public class EmployeePayrollServiceTest {
    static EmployeePayrollService employeePayrollService;

    /*Initialize constructor*/
    @BeforeClass
    public static void initializeConstructor() {
       employeePayrollService = new EmployeePayrollService();
    }

    /*Test Method for printWelcomeMessage Method*/
    @Test
    public void printWelcomeMessage() {
        boolean message = employeePayrollService.printWelcomeMessage();
        Assert.assertTrue(message);
    }
    @Test
    public void givenThreeEmployeeWhenWrittenToFileShouldMatchEmployeeEntries()
    {
        EmployeePayroll[] arrayOfEmps = {
                new EmployeePayroll(1, "Jeff Bezos", 10000000.0),
                new EmployeePayroll(2, "Bill Gates", 200000.00),
                new EmployeePayroll(2, "Satya Nadela", 300000.00)
        };
        employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmps));
        employeePayrollService.writeEmployeeData(EmployeePayrollService.IOService.FILE_IO);
        employeePayrollService.printData(EmployeePayrollService.IOService.FILE_IO);
        long entries = employeePayrollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
        Assert.assertEquals(3,entries);
    }
}
