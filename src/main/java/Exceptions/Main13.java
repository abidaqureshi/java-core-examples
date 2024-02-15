package main.java.Exceptions;

public class Main13 {

    public static void main ( String args[])  throws ClassNotFoundException {

        try {
            method_1("dummy");
        }catch(ClassNotFoundException e){
            throw e;

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
