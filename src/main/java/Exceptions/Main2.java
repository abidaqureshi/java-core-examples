package main.java.Exceptions;

public class Main2 {

    public static void main ( String args[]) throws ClassNotFoundException  {


        method_1();

    }

    public static void method_1 () throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }
}
