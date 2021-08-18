package com.java.learning.javase;

/**
 * Java HashMap class doesn't guarantee ordering. It depends on the internal
 * structure used to store the data. If you want to maintain the insertion order
 * when iterating use a LinkedHashMap (same for HashSet and LinkedHashSet)
 * 
 * Edit with info about the internals of HashMap:
 * 
 * HashMap uses the hashcode method on the key to generate a hash used to index
 * the values. Hashes are not guaranteed to be unique, and 2 hashcodes of 2
 * objects inserted one after the order have no guarantee to be stored one after
 * the other. When collision occurs (2 different keys having the same hash)
 * HashMap will store the colliding entries in a list and use equal method to
 * compare the keys om retrieval. Knowing this you understand why you can't
 * guarantee an ordering of the item when iterating through the map, the
 * ordering is dependant on the hashes natural order not insertion order.
 * LinkedHashMap works the same way but keeps the entries linked together based
 * on insertion order.
 * 
 * The reason why HashMap does not gurantee ordering is that it uses single link list to connect nodes, whereas doubly
 * linked List in LinkedHashMap can maintain an ordered List because with doubly linked List, which can be traverse 
 * in two directions.
 */
public class LinkedHashMapSE {
    
}
