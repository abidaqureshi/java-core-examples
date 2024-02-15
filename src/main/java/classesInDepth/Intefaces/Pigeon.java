package main.java.classesInDepth.Intefaces;

public class Pigeon implements Animal, Animal.NonAnimal{
    @Override
    public void canFly() {
        // implementation will go here
        System.out.println("Pigeon is flying");
    }

    @Override
    public void canRun() {
        // Implementation should go here
    }
}
