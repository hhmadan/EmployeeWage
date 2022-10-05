//UC2_Calculate Daily Employee Wage : Assume Wage Per Hr=20 and Full Day Hr=8
package com.employeewage;

public class DailyEmployeeWage {
    public static void main(String[] args) {
        int empPresent = 1;
        int wagePerHr = 20;
        int fullDayHrs = 8;

        java.util.Random random = new java.util.Random();
        int tmp = random.nextInt(2) + 1;
        if (empPresent == tmp) {
            System.out.println("Employee is Present");
            System.out.println("Employee Wage for the Day is: " + (wagePerHr * fullDayHrs));
        } else {
            System.out.println("Employee is Absent");
            System.out.println("Employee Wage for the Day is: 0");
        }
    }
}
