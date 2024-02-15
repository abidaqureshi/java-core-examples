package main.java.classesInDepth.Enums;

/**
 *  Method Override by Constant
 */

public enum EnumSample3 {

    MONDAY {
        @Override
        public void dummyMethod() {
            System.out.println("the dummy method for Monday");
        }
    },
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public void dummyMethod () {
        System.out.println("default dummy Method");
    }
}
