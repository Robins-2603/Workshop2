package com.workShop;

import java.util.Random;


public class EmployeeWage {

    public static final int isFullTime = 1;
    public static final int isPartTime = 2;

    private final String company;
    private final int empWagePerHr;
    private final int noWorkingDays;
    private final int maxHrs;
    private int totalSalary;

//    public int getTotalSalary() {
//        return totalSalary;
//    }
//
//    public void setTotalSalary(int totalSalary) {
//        this.totalSalary = totalSalary;
//    }

    public EmployeeWage(String company, int empWagePerHr, int noWorkingDays, int maxHrs) {
        this.company = company;
        this.empWagePerHr = empWagePerHr;
        this.noWorkingDays = noWorkingDays;
        this.maxHrs = maxHrs;
    }

    public void calcEmpWage(){

        int EmpHr=0;
        int salary=0;
        int totalWrkHrs=0;
        int totalWrkDays=0;

        while( totalWrkHrs<=maxHrs && totalWrkDays<=noWorkingDays) {
            totalWrkDays++;
            double empCheck = Math.floor(Math.random()*10)%3;
            switch ((int)empCheck){
                case isFullTime:
                    System.out.println();
                    EmpHr=8;
                    break;
                case isPartTime:
                    EmpHr=4;
                    break;
                default:
                    EmpHr=0;
                    break;
            }
            salary=empWagePerHr*EmpHr;
            System.out.println(salary);
            totalWrkHrs = totalWrkHrs + EmpHr;
        }
        System.out.println(totalSalary + " is total income for company "+company);
        System.out.println(totalWrkHrs+ " is total total working hrs for company "+company);
        totalSalary = totalWrkHrs*empWagePerHr;

    }

    @Override
    public String toString() {
        return "Total Salary of a Employee is: "+totalSalary+ " for company: "+ company;
    }

    public static void main(String[] args) {
         EmployeeWage reliance = new EmployeeWage("Reliance",25,20,100);
        EmployeeWage bridzeLab = new EmployeeWage("BridzeLab",20,25,100);
        EmployeeWage dMart = new EmployeeWage("DMart",10,25,100);

        reliance.calcEmpWage();
        System.out.println(reliance);

        bridzeLab.calcEmpWage();
        System.out.println(bridzeLab);

        dMart.calcEmpWage();
        System.out.println(dMart);

    }

}
