// UC6 Employee Calculate Total Working Hours and day wages a

package com.bridgelabz;
public class EmployeeWage
{
    private static void employeeCalculateHours()
    {
        final int EMPLOYEE_FULL_TIME = 2; // Variable initialization
        final int EMPLOYEE_PART_TIME = 1;
        final int EMP_WAGE_PER_HOUR =20;
        final int FULL_TIME_HOUR = 8;
        final int PART_TIME_HOUR = 4;
        int day = 0;
        int monthWages = 0;
        int dayWage = 0;
        int totalHours = 0;
        if (totalHours < 100 && day < 20) {
            for (day = 0; day <= 20; day++) {
                int checkEmployee = (int) ((Math.floor(Math.random() * 10)) % 3);
                switch (checkEmployee) {
                    case EMPLOYEE_FULL_TIME:
                        dayWage = EMP_WAGE_PER_HOUR * FULL_TIME_HOUR;
                        totalHours = totalHours + FULL_TIME_HOUR;
                        System.out.println("Employee day " + day + " is Full Present & Daily Wage : " + dayWage + " & Hours " + totalHours);
                        break;
                    case EMPLOYEE_PART_TIME:
                        dayWage = EMP_WAGE_PER_HOUR * PART_TIME_HOUR;
                        totalHours = totalHours + PART_TIME_HOUR;
                        System.out.println("Employee day " + day + " is Part Time Present & Daily Wage : " + dayWage + " & Hours " + totalHours);
                        break;
                    default:
                        int isAbsent = 0;
                        System.out.println("Employee day " + day + " is Absent & Daily Wage : " + isAbsent);
                }
                monthWages = monthWages + dayWage;
            }
            System.out.println("Employee per Month Wages : " + monthWages + " & Total Hours " + totalHours);
        }
        else
        {
            System.out.println("Employee per Month Wages : " + monthWages + " & Total Hours " + totalHours);
        }
    }
    public static void main(String[] args) // Main
    {
        employeeCalculateHours();
    }
}