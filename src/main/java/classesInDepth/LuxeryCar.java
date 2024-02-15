package main.java.classesInDepth;

public abstract class LuxeryCar extends Car {

    LuxeryCar(int mileage ) {
        super(mileage);
    }

    public abstract void pressDualBreakSystem();

    @Override
    public void pressBreaks() {

    }

}
