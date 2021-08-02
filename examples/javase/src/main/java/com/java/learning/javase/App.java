package com.java.learning.javase;
// Import java math pac for pow() method

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

/**
 * Conclusion: 
 *  1. range of int is slightly greater than 10^9
 *  2. 
 * 
 * Questions:
 *  1. How is multiplicatio of 2 ints exactly done?
 */
public class App 
{
    public static void main( String[] args )
    {   
    /*
     * Overflow or underflow :
     * is a condition where you cross the limit of prescribed
     * size for a data type. When overflow or underflow condition is reached, either
     * the program will crash or the underlying implementation of the programming
     * language will have its own way of handing things
     * 
     * ? Why is pow() taking 2 doubles as parameters? // (0.3)^(0.3) for an example
     * 
     * public static double pow(double a, double b) { return StrictMath.pow(a, b);
     * default impl. delegates to StrictMath}
     */      
        double base  = 10.0;

        // Expected result is 1*10^9. Actual: 10 0000 0000
        int intExpNine = (int) Math.pow(base, 9.0);
        long longExpNine = (long) Math.pow(base, 9.0);

        // expected result is 1*10^10(which is 100 0000 0000). Actual: 21 4748 3647
        int intExponentTen = (int) Math.pow( base, 10.0);
        long longExponentTen = (long) Math.pow(base, 10.0); // 100 0000 0000

        int i = 100000;
        // Actual: -7 2737 9968 when i = 10^6
        // 14 1006 5408 when i = 10^5
        // 1 0000 0000 when i = 10^4
        int iMultiplied = i*i;
        // Here occurs obviously an overflow. How is the muliplication exactly done????
        long iMultipliedLong = (long) i*i;

        // Alternatively:
        int iMultipliedExact;
        try{
            iMultipliedExact = Math.multiplyExact(i, i);
        }catch(ArithmeticException ae){
            // If the exception is caught, jvm will not exit. Otherwise, jvm exits with an exception.
            /*
             * java.lang.ArithmeticException: integer overflow at
             *      java.base/java.lang.Math.multiplyExact(Math.java:906) at
             *      com.java.learning.javase.App.main(App.java:54) at
             *      org.codehaus.mojo.exec.ExecJavaMojo$1.run(ExecJavaMojo.java:254) at
             *      java.base/java.lang.Thread.run(Thread.java:834) 
             * 123 87654321
             */
            ae.printStackTrace();
        }

        // Integer.MAX_VALUE = 21 4748 3647
        // a = 10 0000 0000 = 10^9 10 digits
        int a = 1000000000;

        // what's this?
        System.out.println(""+ 123);

        
    }
}
