package main.java.classesInDepth.Intefaces;

public class Hen implements Bird{

    @Override
    public void fly() {
        System.out.println("Hen does not fly");
    }

    @Override
    public void hasBeak() {

    }
}
