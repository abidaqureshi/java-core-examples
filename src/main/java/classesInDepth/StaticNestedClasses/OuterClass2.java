package main.java.classesInDepth.StaticNestedClasses;

public class OuterClass2 {

    int instanceVariable = 24;
    static int classVariable = 4334;

    private static class NestedClass2 {

        void print () {
            System.out.println("Static Nested Class can only access class variable "+classVariable);
        }
    }

    public void display() {
        NestedClass2 nestClassObj = new NestedClass2();
        nestClassObj.print();
    }
}
