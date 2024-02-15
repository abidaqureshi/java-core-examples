package main.java.classesInDepth.SingletonAndImmutable;

public class DoubleCheckLockDbConnection {

    private static volatile DoubleCheckLockDbConnection dbConnection;

    private DoubleCheckLockDbConnection() {

    }

    public static DoubleCheckLockDbConnection getInstance() {
        if ( dbConnection == null ){
            synchronized (DoubleCheckLockDbConnection.class) {
                if ( dbConnection == null ) {
                    dbConnection = new DoubleCheckLockDbConnection();
                }
            }
        }

        return dbConnection;
    }
}
