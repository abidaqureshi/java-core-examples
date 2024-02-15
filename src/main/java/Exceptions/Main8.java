package main.java.Exceptions;

public class Main8 {

    public static void main ( String args[])  {

        try {
            method_1("dummy");
        }catch (ClassNotFoundException | InterruptedException exception) { //In single catch you can handle multiple exceptions

        }catch ( Exception exceptionObject ) {
            //handle it here
                //Catch all exceptions
        }


    }

    public static void method_1 (String name) throws ClassNotFoundException, InterruptedException  {

        if ( name.equals("dummy")) {
            throw new ClassNotFoundException();
        }else if ( name.equals("interrupted")) {
            throw new InterruptedException();
        }
    }
}
