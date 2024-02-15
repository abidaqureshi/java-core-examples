package main.java.Exceptions;

import main.java.Annotations.ParentClass;

import java.io.FileNotFoundException;

public class Main5 {

    public static void main ( String args[])  {

        try {
            method_1("dummy");
        }catch ( ClassNotFoundException exceptionObject) {
            //handle it here
        }catch ( InterruptedException exceptionObject ) {
            // handle it here
            /*
                Only handle those exceptions which are going be thrown or suppose to appear in try block
            */
        }//catch ( FileNotFoundException exceptionObject ) {

        //}


    }

    public static void method_1 (String name) throws ClassNotFoundException, InterruptedException  {

        if ( name.equals("dummy")) {
            throw new ClassNotFoundException();
        }else if ( name.equals("interrupted")) {
            throw new InterruptedException();
        }
    }
}
