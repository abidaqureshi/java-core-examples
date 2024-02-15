package main.java.Exceptions;

public class Main4 {

    public static void main ( String args[])  {

        try {
            method_1();
        }catch ( ClassNotFoundException exceptionObject) {
            //handle it here
        }


    }

    public static void method_1 () throws ClassNotFoundException  {

        throw new ClassNotFoundException();
    }
}
