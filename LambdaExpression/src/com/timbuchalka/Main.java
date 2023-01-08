package com.timbuchalka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee john = new Employee("John Smith", 22);
        Employee zee = new Employee("Zee Kan", 42);
        Employee ade = new Employee("Ade Stam", 51);
        Employee jag = new Employee("John Doe", 10);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(zee);
        employees.add(ade);
        employees.add(jag);

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return employee1.getName().compareTo(employee2.getName());
//            }
//        });

        // Java8: replacing the 5 lines above with 1 line of lambda
        //Collections.sort(employees, (employee1, employee2) -> employee1.getName().compareTo(employee2.getName()));

        // Java17: replacing the java8 lambda above with List to sort and Comparator.comparing
        employees.sort(Comparator.comparing(Employee::getName));


        for (Employee employee:
             employees) {
            System.out.println(employee.getName());
        }
    }
}

class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
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
}

