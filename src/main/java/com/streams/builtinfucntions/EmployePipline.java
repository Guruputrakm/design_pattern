package com.streams.builtinfucntions;

import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

record Employee(int id, String name, double salary){};
record EmployeeDTO(int id, String name) {};

interface Validator<T> {
    boolean validate(T t);

    default Validator<T> and(Validator<T> other) {
        Objects.requireNonNull(other);
        return (t) -> validate(t) && other.validate(t);
    }
}
record Customer(String emailId, String mobileNumer, int age, boolean staus){};
public class EmployePipline {
    public static void main(String[] args) {
        Validator<Employee> hasName = e -> e.name()!= null && !e.name().isEmpty();
        Validator<Employee> hasValidSalary = e ->e.salary() > 0;

        if(hasName.and(hasValidSalary).validate(new Employee(1, "Guru",50000))) {
            System.out.println("Tested");
        }

        // Suppose you fetch employees, filter by salary, map to DTOs, and print:
        List<Employee> employees = List.of(
                new Employee(1, "Guru", 50000),
                new Employee(2, "Durga", 35000),
                new Employee(3, "Shiva", 70000),
                new Employee(4, "Neelakanta", 70000)
        );

     /*   employees.stream()
                .filter(hasName.and(hasValidSalary))
                .filter(e ->e.salary() > 10000)
                .map(e -> new EmployeeDTO(e.id(), e.name()))
                .forEach(e -> System.out.println(e.id()+"==>"+e.name()));*/

        List<Customer> customers = List.of(
                new Customer("test@gmail.com", "8951536545", 21, true),
                new Customer("test@gmail.com", "5833", 23, true)
        );

        Predicate<Customer> hasValidEmail = c -> c.emailId().contains("@") && c.emailId().contains(".com") && (c.emailId().endsWith(".com")
                || c.emailId().endsWith("in") ||c.emailId().endsWith(".net"));
        Predicate<Customer> hasValidMobile = c ->c.mobileNumer().length() == 10;
        Predicate<Customer> isAdult = c ->c.age() >= 21;
        Predicate<Customer> hasActiveStatus = c -> c.staus();
        Predicate<Customer> combinedTest = hasValidEmail.and(hasValidMobile).and(isAdult).and(hasActiveStatus);

        System.out.println("===>Tested customer");
        customers.stream()
                .filter(combinedTest).forEach(System.out::println);

        Function<Employee, Double> bounus = employee -> employee.salary() *0.1;
        Function<Double, Double> yearly = newSal -> newSal *12;

        System.out.println("SALARY BOUNCE");
        employees.stream().peek(System.out::println).map(bounus.andThen(yearly)).peek(System.out::println).forEach(System.out::println);
    }
}
