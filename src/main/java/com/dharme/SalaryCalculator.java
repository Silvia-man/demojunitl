package com.dharme;

public class SalaryCalculator {
    private double basicSalary;
    private double GrossSalary;

    public double getGrossSalary() {
        double result = this.basicSalary + getSocialInsurance() + getAllowance();
        if(result >= 12000) {
            result -= 50;
        }
        return result;
    }

    private double getAllowance() {
        return basicSalary/10;
    }

    private double getSocialInsurance() {
        return basicSalary/10;
    }

    public void setGrossSalary(double grossSalary) {
        GrossSalary = grossSalary;
    }


    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        if(basicSalary < 0) {
            throw new IllegalArgumentException("Negative salary");
        }
        this.basicSalary = basicSalary;
    }
}
