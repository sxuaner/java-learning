package com.java.learning.javase;

import java.nio.CharBuffer;

/**
 * what is a buffer in general? 
 * 
 * what is buffer in java?
 * 
 * what's special about CharBuffer?
 * 
 * How is CharBuffer related to StringBuffer?
 * 
 * how is it different from CharSequence?
 * 
 * Thread-safe? Immutable?
 * 
 */


public class MyCharBuffer {
    public static void main(String[] args) {

        char[] charArray = {'a','b','c'};
        CharBuffer cb = CharBuffer.wrap(charArray);



        }
    
}
