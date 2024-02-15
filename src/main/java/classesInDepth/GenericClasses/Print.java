package main.java.classesInDepth.GenericClasses;

//Generic type <T> can only be Non-primitive types or Reference types e.g Class or Interface
public class Print<T> {

    public T value;

    public T getPrintVale () {

        return this.value;
    }

    public void setPrintValue(T value ) {
        this.value = value;
    }
}
