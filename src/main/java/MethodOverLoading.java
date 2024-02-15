package main.java;

public class MethodOverLoading {

    public static int addNum ( int a , int b ) {
        return a + b;
    }

    public static float addNum ( int a, int b, int c ) {
        return (a + b + c);
    }





    public static void main( String args[]) {

        System.out.println("the output 2 "+addNum(4,5));
        System.out.println("the output "+addNum(4,5,6));
    }

}
