package main.java.classesInDepth.InnerClasses;

public class OuterClass4 {

    int instanceVariable = 1;
    static int classVariable = 50;

    public void display () {

        int methodVariable = 10;

        class localInnerClass {
            int localInnerClassVariable = 40;

            public void print () {
                System.out.println("instanceVariable "+instanceVariable+" methodVariable "+methodVariable+" localInnerClassVariable "+localInnerClassVariable+" classVariable "+classVariable);
            }
        }

        localInnerClass lInClassObj = new localInnerClass();
        lInClassObj.print();

    }

}
