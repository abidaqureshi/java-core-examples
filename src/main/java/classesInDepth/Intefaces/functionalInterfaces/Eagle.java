package main.java.classesInDepth.Intefaces.functionalInterfaces;

public class Eagle implements Bird{

    @Override
    public void canFly(String name) {
        System.out.println(name+"The bird eagle implementation ");
    }
}
