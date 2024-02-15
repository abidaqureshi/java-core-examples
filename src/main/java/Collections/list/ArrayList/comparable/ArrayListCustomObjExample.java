package main.java.Collections.list.ArrayList.comparable;

import main.java.Collections.list.ArrayList.comparable.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Sorting Employee objects who implemented comparable interface
public class ArrayListCustomObjExample {

    public static void main ( String args[]) {

        Employee employee = new Employee("John doe", 21);
        Employee employee1 = new Employee("Steve", 34);
        Employee employee2 = new Employee("Steward", 44);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);

        Collections.sort(employeeList);

        for ( Employee emp : employeeList) {
            System.out.println("employees "+emp.name+" "+emp.age);
        }


    }


}
