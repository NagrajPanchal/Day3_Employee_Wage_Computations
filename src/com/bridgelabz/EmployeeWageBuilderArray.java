// UC-10_Manage multiple Companies Employee wage

package com.bridgelabz;

import java.util.Arrays;

public class EmployeeWageBuilderArray
{
    public static final int EMPLOYEE_FULL_TIME = 2; // Variable initialization
    public static final int EMPLOYEE_PART_TIME = 1;
    public static final int FULL_TIME_HOUR = 8;
    public static final int PART_TIME_HOUR = 4;
    private int numberOfCompany = 0;
    private CompanyEmployeeWage[] companyEmployeeWagesArray;

    public EmployeeWageBuilderArray()
    {
        companyEmployeeWagesArray = new CompanyEmployeeWage[5];
    }
    private void addCompanyEmployeeWage(String company, int emRatePerHours, int numberOfWorkingDays, int maxHoursPerMonth)
    {
        companyEmployeeWagesArray[numberOfCompany] = new CompanyEmployeeWage(company,emRatePerHours,numberOfWorkingDays,maxHoursPerMonth);
        numberOfCompany++;
    }
    private void computeEmployeeWage()
    {
        for(int i=0; i<numberOfCompany; i++)
        {
            companyEmployeeWagesArray[i].setTotalEmpWage(this.computeEmployeeWage(companyEmployeeWagesArray[i]));
            System.out.println(companyEmployeeWagesArray);
        }
    }
    private int computeEmployeeWage(CompanyEmployeeWage companyEmployeeWage)
    {
        // Variables
        int empHours = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        // Computation
        while (totalEmpHrs <= companyEmployeeWage.maxHoursPerMonth && totalWorkingDays < companyEmployeeWage.numberOfWorkingDays)
        {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck)
            {
                case EMPLOYEE_FULL_TIME:
                    empHours = FULL_TIME_HOUR;
                    break;
                case EMPLOYEE_PART_TIME:
                    empHours = PART_TIME_HOUR;
                    break;
                default:
                    empHours = 0;
            }
            totalEmpHrs += empHours;
            System.out.println("Day : " + totalWorkingDays + " Employee Hours : " + empHours);
        }
        return totalEmpHrs * companyEmployeeWage.emRatePerHours;
    }

    @Override
    public String toString() {
        return "EmployeeWageBuilderArray{" +
                "numberOfCompany=" + numberOfCompany +
                ", companyEmployeeWagesArray=" + Arrays.toString(companyEmployeeWagesArray) +
                '}';
    }

    public static void main(String[] args) // Main method
    {
        EmployeeWageBuilderArray employeeWageBuilder = new EmployeeWageBuilderArray();
        employeeWageBuilder.addCompanyEmployeeWage("D-Mart",20,4,10);
        employeeWageBuilder.addCompanyEmployeeWage("Airtel",15,5,15);
        employeeWageBuilder.computeEmployeeWage();
        CompanyEmployeeWage companyEmployeeWageObject = new CompanyEmployeeWage();
        companyEmployeeWageObject.getTotalEmpWage();
     }
}