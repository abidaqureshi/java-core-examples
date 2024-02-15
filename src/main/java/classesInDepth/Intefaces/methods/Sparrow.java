package main.java.classesInDepth.Intefaces.methods;

public class Sparrow implements Bird, LivingThing{
    @Override
    public void canFly() {

    }

    @Override
    public int getMinimumFlyHeight() {
        return 200;
    }

    @Override
    public boolean canBreath() {
        return Bird.super.canBreath();
    }
}
