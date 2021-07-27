package com.java.learning.javase;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

/*
    public interface List<E> extends Collection<E>

    Collection is an interface while Collections is a concrete class extending Object.
*/

public class MyList {
    public static void main(String[] args) {
        // Here is how to create an array of chars.
        char[] charArray = { 'a', 'b', 'c', 'd', 'e' };

        // Returns a hash code based on the contents of the specified array. For any two char arrays a and b such that 
        // Arrays.equals(a, b), it is also the case that Arrays.hashCode(a) == Arrays.hashCode(b).
        int hashOfCharArray=Arrays.hashCode(charArray);

        // Following code creates a List of char array, which is not what we want. We need a list of Characters
        List<char[]> charArrayList = Arrays.asList(charArray);

        /*
         * Returns a fixed-size list backed by the specified array. (Changes to the
         * returned list "write through" to the array.) This method acts as bridge
         * between array-based and collection-based APIs, in combination with
         * Collection.toArray.
         * 
         * The returned list is serializable and implements RandomAccess. This method
         * also provides a convenient way to create a fixed-size list initialized to contain several elements:
         * 
         * List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");
         * 
         */ 

        /*
         * The usual way to create a list with an array elements.
         * 
         * @SafeVarargs
         * 
         * @SuppressWarnings("varargs") public static <T> List<T> asList(T... a) {
         * return new ArrayList<>(a); }
         */
        List<Character> testList = Arrays.asList('a', 'b', 'c', 'd', 'e');

        // The type is arraylist
        String type = testList.getClass().getTypeName();

        // Now we need to reverse testList with help of java.util.Collections. 
        Collections.reverse(testList);
        /*
         * We would like to sort the order of elements in testList based on some
         * comparators. There are 2 ways: 
         * 1. List.sort(comparator) 
         * 2. Collections.sort(list, comparator)
         * 
         * List, as well as Map, Set, extends Collection and iterable interface. 
         * 
         * Implementation details of List.sort():
 
         default void sort(Comparator<? super E> c) {
            Object[] a = this.toArray();
            Arrays.sort(a, (Comparator) c);
            ListIterator<E> i = this.listIterator();
            for (Object e : a) {
                i.next();
                i.set((E) e);
            }
        }
        */
        MyComparator mc = new MyComparator();
        Collections.sort(testList, mc);
        testList.size();
    
        // what is serializable interface?
        
        
    }


    
}
