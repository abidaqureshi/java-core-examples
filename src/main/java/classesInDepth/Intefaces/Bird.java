package main.java.classesInDepth.Intefaces;

public interface Bird {

    /**
     * by default its public static final which is constant you don't need write while
        defining field in interface
     */

    int MAX_HEIGHT_IN_FEET = 2000;

    //Default public
    void fly();

    public void hasBeak();
}
