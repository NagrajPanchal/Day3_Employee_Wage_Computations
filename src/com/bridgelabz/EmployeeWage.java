// UC-8_Multiple_Companies Employee Wage

package com.bridgelabz;
public class EmployeeWage
{
    final int EMPLOYEE_FULL_TIME = 2; // Variable initialization
    final int EMPLOYEE_PART_TIME = 1;
    final int FULL_TIME_HOUR = 8;
    final int PART_TIME_HOUR = 4;
    int totalWage = 0;
    int workingHrs = 0;
    int workingDays = 0;
    int dailyWage = 0;

    private void calculateEmployeeSalary(int wagePerHour, int numberOfWorkingDays, int workHrsPerMonth, String company)
    {
        while (workingHrs < workHrsPerMonth && workingDays < numberOfWorkingDays)
        {
            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck)
            {
                case EMPLOYEE_FULL_TIME:
                {
                    dailyWage = FULL_TIME_HOUR * wagePerHour;
                    workingHrs = workingHrs + FULL_TIME_HOUR;
                    break;
                }
                case EMPLOYEE_PART_TIME:
                {
                    dailyWage = PART_TIME_HOUR * wagePerHour;
                    workingHrs = workingHrs + PART_TIME_HOUR;
                    break;
                }
                default:
                    dailyWage = 0;
            }
            workingDays++;
            totalWage = totalWage + dailyWage;
        }
        System.out.println("Total salary for Company " + company + " : " + totalWage);
    }

    public static void main(String[] args) // Main
    {
        EmployeeWage EmpWageObject = new EmployeeWage(); // Object Created
        EmpWageObject.calculateEmployeeSalary(20, 20, 100, "Airtel");
        EmpWageObject.calculateEmployeeSalary(30, 25, 120, "Jio");
    }
}