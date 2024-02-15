package main.java.classesInDepth.InnerClasses;

public class OuterClass5 {
    int instanceVariable = 10;
    static int classVariable = 40;

    class InnerClass {
        int innerClassVar = 5;
    }

    public class InnerClass2 extends  InnerClass {
        int innerClass2Var = 4;

        public void display () {
            System.out.println(innerClass2Var+""+innerClassVar+""+instanceVariable+""+classVariable);
        }
    }
}
