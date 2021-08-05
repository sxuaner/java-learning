package com.java.learning.javase;

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

    // How to conver char[] to Character[]
    
}
