package main.java.Exceptions;

public class Main15 {

    public static void main ( String args[])  {

        try {
            method_1("dummy");
        }catch(MyCustomException e){
            //handle it here
        }finally {
            System.out.println("inside finally");
        }

    }

    public static void method_1 (String name) throws MyCustomException {

        if( name.equals("dummy")) {
            throw new MyCustomException("some issue appears");
        }

    }

    //code without exception
    public void Method ( int schoolClassNumber) {
        /*
        Code example
        try {
            int noOfStudents = getStudentCapacityOfClass(schoolClassNumber);
            String[] names = new String[noOfStudents];
            names[0] = "new value";
        }catch(ArrayIndexOutOfBoundsException e) {
            // do something
        }finally {

        }*/
    }
}
