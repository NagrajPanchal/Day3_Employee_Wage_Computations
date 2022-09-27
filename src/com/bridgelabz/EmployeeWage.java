// UC2 Employee Day Wage

package com.bridgelabz;
public class EmployeeWage
{
    private static void employeeDayWage()
    {
        int EMPLOYEE_PRESENT = 1; // Variable initialization
        int checkEmployee = (int) ((Math.floor(Math.random()* 10)) % 2);
        int empWagePerHour =20;
        int dayHours = 8;
        int dayWage = empWagePerHour * dayHours;
        if(checkEmployee == EMPLOYEE_PRESENT)
        {
            System.out.println("Employee is Present");
            System.out.println("Employee Daily Wage : " +dayWage);
        }
        else
        {
            System.out.println("Employee is Absent");
        }

    }
    public static void main(String[] args)
    {
        employeeDayWage();
    }
}