package main.java.Exceptions;

public class Main7 {

    public static void main ( String args[])  {

        try {
            method_1("dummy");
        }catch ( Exception exceptionObject ) { //Already Caught Above
            //handle it here
                //Catch all exceptions
        }//catch ( ClassNotFoundException exceptionObject) {
//
//        }


    }

    public static void method_1 (String name) throws ClassNotFoundException, InterruptedException  {

        if ( name.equals("dummy")) {
            throw new ClassNotFoundException();
        }else if ( name.equals("interrupted")) {
            throw new InterruptedException();
        }
    }
}
