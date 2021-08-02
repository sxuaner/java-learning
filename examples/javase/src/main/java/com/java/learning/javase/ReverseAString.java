package com.java.learning.javase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseAString {

    public static void main(String[] args) {
        /*
         * Interview Question: How to reverse the order of digits in a String, given
         * that the String consists of only digits? How to optimize the performance?
         */

        // The String to convert
        String stringToReverse = "12345678";
        // Convert a String to an array of primitive type char:
        // Complexity?
        char[] arrayStringToReverse = stringToReverse.toCharArray();
        /*
         * List characteristics:
         * 
         * Interface List<E> Type Parameters: E - the type of elements in this list 1.
         * An ordered collection 2. Index based methods to insert, update, delete and
         * search the elements. The index is zero based. 3. allow duplicate elements. 4.
         * Null element allowed in some implementations 5. provides a special iterator,
         * called a ListIterator. It allows element insertion and replacement, and
         * bidirectional access(forward&backford) in addition to the normal operations
         * that the Iterator interface provides. 6. provides two methods to search for a
         * specified object. From a performance standpoint, these methods should be used
         * with caution. In many implementations they will perform costly linear
         * searches. O(n)
         * 
         * 
         * Interface ListIterator<E> A ListIterator has no current element; its cursor
         * position always lies between the element that would be returned by a call to
         * previous() and the element that would be returned by a call to next(). An
         * iterator for a list of length n has n+1 possible cursor positions, as
         * illustrated by the carets (^) below: Element(0) Element(1) Element(2) ...
         * Element(n-1) cursor positions: ^ ^ ^ ^ ^
         * 
         * What is Character?
         * 
         * What is charSequence?
         */
        List<Character> listStringToReverse = new ArrayList<>();

        // Iterate through the array and add each element to the arraylist
        for (char charIterator : arrayStringToReverse) {
            listStringToReverse.add(charIterator);
        }
        // Now reverse the list, because list is ordered
        Collections.reverse(listStringToReverse);

        // How to use forEach() and lambda?
        // Iterator class
        String result = "";
        Iterator<Character> iteratorListStringToReverse = listStringToReverse.iterator();
        while (iteratorListStringToReverse.hasNext()) {
            result += iteratorListStringToReverse.next();
        }

        System.out.println(result);
        // 87654321
    }
    
}
