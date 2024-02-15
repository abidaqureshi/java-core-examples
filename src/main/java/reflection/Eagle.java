package main.java.reflection;

public class Eagle {

    public String breed;
    private boolean canSwim;

    Eagle() {

    }
    public void fly (int intParam, boolean bolParam, String strParam) {
        System.out.println("Fly intParam "+intParam+" boolParam "+bolParam+" strParam "+strParam);
    }

    public void eat() {
        System.out.println("can eat");
    }

}
