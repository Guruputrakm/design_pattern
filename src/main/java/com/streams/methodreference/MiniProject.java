package com.streams.methodreference;

import com.streams.Emp;

import java.util.stream.Stream;

record EmployeeDTO(String name, Long salary){
    @Override
    public String toString() {
        return "The Name is "+name+"and Salary is "+salary;
    }
};
class EmployeeManager {

    static boolean isHighSalary(Emp e) {
        return e.getSalary()  > 35000;
    }

    EmployeeDTO convertEmp(Emp e) {
        return new EmployeeDTO(e.getName(), e.getSalary());
    }

}
public class MiniProject {

    public static void main(String[] args) {
        MiniProject miniProject = new MiniProject();

        Stream.of(new Emp("1", "Guru", 50000L),
                new Emp("2", "Amar", 35000L),
                new Emp("3", "Durga", 60000L)
        ).filter(EmployeeManager::isHighSalary)
                .map(Emp::convertEmp)
                .forEach(System.out::println);
        Stream.of(1000,2000).map(String::valueOf).forEach(System.out::println);

        Stream.of(new Emp("1", "Guru", 50000L),
                new Emp("2", "Amar", 35000L),
                new Emp("3", "Durga", 60000L)
        ).map(Emp::getName).map(name -> "Welcome "+name).toList();
    }
}

