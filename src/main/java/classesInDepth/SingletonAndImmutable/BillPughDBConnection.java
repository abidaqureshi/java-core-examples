package main.java.classesInDepth.SingletonAndImmutable;

public class BillPughDBConnection {

    private BillPughDBConnection ( ) {

    }

    private static class DbConnectionHelper {
        private static final BillPughDBConnection DB_INSTANCE_OBJECT = new BillPughDBConnection();
    }

    public static BillPughDBConnection getInstance() {
        return DbConnectionHelper.DB_INSTANCE_OBJECT;
    }

}
