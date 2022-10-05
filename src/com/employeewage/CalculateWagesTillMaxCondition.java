//UC6_Calculate Wages till a condition of total working hours or days is reached for a month
//Assuming 100 hours and 20 days
package com.employeewage;

import java.util.Random;

public class CalculateWagesTillMaxCondition {
    public static void main(String[] args) {
        int empHrs;
        int maxHrs=100;
        int wagePerHr=20;
        int totalEmpHrs=0;
        int workingDays=20;
        int totalWorkingDays=0;


        while (totalEmpHrs < maxHrs && totalWorkingDays < workingDays) {
            totalWorkingDays++;
            Random r = new Random();
            int tmp = r.nextInt(3);

            switch (tmp) {
                case 1:
                    empHrs = 4;
                    break;
                case 2:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs = totalEmpHrs + empHrs;
        }

        int totalSalary = totalEmpHrs * wagePerHr;
        System.out.println("Total Salary is: "+totalSalary);
    }
}
