package main.java.Exceptions;

public class Main3 {

    public static void main ( String args[])  {


        method_1();

    }

    public static void method_1 ()  {

        try {
            throw new ClassNotFoundException();
        } catch(ClassNotFoundException exceptionObject ) {
            exceptionObject.printStackTrace();
        }

    }
}
