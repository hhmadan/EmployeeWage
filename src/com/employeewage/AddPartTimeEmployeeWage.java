// UC3_Add part-time employee wage
package com.employeewage;

public class AddPartTimeEmployeeWage {
    public static void main(String[] args) {
        int halfTime = 1;
        int fullTime = 2;
        int wagePerHr = 20;
        int empHrs;
        java.util.Random random = new java.util.Random();
        int tmp = random.nextInt(3) + 1;
        if (fullTime==tmp){
            System.out.println("Employee Present for Full Time");
            empHrs=8;
        }
        else if (halfTime==tmp){
            System.out.println("Employee Present for Half Time");
            empHrs=4;
        }
        else{
        System.out.println("Employee is Absent");
            empHrs=0;
        }
        System.out.println("Employee Wage is: "+wagePerHr*empHrs);
        }
}