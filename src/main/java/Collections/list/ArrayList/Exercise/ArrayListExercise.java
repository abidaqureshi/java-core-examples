package main.java.Collections.list.ArrayList.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListExercise {

    public static void main(String args[]) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Alex", 23, "USA"));
        list.add(new Employee("Dave", 34, "India"));
        list.add(new Employee("Carl", 21, "USA"));
        list.add(new Employee("Joe", 56, "Russia"));
        list.add(new Employee("Amit", 64, "China"));
        list.add(new Employee("Ryan", 19, "Brazil"));

        //Problem 1: Find employees aged over 50
        List<Employee> empList = list.stream().filter((employee)->employee.age > 50).collect(Collectors.toList());
        for ( Employee emp : empList) {
            System.out.println(emp.age);
        }

        //Problem 2: Find employees from the USA
        Iterator<Employee> iterator = list.iterator();
        while (iterator.hasNext()) {
            if ( iterator.next().country.equals("USA")) {
                iterator.remove();
            }
        }

        for ( Employee emp : list) {
            System.out.println(emp.country);
        }

        //Problem 3: Sort employees by country
        list.add(new Employee("Alex", 23, "USA"));
        list.add(new Employee("Dave", 34, "India"));
        list.add(new Employee("Carl", 21, "USA"));
        list.add(new Employee("Joe", 56, "Russia"));
        list.add(new Employee("Amit", 64, "China"));
        list.add(new Employee("Ryan", 19, "Brazil"));

        Collections.sort(list,(emp1, emp2)->emp1.country.compareTo(emp2.country));

        for(Employee employee: list) {
            System.out.println("the employee sorted by country "+employee.country);
        }


    }


}
