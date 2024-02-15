package main.java.classesInDepth.RawGenericClasses;

public class RawGenericClass<T> {

    T value;

    public T getPrintValue( ) {
        return this.value;
    }

    public void setValue ( T val ) {
        this.value = val;
    }

}
