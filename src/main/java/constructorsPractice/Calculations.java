package main.java.constructorsPractice;

public class Calculations {

    String name;
    int empID;

    Calculations () {
        this("Superman");
    }

    Calculations (String empName) {
        this(empName, 56);
    }

    Calculations(String empName, int empID) {
        this.name = empName;
        this.empID = empID;
    }



}
