package com.java.learning.javase;

import java.io.UnsupportedEncodingException;

// What's inside a String? 
// Logic behind the String class is : private final char value[];
// Final vars cannot be reassigned. Thus the immutability of String.
public class StringSE {
    public static void main(String[] args) {

        // What's the class name
        String st = "12345";
        String nameOfStringClass="".getClass().getName();

        // ?????????? How to print the binary form of a string?
        // type UnsupportedEncodingException is checked exception, can be checked by the compilor
        /*
         * byte[] java.lang.String.getBytes(String charsetName) throws UnsupportedEncodingException
         */
        // String str = Integer.toBinaryString("abca".getBytes("UTF-8")[0]);
        // To see the var in debug, the var must be declared outside try block
        byte[] string = {};
        String binaryForm ="";
        String stringConcateByte = "";

        // returns a stream of int zero-extending the char values from this sequence. Any char which 
        // maps to a surrogate code point is passed through uninterpreted

        try {
            string = "abcd".getBytes("UTF-16");
            for(Object o :string){
                stringConcateByte += (byte)o;
            }
            binaryForm = Integer.toBinaryString(1234);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        // what is radix?
        // Byte.valueOf(s, radix)

        // Prove that String is immutable
        String immuStr = "123";
        String tmp = immuStr;
        immuStr = "456";
        // false, so the reference to "123" is different from "456", check VisualVM
        // To browse the local vars, check out the main thread
        Boolean isStingImmutable = (immuStr == tmp);

        /**
         * Logic behind System.out.println(immuStr): a reference is returned and how does println deal with 
         * this ref?
         * 
           public String toString() {
            return this;
           }
         * */ 

           //String.format()

    }


}
    

