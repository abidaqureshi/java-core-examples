package main.java.classesInDepth.Intefaces.methods;

public interface Bird {

    public void canFly();
    public int getMinimumFlyHeight();

    default boolean canBreath() {
        return true;
    }

    static boolean canRun() {
        return true;
    }
}
