package main.java.classesInDepth.InnerClasses;

public class OuterClass3 {

    public int instanceEmpID = 234;
    public static String classVariable = "John doe ";

    public class InnerClass {

        public void print ( ) {
            System.out.println("The InnerClass can access both class and instance variable "+classVariable+" emp ID "+instanceEmpID);
        }

    }
}
