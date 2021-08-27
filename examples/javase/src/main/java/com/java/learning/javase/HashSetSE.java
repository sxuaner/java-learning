package com.java.learning.javase;

import java.util.HashSet;
import java.util.Set;

/**
 * public class HashSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, Serializable
 * 
 * 
    What is Set Interface in Java?
    A collection that 
    1. contains no duplicate elements(through unique key in HashMap). More formally, sets contain no pair of elements e1 and e2 such that e1.equals(e2), and 
    2. at most one null element. 
    3. As implied by its name, this interface models the mathematical set abstraction.

HashSet is backed by a HashMap. If this set already contains the element, the call to HashSet.put() leaves the set unchanged and returns false.
It's funny that HashMap.put() and HashSet.add()

    // try to put a (e.PRESENT) pair to test if a is already in the list.
    // From this we can tell that the HashMap backing HashSet is actually a {new Object()}; The keys of the HashMap are in fact the set elements

    private static final Object PRESENT = new Object();
    public boolean add(E e) {
        return map.put(e, PRESENT)==null;
    }

 * what is load factor?
 * if there are n entries and b is the size of the array there would be n/b entries on each index. This value 
 * n/b is called the load factor that represents the load that is there on our map.
 * 
How is the hash function implemented?
@HotSpotIntrinsicCandidate
public native int hashCode();

!!! There are 2 equals() methods: one is in Object and the other is in Set. However, the equals() must conform to the method contract in Object.
 If e1.hashCode() == e2.hashCode(), then e1.equals(e2) must be true. Vice versa. ??? must be verified. 

 */
public class HashSetSE {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();
        
        Object obj = new Object();

    /**
     * public boolean equals(Object obj) { return (this == obj); }
     */
    obj.equals(obj);

    // Map m = Collections.synchronizedMap(new HashMap(...));

    // How will the size of the array increse?
    // What is and why rehashing?


    //check out HashMap implementation note in HashMap.class
    //
    /**
     * equals() in set
     *   public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Set))
            return false;
        Collection<?> c = (Collection<?>) o;
        if (c.size() != size())
            return false;
        try {
            return containsAll(c);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
     */

    hs.equals(hs);

        
    }
    
}
