package com.timbuchalka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainSelfTempDelete {

    public static void main(String[] args) {
	    List<String> someBingoNumbers = Arrays.asList(
	            "N40", "N36",
                "B12", "B6",
                "G53", "G49", "G60", "G50", "g64",
                "I26", "I17", "I29",
                "O71");

//        List<String> gNumbers = new ArrayList<>();

//        someBingoNumbers.forEach(number -> {
//            if(number.toUpperCase().startsWith("G")) {
//                gNumbers.add(number);
////                System.out.println(number);
//            }
//        });
//
//        gNumbers.sort((String s1, String s2) -> s1.compareTo(s2));
//        gNumbers.forEach((String s) -> System.out.println(s));

        // The above can be achieved with Streams; note that g64 will be printed as G64 in Streams though
        someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s->s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);

        Stream<String> ioNumberStream = Stream.of("I26", "I17", "I29", "O71");
        Stream<String> inNumberStream = Stream.of("N40", "N36", "I26", "I17", "I29", "O71");
        Stream<String> concatStream = Stream.concat(ioNumberStream, inNumberStream);
        System.out.println("-----------------------");
        System.out.println(concatStream
                .distinct() //getting the unique elements from the Stream
                .peek(System.out::println) //intermediate operation e.g for debugging
                .count());

        Employee john = new Employee("John Doe", 30);
        Employee jane = new Employee("Jane Deer", 25);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);


        Department hr = new Department("Human Resources");
        hr.addEmployee(jane);
        hr.addEmployee(jack);
        hr.addEmployee(snow);
        Department accounting = new Department("Accounting");
        accounting.addEmployee(john);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())// flatmap used for nested list
                .forEach(System.out::println);
        System.out.println("--------------");

        List<String> sortedGNumbers1 = someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                //.collect(Collectors.toList());  //collecting stream result to List
                .toList();  //(replacing the above using Java17)

        for(String s : sortedGNumbers1){
            System.out.println(s);
        }
        System.out.println("========sortedGNumbers1 Completed==============");


        List<String> sortedGNumbers2 = someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll); //collecting stream to ArrayList

        for(String s : sortedGNumbers2) {
            System.out.println(s);
        }

        System.out.println("========sortedGNumbers2 Completed==============");
        Map<Integer, List<Employee>> groupedByAge = departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.groupingBy(employee -> employee.getAge()));

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .reduce((e1, e2) -> e1.getAge() < e2.getAge() ? e1 : e2)
                .ifPresent(System.out::println);

        // demonstrating streams is a lazy operation. Would not output the filtered result if terminal operation
        // is not added
        System.out.println("---checking----");
        StringBuilder sb = new StringBuilder();
        Stream.of("ABC", "AC", "BAA", "CCCC", "XY", "ST")
                .filter(s -> {
                    System.out.println(s);
                    sb.append(s).append("\n");
                    return s.length() == 3;
                })
                .count(); // nothing would be printed if this terminal .count isn't added
        System.out.println("------printing sb-----");
        System.out.println(sb);


    }
}














