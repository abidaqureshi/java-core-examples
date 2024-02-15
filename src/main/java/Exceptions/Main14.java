package main.java.Exceptions;

public class Main14 {

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
    public int Method ( int schoolClassNumber) {
        // Example code
        /*
        int errorCode = 0;

        if ( schoolClassNumber > 0 && schoolClassNumber <= 12 ) {

            int noOfStudents = getStudentCapacityOfClass(schoolClassNumber);
            if (noOfStudents != 0 ) {
                String[] names = new String[noOfStudents];
                if ( names != null && names.length > 0) {
                    names[0] = "new value";
                }else {
                    return -3;
                }
            }else {
                return -2;
            }
        }else{
            errorCode = -1;
        }

        return errorCode;
    }*/
        return 0;
    }
}
