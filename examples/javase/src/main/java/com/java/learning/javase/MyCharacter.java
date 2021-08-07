package com.java.learning.javase;

import java.util.stream.IntStream;

/**
 * Returns a <tt>Character</tt> instance representing the specified
 * <tt>char</tt> value. If a new <tt>Character</tt> instance is not required,
 * this method should generally be used in preference to the constructor
 * {@link #Character(char)}, as this method is likely to yield significantly
 * better space and time performance by caching frequently requested values.
 *
 * This method will always cache values in the range {@code
 * '\u005Cu0000'} to {@code '\u005Cu007F'}, inclusive, and may cache other
 * values outside of this range.
 *
 * @param c a char value.
 * @return a <tt>Character</tt> instance representing <tt>c</tt>.
 * @since 1.5
 * 
 *        public static Character valueOf(char c) { 
 *              if (c <= 127) { 
 *                  // mustcache 
 *                  return CharacterCache.cache[(int)c]; } 
 *                  return new Character(c);
 *        }
 */

public class MyCharacter {
    public static void main(String[] args) {

    char[] charArray = {'a','b','c'};

    // How to conver char[] to Character[]
    Character[] characterArrayConvertedFromChar = new String(charArray)     // put the char array into a String object.
                                                      .chars()              // Returns a stream of int zero-extending the char values from this 
                                                                            // sequence. Any char which maps to a surrogate code point is passed through uninterpreted.
                                                                            // If the sequence is mutated while the stream is being read, the result is 
                                                                            // undefined.
                                                      .mapToObj(x -> (char) x) 
                                                                            // Returns an object-valued Stream consisting of the results of applying the
                                                                            // given function to the elements of this stream.
            // Returns an array containing the elements of this stream, using the provided
            // generator function to allocate the returned array, as well as any additional
            // arrays that might be required for a partitioned execution or for resizing.
                                                      .toArray(Character[]::new);
    
    // How to convert a char[] into Integer[]                                                  
    Integer[] intConvertedFromChar = new String(charArray).chars().mapToObj(x -> (Integer) x).toArray(Integer[]::new);
    
    // what is IntStream Builder?
    // {0,1,2,3,4,5,6,7,8,9}
    int[] is = IntStream.range(0,10).toArray();
    // [0, length)

    // Convert char[] into Character[]
    // what is the time complexity?
    IntStream.range(0, charArray.length).mapToObj(index -> (Character)charArray[index]).toArray(Character[]::new);
    
    // What does reduce() do?
    // https://www.geeksforgeeks.org/intstream-reduceintbinaryoperator-op-java-examples/

    // What is a generator funciton?

    // .chars() returns an IntStream and what is this?
    
    /*
        https://www.geeksforgeeks.org/intstream-reduceintbinaryoperator-op-java-examples/
    */
    }
}
