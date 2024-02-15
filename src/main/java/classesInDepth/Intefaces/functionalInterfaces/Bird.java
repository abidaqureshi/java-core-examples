package main.java.classesInDepth.Intefaces.functionalInterfaces;

//@FunctionalInterface
//public interface Bird extends LivingThing {
//    void canFly(String name);
//}

@FunctionalInterface
public interface Bird extends FlyingThing{
    void canFly(String name);
}