package com.company;

public class Integers {

    public static void main(String[] args) {

        //byte,short,int,long

        byte byteVar=15;
        System.out.println("byteVar = " + byteVar);

        System.out.println("bits en el tipo byte: "+ Byte.SIZE);
        System.out.println("bytes en el tipo byte: "+ Byte.BYTES);
        System.out.println("valor minimo tipo bytes: " + Byte.MIN_VALUE);
        System.out.println("valor maximo tipo bytes: " + Byte.MAX_VALUE);

        short shortVar = 15;
        System.out.println("shortVar = " + shortVar);

        System.out.println("bits en el tipo short: "+ Short.SIZE);
        System.out.println("bytes en el tipo short: "+ Short.BYTES);
        System.out.println("valor minimo tipo short: " + Short.MIN_VALUE);
        System.out.println("valor maximo tipo short: " + Short.MAX_VALUE);

        int intVar = 15;
        System.out.println("intVar = " + intVar);

        System.out.println("bits en el tipo int "+  Integer.SIZE);
        System.out.println("bytes en el tipo int: "+ Integer.BYTES);
        System.out.println("valor minimo tipo int: " +  Integer.MIN_VALUE);
        System.out.println("valor maximo tipo int: " +  Integer.MAX_VALUE);

        long longVar = 15;
        System.out.println("long = " + longVar);

        System.out.println("bits en el tipo long: "+ Long.SIZE);
        System.out.println("bytes en el tipo long: "+ Long.BYTES);
        System.out.println("valor minimo tipo long: " + Long.MIN_VALUE);
        System.out.println("valor maximo tipo long: " + Long.MAX_VALUE);
    }
}
