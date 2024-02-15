package main.java.classesInDepth.Intefaces.methods;

//Class does not need to provide implementation of the default method
public class WhiteHawk implements Hawk{
    @Override
    public void canFly() {

    }

    @Override
    public int getMinimumFlyHeight() {
        return 0;
    }
}
