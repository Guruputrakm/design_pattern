package com.streams.practice;

class Employee {
    private String name;
    private String department;
    private int yearsOfExperience;
    private double salary;
    private boolean active;

    public Employee() {
    }

    public Employee(String name, String department, int yearsOfExperience, double salary, boolean active) {
        this.name = name;
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", salary=" + salary +
                ", active=" + active +
                '}';
    }
}