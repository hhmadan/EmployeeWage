//UC4_Adding Part Time Employee Wage Using Switch Case Statement..
package com.employeewage;

public class AddPartTimeEmpWageCaseStatement {
    public static void main(String[] args) {
        int halfTime = 1;
        int fullTime = 2;
        int wagePerHr = 20;
        int empHrs;
        java.util.Random random = new java.util.Random();
        int tmp = random.nextInt(3) + 1;
        switch (tmp){
            case 1:
                empHrs=4;
                System.out.println("Employee is Present for Half Day");
                break;
            case 2:
                empHrs=8;
                System.out.println("Employee is Present for Full Day");
                break;
            default:
                empHrs=0;
                System.out.println("Employee is Absent");
        }
        System.out.println("Employee Wage is: "+(wagePerHr*empHrs));

    }
}
