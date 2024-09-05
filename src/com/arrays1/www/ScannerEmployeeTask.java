package com.arrays1.www;

import java.util.Scanner;

public class ScannerEmployeeTask
{
    String empName;
    int empId;
    long empSal;
    String empDept;
    String empAdd;

    Scanner sc=new Scanner(System.in);
    void method1()
    {
        System.out.println("Enter the employeeName:");
         empName=sc.next();
        System.out.println("Enter the EmployeeId:");
        empId=sc.nextInt();
        System.out.println("Enter the EmployeeSalary:");
         empSal= sc.nextLong();
        System.out.println("Enter the Employee Department");
         empDept=sc.next();
        System.out.println("Enter the Employee Address");
         empAdd=sc.nextLine();
        empAdd=sc.nextLine();
    }
    void display()
    {

        System.out.println("Employee Name:"+empName);
        System.out.println("Employee Id:"+empId);
        System.out.println("Employee Salary:"+empSal);
        System.out.println("Employee Department:"+empDept);
        System.out.println("Employee Address:"+empAdd);


    }

    public static void main(String[] args)
    {
        ScannerEmployeeTask obj=new ScannerEmployeeTask();
        obj.method1();
        System.out.println("=====Employee Details=====");
        obj.display();

    }
}
