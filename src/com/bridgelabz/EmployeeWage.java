package com.bridgelabz;

import java.util.Random;
import java.util.stream.DoubleStream;

public class EmployeeWage
{
    private static void employeePresentAbsent()
    {
        int EMPLOYEE_PRESENT = 1; // Variable initialization
        /*
        double random =  Math.random(); // Random number generating 0 to 1
        double random1 = random * 10; // 1 to 10 number random number generating
        double floor = Math.floor(random1); // Floor function will generate around values
        int floor1 = (int) (floor); // Type Casting because of single digit value
        int var = floor1 % 2; // Mod 2 reminder will produce 0 or 1
        */
        int var = (int) ((Math.floor(Math.random()* 10)) % 2);

        if(var == EMPLOYEE_PRESENT)
        {
            System.out.println("Employee is Present");
        }
        else
        {
            System.out.println("Employee is Absent");
        }

    }
    public static void main(String[] args)
    {
        employeePresentAbsent();
    }
}
