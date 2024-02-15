package main.java.classesInDepth.Intefaces.methods;

public class Main {
    public static void main ( String args[]) {
        Bird parrot = new Parrot();
        parrot.getMinimumFlyHeight();
        Sparrow sparrow = new Sparrow();
        sparrow.getMinimumFlyHeight();

        Bird whiteHawk = new WhiteHawk();
        whiteHawk.canBreath();
    }
}
