package com.java.learning.javase;

import java.util.HashSet;
import java.util.Set;

/**
 * public class HashSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, Serializable
 * 
 * HashSet is backed by a HashMap, 
 * 
 * what is load factor?
 * if there are n entries and b is the size of the array there would be n/b entries on each index. This value 
 * n/b is called the load factor that represents the load that is there on our map.
 * 
 * HOw is the hash function implemented?
*   @HotSpotIntrinsicCandidate
    public native int hashCode();

!!! There are 2 equals() methods: one is in Object and the other is in Set
 * 
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
