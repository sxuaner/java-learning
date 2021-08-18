package com.java.learning.javase;


/**
 * public interface Spliterator<T> 
 * T - the type of elements returned by this Spliterator
 * 
 */
public class ISpliteratorSE {

    /** Fields:
        static int	CONCURRENT	
        Characteristic value signifying that the element source may be safely concurrently modified (allowing 
        additions, replacements, and/or removals) by multiple threads without external synchronization.
        
        static int	DISTINCT	
        Characteristic value signifying that, for each pair of encountered elements x, y, !x.equals(y).
        
        static int	IMMUTABLE	
        Characteristic value signifying that the element source cannot be structurally modified; that is, elements 
        cannot be added, replaced, or removed, so such changes cannot occur during traversal.
        
        static int	NONNULL	
        Characteristic value signifying that the source guarantees that encountered elements will not be null.
        
        static int	ORDERED	
        Characteristic value signifying that an encounter order is defined for elements.
        
        static int	SIZED	
        Characteristic value signifying that the value returned from estimateSize() prior to traversal or splitting 
        represents a finite size that, in the absence of structural source modification, represents an exact count 
        of the number of elements that would be encountered by a complete traversal.
        
        static int	SORTED	
        Characteristic value signifying that encounter order follows a defined sort order.
        
        static int	SUBSIZED	
        Characteristic value signifying that all Spliterators resulting from trySplit() will be both SIZED and SUBSIZED.
     */



    /** Methods:
     *  int	characteristics()	
        Returns a set of characteristics of this Spliterator and its elements.

        long	estimateSize()	
        Returns an estimate of the number of elements that would be encountered by a forEachRemaining(java.util.function.Consumer<? super T>) traversal, or returns Long.MAX_VALUE if infinite, unknown, or too expensive to compute.
        
        default void	forEachRemaining​(Consumer<? super T> action)	
        Performs the given action for each remaining element, sequentially in the current thread, until all elements have been processed or the action throws an exception.
        
        default Comparator<? super T>	getComparator()	
        If this Spliterator's source is SORTED by a Comparator, returns that Comparator.
        
        default long	getExactSizeIfKnown()	
        Convenience method that returns estimateSize() if this Spliterator is SIZED, else -1.
        
        default boolean	hasCharacteristics​(int characteristics)	
        Returns true if this Spliterator's characteristics() contain all of the given characteristics.
        
        boolean	tryAdvance​(Consumer<? super T> action)	
        If a remaining element exists, performs the given action on it, returning true; else returns false.
        
        Spliterator<T>	trySplit()	
        If this spliterator can be partitioned, returns a Spliterator covering elements, that will, upon return from this method, not be covered by this Spliterator.
     */
    
}
