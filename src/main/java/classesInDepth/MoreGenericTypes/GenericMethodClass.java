package main.java.classesInDepth.MoreGenericTypes;

public class GenericMethodClass {

    public <K,V> void printValue ( Pair<K,V> pair1, Pair<K,V> pair2 ) {

        if (pair2.getKey().equals(pair1.getKey())) {
            System.out.println("Both pair objects keys are equal");
        }

    }


}
