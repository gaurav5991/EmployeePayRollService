package com.bridgelabz.employeepayrollservice;

import org.junit.Assert;
import org.junit.BeforeClass;

public class EmployeePayrollServiceTest {
    /*Test Method for printWelcomeMessage Method*/
    @BeforeClass
    public static void beforeClass() throws Exception {
        EmployeePayrollService service = new EmployeePayrollService();
        boolean message = service.printWelcomeMessage();
        Assert.assertTrue(message);
    }
}
