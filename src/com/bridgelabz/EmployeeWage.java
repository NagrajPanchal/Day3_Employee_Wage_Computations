// UC3 Employee Full time & Part Time

package com.bridgelabz;
public class EmployeeWage
{
    private static void employeeFullPartTime()
    {
        final int EMPLOYEE_FULL_TIME = 2; // Variable initialization
        final int EMPLOYEE_PART_TIME = 1;
        int checkEmployee = (int) ((Math.floor(Math.random()* 10)) % 3);
        final int EMP_WAGE_PER_HOUR =20;
        final int FULL_TIME_HOUR = 8;
        final int PART_TIME_HOUR = 4;
        int fullDayWage = EMP_WAGE_PER_HOUR * FULL_TIME_HOUR;
        int partDayWage = EMP_WAGE_PER_HOUR * PART_TIME_HOUR;
        switch (checkEmployee)
        {
            case EMPLOYEE_FULL_TIME :
                System.out.println("Employee is Full Present & Daily Wage : " +fullDayWage);
                break;
            case EMPLOYEE_PART_TIME :
                System.out.println("Employee is Part Time Present & Daily Wage : " +partDayWage);
                break;
            default :
                System.out.println("Employee is Absent");
        }
 }
    public static void main(String[] args)
    {
        employeeFullPartTime();
    }
}