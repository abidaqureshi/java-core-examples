package main.java.classesInDepth.Intefaces.functionalInterfaces;

import java.util.function.Supplier;

public class Main {

    public static void main(String args[]) {

        Bird sparrow = new Eagle();
        sparrow.canFly("sparrow ");

        Bird crow = new Bird() {
            @Override
            public void canFly(String name) {
                System.out.println(name+" can fly");
            }
        };

        crow.canFly("Crow");

        //Implementation of functional interface
        Bird doveObject = (String val) -> {
            System.out.println("the string value is "+val);
        };

        doveObject.canFly("Vertical");

        //Implementing another functional interface using lambda expression
        Wolf wolf = (String name) -> {
            System.out.println(name+"can run and hunt deer");
        };

        wolf.canHunt("Black wolf");

        Consumer<Integer> consObj = (Integer val) -> {
            if ( val > 10) {
                System.out.println(" the running speed of consumer is "+val);
            }

        };

        consObj.accept(12);

        Supplier<String> isEvenObj = () -> {
            return "The number is even";
        };

        isEvenObj.get();

        Function<Integer, String> fnObj = (Integer n)-> {
            if ( n > 5 ) {
                return "the number is greater than 5";
            }else {
                return "";
            }
        };

        fnObj.apply(10);

        Predicate<Integer> predOb = (Integer val) -> {
            if ( val%2 == 0 ) {
                return true;
            }else {
                return false;
            }
        };

        System.out.println("5 is even "+predOb.isEven(5));

        PeaCock p = ()->true;
        System.out.println("the ouput of the peacock can fly "+p.canFly());
    }
}
