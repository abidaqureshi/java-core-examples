package main.java.classesInDepth;

//Concrete class
public class Audi extends LuxeryCar {

    Audi(int mileage) {
        super(mileage);
    }

    @Override
    public void pressDualBreakSystem() {

    }

    @Override
    public void pressBreaks() {
        super.pressBreaks();
    }

    @Override
    public void pressClutch() {

    }
}
