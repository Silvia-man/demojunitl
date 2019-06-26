package com.dharme;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@RunWith(JUnitPlatform.class)
public class SalaryCalculatorTest {
    private SalaryCalculator salaryCalculator;
    @BeforeEach
    public void init () {
        salaryCalculator = new SalaryCalculator();

    }

    @Test
    public void testValidBasicSalary () {
        double basicSalary = 10000;
        salaryCalculator.setBasicSalary(basicSalary);

        assertEquals(salaryCalculator.getBasicSalary(), basicSalary);
        assertEquals(salaryCalculator.getGrossSalary(), 11950);

        basicSalary = 8000;
        salaryCalculator.setBasicSalary(basicSalary);
        assertEquals(salaryCalculator.getGrossSalary(), 9600);
    }

    @DisplayName("Invaild Basic Salary")
    @Test
    public void testInvaildBasicSalary() {
        double basicSalary = -200;
        assertThrows(
                IllegalArgumentException.class, () -> salaryCalculator.setBasicSalary(basicSalary)
        );
    }

    @AfterEach
    public void tearDown() {
        salaryCalculator = null;
    }
}
