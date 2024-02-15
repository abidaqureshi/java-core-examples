package main.java.classesInDepth.Intefaces.methods;

public class Parrot implements Bird{

    @Override
    public void canFly() {

    }

    @Override
    public int getMinimumFlyHeight() {
        return 100;
    }

    public boolean walkOption () {
        if ( Bird.canRun() ) {
            return true;
        }
        return false;
    }
}
