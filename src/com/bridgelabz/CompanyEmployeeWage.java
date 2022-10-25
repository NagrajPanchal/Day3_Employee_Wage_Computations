// UC-10_Manage multiple Companies Employee wage


package com.bridgelabz;

public class CompanyEmployeeWage {
    public String company;
    public int emRatePerHours;
    public int numberOfWorkingDays;
    public int maxHoursPerMonth;
    public int totalEmpWage;
    public CompanyEmployeeWage(String company, int emRatePerHours, int numberOfWorkingDays, int maxHoursPerMonth)
    {
        this.company = company;
        this.emRatePerHours = emRatePerHours;
        this.numberOfWorkingDays = numberOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public CompanyEmployeeWage()
    {

    }

    public void setTotalEmpWage(int totalEmpWage)
    {
        this.totalEmpWage = totalEmpWage;
    }

    public int getTotalEmpWage()
    {
        return totalEmpWage;
    }

    @Override
    public String toString() {
        return "CompanyEmployeeWage{" +
                "company='" + company + '\'' +
                ", emRatePerHours=" + emRatePerHours +
                ", numberOfWorkingDays=" + numberOfWorkingDays +
                ", maxHoursPerMonth=" + maxHoursPerMonth +
                ", totalEmpWage=" + totalEmpWage +
                '}';
    }
//    @Override
//    public String toString() {
//        return "Total Employee Wage for company : " + company + " is : \'" +
//                "totalEmpWage : " + totalEmpWage;
//    }
}
