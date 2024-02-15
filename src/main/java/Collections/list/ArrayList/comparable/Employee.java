package main.java.Collections.list.ArrayList.comparable;

//Implementing comparable interface for sorting
public class Employee implements Comparable<Employee> {

    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Employee o) {
        return (this.age - o.age);
    }
}
