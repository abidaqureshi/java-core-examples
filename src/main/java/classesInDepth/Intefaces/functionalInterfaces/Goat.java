package main.java.classesInDepth.Intefaces.functionalInterfaces;

@FunctionalInterface
public interface Goat {

    void canWalk(String name);

    default void canEat() {
        //default method
    }

    static void canRun() {
        //Static method
    }

    String toString();
    //Object class method
}
