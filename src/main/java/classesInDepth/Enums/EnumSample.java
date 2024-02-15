package main.java.classesInDepth.Enums;
/**
 * Enum Classes
 * It has collection CONSTANTS (variables which values can not be changed )
 * Its CONSTANTS are static and final implicitly ( we do not have to write it )
 * It can not extend any class, as it internally extends java.lang.Enum class
 * It can implement interface
 * It can have variables, constructor, methods
 * It can not be initiated ( as its constructor will be private only, even you give default, in byte code it makes
 * it private)
 * No other class can extend Enum class
 * It can have abstract method and all the constant should implement that abstract method.
 */


public enum EnumSample {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY

}