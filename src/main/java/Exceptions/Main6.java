package main.java.Exceptions;

import java.io.FileNotFoundException;

public class Main6 {

    public static void main ( String args[])  {

        try {
            method_1("dummy");
        }catch ( ClassNotFoundException exceptionObject) {
            //handle it here

                //Catch all exceptions
        }catch ( Exception exceptionObject ) {

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
