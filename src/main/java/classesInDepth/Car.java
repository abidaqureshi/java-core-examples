package main.java.classesInDepth;

public abstract class Car {

    int mileage;

    Car( int mileage ) {
        this.mileage = mileage;
    }

    public abstract void pressBreaks ();
    public abstract void pressClutch ();

    public int getNumberOfWheels () {
        return this.mileage;
    }

}
