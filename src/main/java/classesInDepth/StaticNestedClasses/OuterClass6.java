package main.java.classesInDepth.StaticNestedClasses;

public class OuterClass6 {

    int instanceVariable = 20;
    static int classVariable = 40;

    static class NestedInnerClass {

        int nestedInnerClassVar = 30;

        public void display () {
            System.out.println("the static nestedInnerVariable "+classVariable);
        }

    }

    public class InnerClass8 extends OuterClass6.NestedInnerClass {

        public void display1() {
            display();
        }

    }

}
