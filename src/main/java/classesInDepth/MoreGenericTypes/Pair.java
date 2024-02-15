package main.java.classesInDepth.MoreGenericTypes;

public class Pair<K,V> {

    K key;
    V value;

    public void setValue ( K key, V value ) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }


}

