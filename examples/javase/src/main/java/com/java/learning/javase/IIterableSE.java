package com.java.learning.javase;
/*
   * public interface Iterable<T> 
   * Implementing this interface allows an object to be the target of the "for-each loop" statement. See For-each Loop
   */

/* 
Iterating over a collection is uglier than it needs to be. Consider the following method, which takes 
a collection of timer tasks and cancels them:

void cancelAll(Collection<TimerTask> c) {
    for (Iterator<TimerTask> i = c.iterator(); i.hasNext(); )
        i.next().cancel();
}

The iterator is just clutter. Furthermore, it is an opportunity for error. The iterator variable occurs 
three times in each loop: that is two chances to get it wrong. The for-each construct gets rid of the 
clutter and the opportunity for error. Here is how the example looks with the for-each construct:

void cancelAll(Collection<TimerTask> c) {
    for (TimerTask t : c)
        t.cancel();
} */

public class IIterableSE {

    /**
     * default void forEach​(Consumer<? super T> action) 
     * Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.
     * 
     * Iterator<T> iterator() 
     * Returns an iterator over elements of type T. default Spliterator<T> spliterator() Creates a Spliterator over the elements
     * described by this Iterable.
     */        

}
