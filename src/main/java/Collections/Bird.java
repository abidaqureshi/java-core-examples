package main.java.Collections;

public class Bird implements Comparable<Bird>{

    String birdName;
    String birdType;

    Bird ( String birdName, String birdType) {
        this.birdName = birdName;
        this.birdType = birdType;
    }


    @Override
    public int compareTo(Bird o) {
        return this.birdType.compareTo(o.birdType);
    }
}
