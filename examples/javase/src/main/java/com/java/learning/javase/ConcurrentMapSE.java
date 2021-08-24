package com.java.learning.javase;

/**
 * public interface ConcurrentMap<K,​V>
        extends Map<K,​V>
A Map providing thread safety and atomicity guarantees.
To maintain the specified guarantees, default implementations of methods including putIfAbsent(K, V) inherited from Map must be overridden by 
implementations of this interface. Similarly, implementations of the collections returned by methods Map.keySet(), Map.values(), and Map.entrySet()
must override methods such as removeIf when necessary to preserve atomicity guarantees.

Memory consistency effects: As with other concurrent collections, 
actions in a thread prior to placing an object into a ConcurrentMap as a key or value 
happen-before 
actions subsequent to the access or removal of that object from the ConcurrentMap in another thread.

{actions > placing an object in one thread} happens before {access or removal of that object > actions in another thread}

The formal expression of concurrency can be found maybe in the papaer from Hoare


This interface is a member of the Java Collections Framework.
 */
public class ConcurrentMapSE {
    
}
