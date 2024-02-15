package main.java.Exceptions;

public class Main {

    public static void main (String args[]) {

        Main obj = new Main();

        //IllegalArgumentException | NumberFormatException
        int s = Integer.parseInt("hello");

        //NullPointerException
        String var = null;
        System.out.println(var.charAt(0));

        //StringIndexOutOfBoundException
        String str = "hello";
        System.out.println(str.charAt(6));

        //ArrayIndexOutOfBoundException out of bound exception
        int[] v = new int[2];
        System.out.println(v[3]);

        //Class cast exception
        Object val = 0;
        System.out.println((String) val);


        obj.method_1();


    }

    public void method_1() {
        //Arithmetic exception
        throw new ArithmeticException();
    }

    public void method_2() {
        method_3();
    }

    public int method_3() {

        return 5/0;
    }
}
