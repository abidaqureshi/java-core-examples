package main.java.classesInDepth.SingletonAndImmutable;

public class LazyDBConnection {

    private static LazyDBConnection dbConnection;

    private LazyDBConnection() {

    }

    public static LazyDBConnection getInstance() {
        if ( dbConnection == null ) {
            dbConnection = new LazyDBConnection();
        }

        return dbConnection;
    }
}
