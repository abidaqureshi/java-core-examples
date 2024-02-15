package main.java.classesInDepth.Enums;

/**
 * ENUM with abstract method
 */

public enum EnumSample4 {

    MONDAY {
        public void dummyMethod() {
            System.out.println("Monday");
        }
    },
    TUESDAY {

        public void dummyMethod() {
            System.out.println("Tuesday");
        }
    },
    WEDNESDAY {
        public void dummyMethod() {
            System.out.println("Wednesday");
        }
    },
    THURSDAY {
        public void dummyMethod() {
            System.out.println("Thursday");
        }
    },
    FRIDAY {
        public void dummyMethod() {
            System.out.println("Friday");
        }
    },
    SATURDAY {
        public void dummyMethod() {
            System.out.println("Saturday");
        }
    },
    SUNDAY {
        public void dummyMethod() {
            System.out.println("Sunday");
        }
    };

    public abstract void dummyMethod();
}
