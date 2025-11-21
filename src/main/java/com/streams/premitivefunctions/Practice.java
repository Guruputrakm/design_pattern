package com.streams.premitivefunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

class Emp1 {
    private String name;
    private int salary;

    public Emp1(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp1{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class Practice {

    static Emp1[] emp1s = new Emp1[]{
            new Emp1("Guru",20_000),
            new Emp1("Kiran",40_000),
            new Emp1("Sunil",10_000),
            new Emp1("Amar",20_000)};
    public static void main(String[] args) {

        IntStream.range(0, emp1s.length).filter(Practice::salaryFilter).peek(Practice::applyHike).forEach(Practice::printTotalAndAvgSal);

    }
    public static boolean salaryFilter(int index){
        return emp1s[index].getSalary() < 30_000;
    }
    public static void applyHike(int index) {
        int newSal = emp1s[index].getSalary()+ (int) (emp1s[index].getSalary() * 0.1);
        emp1s[index].setSalary(newSal);
    }
    public static void printTotalAndAvgSal(int index){
        if (index == emp1s.length-1) {
            int totalSalary = Arrays.stream(emp1s).mapToInt(Emp1::getSalary).sum();
            int avg = (int) Arrays.stream(emp1s).mapToInt(Emp1::getSalary).average().getAsDouble();
            System.out.println("The Salary sum is " + totalSalary + " and the avg is " + avg);
        }
    }

}
