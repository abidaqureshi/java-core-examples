package main.java.classesInDepth.GenericWithMulitbound;

/*
*  Multi Bound
* <T extends B implements & interface1 & interface2>
* public class A extends B implements interface1, interface2 {
* }
*
*
*
*
* */

public class AmultiBoundClass<T extends ParentClass & Interface1 & Interface2> {

    T value;

    public T getValue ( ) {
        return this.value;
    }

    public void setValue( T val) {
        this.value = val;
    }

}
