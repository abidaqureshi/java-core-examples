package main.java.classesInDepth.SingletonAndImmutable;

public class EagerDBConnection {

    private static EagerDBConnection conObject = new EagerDBConnection();

    private EagerDBConnection () {

    }

    public static EagerDBConnection getInstance() {
        return conObject;
    }

}
