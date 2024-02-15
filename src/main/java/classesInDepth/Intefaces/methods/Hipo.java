package main.java.classesInDepth.Intefaces.methods;

public interface Hipo {

    void canFly(); // This is equivalent to public abstract void canFly() // Java 8

    public default void minimumFlyingHeight(){ // Java 8
            myStaticPublicMethod(); //Calling static method
            myPrivateMethod(); // calling private method
            myPrivateStaticMethod(); // calling private static method
    }

    static void myStaticPublicMethod() { // Java 9
        myPrivateStaticMethod(); // From static method you can call static method only
    }

    private void myPrivateMethod() { // Java 9
        //Private method implementation
    }

    private static void myPrivateStaticMethod(){ // Java 9
        //Private static method implementation
    }


}
