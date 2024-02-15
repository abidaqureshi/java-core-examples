package main.java.Exceptions;

public class Main10 {

    public static void main ( String args[])  {

        try {
            method_1("dummy");
        }catch(ClassNotFoundException exceptionObject){

        }finally {
            System.out.println("inside finally");
        }

    }

    public static void method_1 (String name) throws ClassNotFoundException {

        if( name.equals("dummy")) {
            throw new ClassNotFoundException();
        }

    }
}
