package com.bridgelabz.employeepayrollservice;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

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
}
