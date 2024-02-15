package main.java.classesInDepth.StaticNestedClasses;

public class OuterClass {

    int employeeID;
    static String employeeName = "John doe";

    public static class NestedClass {

        public void print () {
            System.out.println("Employee name "+employeeName);
        }
    }
}
