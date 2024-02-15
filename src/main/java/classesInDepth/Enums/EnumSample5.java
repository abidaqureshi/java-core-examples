package main.java.classesInDepth.Enums;

import java.util.Locale;

public enum EnumSample5 implements MyInterface {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    @Override
    public String toLowerCase() {
        return this.name().toLowerCase();
    }
}
