package main.java.constructorsPractice;

public class Manager extends Person{

    Manager (int empID, int age ) {
        super(age);
        System.out.println("Manager class extend from with employee ID "+empID);
    }
}
