package com.java.learning.javase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/* java.lang.StringBuilder
A mutable sequence of characters. 

This class provides an API compatible with StringBuffer, but with no guarantee of synchronization. 

(Better performance in general than StringBuffer in case of single thread)
This class is designed for use as a drop-in replacement for StringBuffer in places where the string buffer was being
used by a single thread (as is generally the case). Where possible, it is recommended that this class be used in 
preference to StringBuffer as it will be faster under most implementations.

???? What does drop-in replacement mean?
Drop-in replacement is a term used in computer science and other fields. It refers to the ability to replace one 
hardware (or software) component with another one without any other code or configuration changes being required 
and resulting in no negative impacts. Usually, the replacement has some benefits.

The principal operations on a StringBuilder are the append and insert methods, which are overloaded so as to accept 
data of any type. Each effectively converts a given datum(singular form of data) to a string and then appends or 
inserts the characters of that string to the string builder. 

The append method always adds these characters at the end of the builder; the insert method adds the characters 
at a specified point.

For example, if z refers to a string builder object whose current contents are "start", then the method call 
z.append("le") would cause the string builder to contain "startle", whereas z.insert(4, "le") would alter the 
string builder to contain "starlet".  /ɪnˈsɝːt/ 

In general, if sb refers to an instance of a StringBuilder, then sb.append(x) has the same effect as 
sb.insert(sb.length(), x).

Every string builder has a capacity. As long as the length of the character sequence contained in the string 
builder does not exceed the capacity, it is not necessary to allocate a new internal buffer. If the internal buffer 
overflows, it is automatically made larger.

Instances of StringBuilder are not safe for use by multiple threads. If such synchronization is required then it is
recommended that StringBuffer be used.

Unless otherwise noted, passing a null argument to a constructor or method in this class will cause a 
NullPointerException to be thrown.


API Note:
StringBuilder implements Comparable but does not override equals. Thus, the natural ordering of 
StringBuilder is inconsistent with equals. Care should be exercised if StringBuilder objects are used as
keys in a SortedMap or elements in a SortedSet. See Comparable, SortedMap, or SortedSet for more
information.


*/
public class MyStringBuilder {
    // Not synched
    // compatble with StringBuffer, it means in case of single thread, StringBuilder can be drop-in replacement of
    // StringBuffer

    /*
        In Java SE11, the default capacity for the construcotr with no parameter is 16 characters.
    */
    
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        int len = sb.length();      // len is 0 but sb has the local var "value" of char[16]

        // insert
        sb.insert(len, false);      // false is converted into a string and inserted into the buffer inside that sb.

        // append
        sb.append("Appendix");
        
        /*
         * Possible parameters for insert() 
         * (int, boolean/char/char[]/char[],int,int/CharSequence/CharSequence,int,int/double/
         * float/int/long/Object/String)
         * 
         * ????what is this (int, char[], int, int) parameter list? // StringBuilder
         * 
         * java.lang.StringBuilder.insert(int index, char[] str, int soffset, int len)
         * 
         * Inserts the string representation of a subarray of the str array argument
         * into this sequence. The subarray begins at the specified offset and
         * extends //len chars. The characters of the subarray are inserted into this
         * sequence at // the position indicated by index. The length of this sequence
         * increases by len // chars.
         */
        // "falseApendix" -> 

        char[] charArray = {'a','b','c'};
        try {
            sb.insert(sb.length(), charArray, 1, 3); // Exception expected. OutofBoundry
        } catch (Exception e) {
        }
        /* 
        Exception in thread "main" java.lang.StringIndexOutOfBoundsException: offset 1, len 3, str.length 3
        at java.lang.AbstractStringBuilder.insert(AbstractStringBuilder.java:966)
        at java.lang.StringBuilder.insert(StringBuilder.java:273)
        at com.java.learning.javase.MyStringBuilder.main(MyStringBuilder.java:82)
        */
        // what is this codePoint()?
        // Returns the character (Unicode code point) at the specified index. The index refers to char values 
        // (Unicode code units) and ranges from 0 to length()- 1.

        // What are ASCII and Unicode. How are they different from each other?

        // How to loop through an array of primitive type like char[] if no index is used?
        List<Character> charList = new ArrayList<>();
        for (char c : charArray) {
            charList.add(c);
        }

        // This foreach loop is translated into: 
/*         for (int i = 0; i < someArray.length; i++) {
            String item2 = someArray[i];
            System.out.println(item2);
        } */

        // Or better: using stream
        // Stream is an interface and therefore cannot be instantiated.
        // Following line of code is illegal because there is no CharStream interface that can be returned
        // If array is of int type, an IntStream will be returned.

        charList.stream().forEach(System.out::println);
        
        // Data Structure: (key, [char, codePoint]) can be implemented as (key, CharAndItsCodePoint Object)
        // And CharAndItsCodePoint is a class that wraps the [char, CodePoint] information

        class CharAndItsCodePoint{
            private Character theChar;
            private Integer codePoint;

            CharAndItsCodePoint(Character theChar, Integer codePoint){
                this.theChar = theChar;
                this.codePoint = codePoint;
            }

            public Character getTheChar(){
                return this.theChar;
            }
            public Integer getCodePoint(){
                return this.codePoint;
            }
        }

        Map<Integer, CharAndItsCodePoint> myMap = new HashMap<>();




        for(int i = 0; i < sb.length()-1; i++){
            myMap.put(i, new CharAndItsCodePoint(sb.charAt(i), sb.codePointAt(i)));
        }
        int codePoint = sb.codePointCount(0, sb.length()-1);
        len = sb.length();
    }
    
}
