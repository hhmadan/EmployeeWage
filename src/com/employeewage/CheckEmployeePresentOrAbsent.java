// UC_1 Check Employee is Present or Absent
package com.employeewage;

public class CheckEmployeePresentOrAbsent {
    public static void main(String[] args) {
        int empPresent = 1;
        java.util.Random random = new java.util.Random();
        int tmp = random.nextInt(2) + 1;
        if (empPresent == tmp)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
}
