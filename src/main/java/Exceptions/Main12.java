package main.java.Exceptions;

public class Main12 {

    public static void main ( String args[])  {

        try {
            method_1("dummy");
        }finally {
            System.out.println("inside finally");
        }

    }

    public static void method_1 (String name) throws ArithmeticException {

        if( name.equals("dummy")) {
            throw new ArithmeticException();
        }

    }
}
