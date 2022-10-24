// UC-9_Save total wage by company

package com.bridgelabz;
public class EmployeeWage
{
    final int EMPLOYEE_FULL_TIME = 2; // Variable initialization
    final int EMPLOYEE_PART_TIME = 1;
    final int FULL_TIME_HOUR = 8;
    final int PART_TIME_HOUR = 4;

    private final String company;
    private final int emRatePerHours;
    private final int numberOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;

    public EmployeeWage(String company, int emRatePerHours, int numberOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.emRatePerHours = emRatePerHours;
        this.numberOfWorkingDays = numberOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    private void calculateEmployeeSalary()
    {
        int empHours = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        while (totalEmpHrs < maxHoursPerMonth && totalWorkingDays < numberOfWorkingDays)
        {
            totalWorkingDays++;
            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {
                case EMPLOYEE_FULL_TIME:
                    empHours = FULL_TIME_HOUR;
                    break;
                case EMPLOYEE_PART_TIME:
                    empHours = PART_TIME_HOUR;
                    break;
                default:
                    empHours = 0;
            }
            totalEmpHrs = totalEmpHrs + empHours;
            System.out.println("Day : " + totalWorkingDays + " Employee Hours : " + empHours);
        }
        totalEmpWage = totalEmpHrs * emRatePerHours;
    }
    @Override
    public String toString()
    {
        return "Total Employee Wage for company : " + company + " is : \'" +
                "totalEmpWage : " + totalEmpWage;
    }

    public static void main(String[] args) // Main
    {
        EmployeeWage airtel = new EmployeeWage("Airtel",20,2,10);
        EmployeeWage jio = new EmployeeWage("Jio", 15,4,20);
        airtel.calculateEmployeeSalary();
        System.out.println(airtel);
        jio.calculateEmployeeSalary();
        System.out.println(jio);
    }
}