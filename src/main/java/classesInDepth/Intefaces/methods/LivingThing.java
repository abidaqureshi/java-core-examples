package main.java.classesInDepth.Intefaces.methods;

public interface LivingThing {

    default boolean canBreath() {
        return true;
    }
}
