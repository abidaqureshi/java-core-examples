package main.java.classesInDepth.UpperBoundGeneric;

public class UpperBoundGenericClass <T extends Number> {

    T value;

    public T getIntValue () {
        return this.value;
    }

    public void setInValue ( T val ) {
        this.value = val;
    }

}
