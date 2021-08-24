package com.java.learning.javase;

import java.lang.reflect.Array;

public class ArrayReflect {
    public static void main(String[] args) {

    // Object java.lang.reflect.Array.newInstance(Class<?> componentType, int length) throws NegativeArraySizeException
        Array.newInstance(Character.class, 5).getClass();
        // equavelent to 
        Character[] charArray ;
        
    }
    
}
