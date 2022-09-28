// UC5 Employee per Month Wages & Working days 20

package com.bridgelabz;
public class EmployeeWage
{
        private static void employeeMonthWages()
        {
            final int EMPLOYEE_FULL_TIME = 2; // Variable initialization
            final int EMPLOYEE_PART_TIME = 1;
            final int EMP_WAGE_PER_HOUR =20;
            final int FULL_TIME_HOUR = 8;
            final int PART_TIME_HOUR = 4;
            int day = 0;
            int monthWages = 0;
            int dayWage = 0;
            for(day = 0; day<=20; day++)
            {
                int checkEmployee = (int) ((Math.floor(Math.random()* 10)) % 3);
                switch (checkEmployee)
                {
                    case EMPLOYEE_FULL_TIME:
                        dayWage = EMP_WAGE_PER_HOUR * FULL_TIME_HOUR;
                        System.out.println("Employee day "+day+" is Full Present & Daily Wage : " + dayWage);
                        break;
                    case EMPLOYEE_PART_TIME:
                        dayWage = EMP_WAGE_PER_HOUR * PART_TIME_HOUR;
                        System.out.println("Employee day "+day+" is Part Time Present & Daily Wage : " + dayWage);
                        break;
                    default:
                        int isAbsent = 0;
                        System.out.println("Employee day "+day+" is Absent & Daily Wage : "+isAbsent);
                }
                monthWages = monthWages + dayWage;
            }
            System.out.println("Employee per Month Wages : "+ monthWages);
        }
        public static void main(String[] args)
        {
            employeeMonthWages();
        }
    }
