package main.java.classesInDepth.SingletonAndImmutable;

public class SynchronizeDBConnection {

    private static SynchronizeDBConnection syncDbConnection;

    private SynchronizeDBConnection () {

    }

    synchronized public static SynchronizeDBConnection getInstance( ) {

        if ( syncDbConnection == null ) {
            syncDbConnection = new SynchronizeDBConnection();
        }

        return syncDbConnection;
    }

}
