package com.java.learning.javase;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * transient 
 */


 /**
  * Regarding the fetch order of pairs 
  
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
public class HashMapSE {


    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();
        mp.put(null, 123);
            
        
    }
}
