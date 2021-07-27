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

        /*
            Interview Question:
            How to reverse the order of digits in a String, given that the String consists of only digits?
            How to optimize the performance?
        */

        // The String to convert
        String stringToReverse = "12345678";

        // Convert a String to an array of primitive type char:
        // Complexity?
        char[] arrayStringToReverse = stringToReverse.toCharArray();
        /*
         * List characteristics: 
         *  
         * Interface List<E>
         * Type Parameters: E - the type of elements in this list 
         * 1. An ordered collection 
         * 2. Index based methods to insert, update, delete and search the elements. The index is zero based.
         * 3. allow duplicate elements.
         * 4. Null element allowed in some implementations
         * 5. provides a special iterator, called a ListIterator. It allows element insertion and replacement, and bidirectional access(forward&backford)
         *    in addition to the normal operations that the Iterator interface provides. 
         * 6. provides two methods to search for a specified object. From a performance standpoint, these methods should be used with caution. 
         *    In many implementations they will perform costly linear searches. O(n)
         * 
         * 
         * Interface ListIterator<E>
         * A ListIterator has no current element; its cursor position always lies between the element that would be returned by a call to previous() 
         * and the element that would be returned by a call to next(). An iterator for a list of length n has n+1 possible cursor positions, as 
         * illustrated by the carets (^) below:
         *                     Element(0)   Element(1)   Element(2)   ... Element(n-1)
          cursor positions:  ^            ^            ^            ^                  ^
         * 
         * What is Character?
         * 
         * What is charSequence?
         */ 
        List<Character> listStringToReverse = new ArrayList<>();

        // Iterate through the array and add each element to the arraylist
        for( char charIterator : arrayStringToReverse){
            listStringToReverse.add(charIterator);
        }
        // Now reverse the list, because list is ordered
        Collections.reverse(listStringToReverse);

        // How to use forEach() and lambda?
        // Iterator class
        String result = "";
        Iterator<Character> iteratorListStringToReverse = listStringToReverse.iterator();
        while( iteratorListStringToReverse.hasNext()){
            result += iteratorListStringToReverse.next();
        }
      
        System.out.println(result);
        // 87654321
        
    }
}
