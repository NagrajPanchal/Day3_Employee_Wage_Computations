// UC3 Employee Full time & Part Time

package com.bridgelabz;
public class EmployeeWage
{
    private static void employeeFullPartTime()
    {
        int EMPLOYEE_PRESENT = 1; // Variable initialization
        int checkEmployee = (int) ((Math.floor(Math.random()* 10)) % 3);
        int empWagePerHour =20;
        int fullTimeHour = 8;
        int partTimeHour = 4;
        int fullDayWage = empWagePerHour * fullTimeHour;
        int partDayWage = empWagePerHour * partTimeHour;
        if(checkEmployee == EMPLOYEE_PRESENT)
        {
            System.out.println("Employee is Full Present & Daily Wage : " +fullDayWage);
        }
        else if (checkEmployee !=0)
        {
            System.out.println("Employee is Part Time Present & Daily Wage : " +partDayWage);
        }
        else
        {
            System.out.println("Employee is Absent");
        }

    }
    public static void main(String[] args)
    {
        employeeFullPartTime();
    }
}