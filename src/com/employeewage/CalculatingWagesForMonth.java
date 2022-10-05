//UC5_Calculate Wage For Month assuming 20 Working Days per Month...
package com.employeewage;

public class CalculatingWagesForMonth {
    public static void main(String[] args) {
        int halfTime = 1;
        int fullTime = 2;
        int workingDays = 20;
        int wagePerHr = 20;
        int totalSalary = 0;
        int empHrs;

        for (int day=1; day<=workingDays; day++){
            java.util.Random random = new java.util.Random();
            int tmp = random.nextInt(3) + 1;
        switch (tmp){
            case 1:
                empHrs=4;
                break;
            case 2:
                empHrs=8;
                break;
            default:
                empHrs=0;
        }
        int perDaySalary = (empHrs*wagePerHr);
        totalSalary = (totalSalary+perDaySalary);
        }
        System.out.println("Employee Wage for Month is: "+totalSalary);
    }
}
