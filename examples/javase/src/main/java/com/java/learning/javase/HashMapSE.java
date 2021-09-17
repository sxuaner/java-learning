package com.java.learning.javase;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * transient 
 */
 /**
  * Regarding the fetching order
  
  Picture going to a library. Looking for a
  * book is easy: the books are stored by a classification system. The literature
  * books are here, and the cookbooks are there. Let's say a librarian asked you
  * to go get a list of all the books in the library. Not easy, but it could be
  * done (it's a fairly small library). So you go to the shelves and create a
  * list of the books and show it to the librarian. What would you do if they
  * asked why the list of books you had wasn't in the order that they put the
  * books on the shelves?
  * 
  * You'd pause. Of course they're not. The order in which the books are on the
  * shelves has nothing to do with what order you put them in. This cookbook will
  * always be stored at a particular number, whether you put it in first, last,
  * or somewhere in the middle. Getting the books back out in the order they were
  * put in isn't a goal of this storage system.
  * 
  * Similarly, getting the items out of a HashMap in the order in which you put
  * them in isn't a feature of that storage system. It creates a number of
  * buckets to put things in. When you put something in, it takes the hash of the
  * object, then does a mapping from that hash to the bucket number. It's
  * designed to be able to tell whether a given item is in the HashMap quickly.
  * It's not designed to store things that you put in in the order you put them
  * in.
  */
  
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
 */


 /**
  * HashMap has good performance becomes a very useful feature when dealing with
  * moderate-to-large collections of items, because it is usually a lot faster to
  * compute a hash value compared to linearly searching a collection, or having
  * to resize and copy items in an array backing a collection when it's limit is
  * reached.
  */
public class HashMapSE {
    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();
        mp.put(null, 123);

        /* public V put(K key, V value) {
            return putVal(hash(key), key, value, false, true);
            }
        */    

        /**
        HashMap.Node.hashCode():

        final K key;
        V value;
        
        public final int hashCode() {
            return Objects.hashCode(key) ^ Objects.hashCode(value);
        }
         */
        

   



    }
}
