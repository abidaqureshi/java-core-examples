package main.java.classesInDepth.PojoClasses;

/**
 * Pojo Classes = Plain old Java object
 * Contains variables and its getter and setter methods
 * Class should be public
 * Public default constructor
 * No annotations should be used like @Table, @Entity and @Id
 * It should not extend any class or implement any interface
 */


public class Student {

    String name;
    private int rollNumber;
    protected String address;

    public String getName() {
        return this.name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public int getRollNumber() {
        return this.rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
