package main.java.classesInDepth.Intefaces.functionalInterfaces;

public interface FlyingThing {
    default void flyHigh() {
        System.out.println("Its flying very high");
    }
}
