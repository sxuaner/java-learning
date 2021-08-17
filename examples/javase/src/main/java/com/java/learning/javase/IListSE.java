package com.java.learning.javase;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
    public interface List<E> extends Collection<E>

    Collection is an interface while Collections is a concrete class extending Object.

    There are immutable list and mutable list. How to test if an object is immutable.

    Characteristics of List:
    1. Index-based
    2. Allow duplicates( Set does not)
    3. Generic programming with type infered later when an object of such class is instantiated.
    4. AKA sequence
    5. Iterable. An iterator can be obtained by calling .iterator();
    6. Is an interface that extends Collection( which extends iterable)
    7. Offers fine control over where in the list each element is inserted.
    */

public class IListSE {
    public static void main(String[] args) {
        // Here is how to create an array of chars.
        char[] charArray = { 'a', 'b', 'c', 'd', 'e' };

        // A mutable list
        List<Character> charList = new ArrayList<>();

        
        // Loop though the array
        for( Character c : charArray){
            charList.add(c);
        }

        
        // Create a immutable list. Is this backed by the original list?? yes
        List< Character> immutableList = Collections.unmodifiableList(charList);
        charList.add('f');
        /* two lists are defined to be
        * equal if they contain the same elements in the same order.  This
        * definition ensures that the equals method works properly across
        * different implementations of the <tt>List</tt> interface. */
        Boolean equalResult = charList.equals(immutableList);


        // When adding elements to an immutable list, UnsupportedOperationException will be thrown
        try{
            immutableList.add('g');
        }catch(Exception e){
            // java.lang.UnsupportedOperationException
            System.out.println(e.getClass().getName());            
        }

        // Does List allow null value in Java? yes 
        try {
            charList.add(null);
        } catch (Exception e) {
            e.printStackTrace();

        }


        // ######SingletonList#########
        // singletonList() : Returns an immutable list containing only the specified object(Only 1 object). The returned list is serializable.
        // And it's thread-safe.
        List<Character> singletonList = Collections.singletonList('e');

        // Use of singletonlist
        // removeAll(): Removes from this list all of its elements that are contained in the specified collection (optional operation).
        charList.removeAll(singletonList);

        // Character... elements means that some values of element type must be provided
        Collections.addAll(charList, '1','2','3');
        

        // Returns a hash code based on the contents of the specified array. For any two char arrays a and b such that 
        // Arrays.equals(a, b), it is also the case that Arrays.hashCode(a) == Arrays.hashCode(b).
        // immutableList is backed by charList
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
