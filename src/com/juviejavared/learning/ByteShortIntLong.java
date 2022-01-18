package com.juviejavared.learning;

public class ByteShortIntLong {
    public static void main(String[] args){
        ByteShortIntLong.minMaxIntValues();
        ByteShortIntLong.byteMinMaxValues();
        ByteShortIntLong.shortMinMaxValues();
        ByteShortIntLong.longMinMaxValues();
    }

    //int primitive type
    public static void minMaxIntValues(){
        int myMinimumValue = Integer.MIN_VALUE;
        int myMaximumValue = Integer.MAX_VALUE;
        System.out.println("My minimum value for int is " +myMinimumValue);
        System.out.println("My maximum value for in is "+myMaximumValue);
    }

    //byte primitive type
    public static void byteMinMaxValues(){
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("My minimum byte value is "+myMinByteValue);
        System.out.println("My maximum byte value is "+myMaxByteValue);
        byte myNewByteValue = (byte) (myMinByteValue/2);
    }

    public static void shortMinMaxValues(){
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("My minimum short value is "+myMinShortValue);
        System.out.println("My maximum short value is "+myMaxShortValue);
        short myNewShortValue = (short)(myMinShortValue/2);
    }

    public static void longMinMaxValues(){
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("My minimum long value is "+myMinLongValue);
        System.out.println("My maximum long value is "+myMaxLongValue);
        long myNewLongValue = (myMinLongValue/2);
    }

    //the challenge
    public static void primitivesChallenge(){
        int validIntNumber = 12;
        byte validByteNumber = 12;
        short validShortNumber = 13;
        
    }
}
