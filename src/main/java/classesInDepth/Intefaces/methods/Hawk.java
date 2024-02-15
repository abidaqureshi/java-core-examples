package main.java.classesInDepth.Intefaces.methods;

public interface Hawk extends Bird{

    @Override
    default boolean canBreath() {
        //Using its parent implementation or can provide its own implementation
        boolean isBreathing = Bird.super.canBreath();
        return isBreathing;
    }
}
