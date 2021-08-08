package com.java.learning.javase;

// nio means non-blocking IO and is a collection of Java programming language APIs that offer features for intensive I/O operations.
import java.nio.CharBuffer;
import java.util.stream.IntStream;


/**
 * public abstract class CharBuffer extends Buffer implements
 * Comparable<CharBuffer>, Appendable, CharSequence, Readable
 */

 

/*
This class defines four categories of operations upon char buffers:

1. Absolute and relative get and put methods that read and write single chars;
2. Relative bulk get methods that transfer contiguous sequences of chars from this buffer into an array;
3. Relative bulk put methods that transfer contiguous sequences of chars from a char array, a string, 
or some other char buffer into this buffer;
4. A method for compacting a char buffer.

Char buffers can be created either 
1. by allocation, which allocates space for the buffer's content, 
2. by wrapping an existing char array or string into a buffer. 
3. by creating a view of an existing byte buffer.

################  What is direct?
see DirectBufferInJava.java

Like a byte buffer, a char buffer is either direct or non-direct. A char buffer created via the wrap methods of this 
class will be non-direct. A char buffer created as a view of a byte buffer will be direct if, and only if, the byte 
buffer itself is direct. Whether or not a char buffer is direct may be determined by invoking the isDirect method.

This class implements the CharSequence interface so that character buffers may be used wherever character sequences 
are accepted, for example in the regular-expression package java.util.regex.
*/

public class CharBufferSE {
    public static void main(String[] args) {

        char[] charArray = {'a','b','c'};

        // 2 ways to create a CharBuffer:
        /**
         * 1. wrap() 
         * CharBuffer java.nio.CharBuffer.wrap(char[] array)
         * 
         * Wraps a char array into a buffer.
         * 
         * Implementation: 
         * public static CharBuffer wrap(char[] array, int offset, int length) 
         *      { try { return new HeapCharBuffer(array, offset, length); }
         * catch(IllegalArgumentException x)
         *      { throw new IndexOutOfBoundsException(); }
         * 
         * CharBuffer is backed by the array. if the array is modified, CharBuffr is als
         * modified.
         */
        CharBuffer cbWrap = CharBuffer.wrap(charArray);
        // Verify that CharBuffer is backed by the wrapped array
        charArray[2] = 'a';

        // Convert the char[] into Character[] with CharBuffer
        Character[] CharacterArrayFromCharArray = CharBuffer.wrap(charArray).chars().mapToObj(x->(char)x).toArray(Character[]::new);

        /**
         * 2. allocate()
         */
        CharBuffer cbAllocate = CharBuffer.allocate(5);

        /**
         * How does allocate() method initilize the array? i.e what is the default value
         * of a char array. 
         * For char array, the default value is the null character,
         * that is, '\u0000'. it's a Unicode codepoint 0 \u0000 means a number in
         * unsigned binary format with 16^4 = 2^7 digits, which is ASCII? 
         */
        
        StringBuilder sb = new StringBuilder(new String(cbAllocate.array()));

        // create an Integer array
        Integer[] initType = IntStream.range(0, cbAllocate.array().length).mapToObj(i -> sb.codePointAt(i)).toArray(Integer[]::new);

        Boolean initTypeNull = true;

        /**
         * HeapCharBuffer(int cap, int lim) {
         *      super(-1, 0, lim, cap, new char[cap], 0);   //With allocate(), a new array is created
         * }
         */

        // what's the desgn pattern used in CharBuffer and HeapCharBuffer implementation?

        // What are 


        /* Methods in this class that do not otherwise have a value to return are specified to return the buffer upon which 
           they are invoked. This allows method invocations to be chained. The sequence of statements
        */

        cbWrap.put("text/").put("subtype").put("; charset=").put(cbAllocate);

        /* 
        put(CharBuffer) is implemented as:
            for (int i = 0; i < n; i++)
                // Relative get method. Reads the char at this buffer's current position, and then increments the position.
                put(src.get());

        What is current position?
        */

            

        }
    
}
