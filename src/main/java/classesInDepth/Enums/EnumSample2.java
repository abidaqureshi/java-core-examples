package main.java.classesInDepth.Enums;

/**
 * Enum with custom values
 */
public enum EnumSample2 {

    MONDAY(101, "1st day of the week"),
    TUESDAY(102, "2nd day of the week"),
    WEDNESDAY(103, "3rd day of the week"),
    THURSDAY(104, "4th day of the week"),
    FRIDAY(105, "5th day of the week"),
    SATURDAY(106, "1st holiday of the week"),
    SUNDAY(107, "2nd holiday of the week");


    private int keyNumber;
    private String comment;

    EnumSample2 (int keyNumber, String comment) {
        this.keyNumber = keyNumber;
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public int getKeyNumber() {
        return keyNumber;
    }

    public static EnumSample2 getValueByKey(int keyNumber) {
        for ( EnumSample2 sample : EnumSample2.values()) {
            if ( sample.keyNumber == keyNumber ) {
                return sample;
            }
        }
        return null;
    }
}
