package com.example.btvnc0922h1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int EmployeeCode;
    private String name;
    private int age;
    private double salary;
    private String branch;


    public Employee() {
    }

    public Employee(int employeeCode, String name, int age, double salary, String branch) {
        EmployeeCode = employeeCode;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.branch = branch;
    }

    public int getEmployeeCode() {
        return EmployeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        EmployeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}



