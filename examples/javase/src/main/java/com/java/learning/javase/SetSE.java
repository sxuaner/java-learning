package com.java.learning.javase;

import java.util.Set;

/**
 * public interface Set<E> extends Collection<E>
 * 
 * public interface Collection<E> extends Iterable<E>
 * 
 * public interface Iterable<T> 
 * Implementing this interface allows an object to be the target of the "for-each loop" statement
 * 

What is Set Interface in Java?
  A collection that 
  1. contains no duplicate elements. More formally, sets contain no pair of elements e1 and e2 such that e1.equals(e2), and 
  2. at most one null element. 
  3. As implied by its name, this interface models the mathematical set abstraction.
  
Note: Great care must be exercised if mutable objects are used as set elements. The behavior of a set is 
not specified if the value of an object is changed in a manner that affects equals comparisons while the 
object is an element in the set. A special case of this prohibition is that it is not permissible for a set 
to contain itself as an element.

The Set interface places additional stipulations, beyond those inherited from the Collection interface, on the contracts of all constructors 
and on the contracts of the add, equals and hashCode methods. Declarations for other inherited methods are also included here for convenience. 
(The specifications accompanying these declarations have been tailored to the Set interface, but they do not contain any additional stipulations.)

Stipulation: a rule that must be followed or something that must be done:

Some set implementations have restrictions on the elements that they may contain. For example, some 
implementations prohibit null elements, and some have restrictions on the types of their elements. 

Attempting to add an ineligible element throws an unchecked exception, typically NullPointerException or ClassCastException.

Attempting to query the presence of an ineligible element may throw an exception, or it may simply return false;
some implementations will exhibit the former behavior and some will exhibit the latter. 

More generally, attempting an operation on an ineligible element whose completion would not result in the insertion of an 
ineligible element into the set may throw an exception or it may succeed, at the option of the implementation. 

Such exceptions are marked as "optional" in the specification for this interface.

########################## Unmodifiable Sets ######################
The Set.of and Set.copyOf static factory methods provide a convenient way to create unmodifiable sets. The Set instances created by these methods 
have the following characteristics:

They are unmodifiable. Elements cannot be added or removed. Calling any mutator method on the Set will always cause UnsupportedOperationException 
to be thrown. However, if the contained elements are themselves mutable, this may cause the Set to behave inconsistently or its contents to appear 
to change.

They disallow null elements. Attempts to create them with null elements result in NullPointerException.
They are serializable if all elements are serializable.
They reject duplicate elements at creation time. Duplicate elements passed to a static factory method result in IllegalArgumentException.
The iteration order of set elements is unspecified and is subject to change.
They are value-based. Callers should make no assumptions about the identity of the returned instances. Factories are free to create new instances or 
reuse existing ones. Therefore, identity-sensitive operations on these instances (reference equality (==), identity hash code, and synchronization) 
are unreliable and should be avoided.
They are serialized as specified on the Serialized Form page.
This interface is a member of the Java Collections Framework.
 
What implementations are available?

* The hash code of a set is defined to be the sum of the hash codes of the elements in the set,
* where the hash code of a {@code null} element is defined to be zero.
* This ensures that s1.equals(s2) implies that s1.hashCode()==s2.hashCode() for any two sets s1 s2, as required by the general contract of Object.hashCode()

 */

public class SetSE {
    public static void main(String[] args) {

        Set set;
        /**
         * 
         * boolean equals​(Object o) Compares the specified object with this set for
         * equality.
         * 
         * int hashCode() Returns the hash code value for this set.
         * 
*          static <E> Set<E>	copyOf​(Collection<? extends E> coll)	
            Returns an unmodifiable Set containing the elements of the given Collection.
            ?? Is this set backed by the passed in set??

            static <E> Set<E>	of()	
            Returns an unmodifiable set containing zero elements.
            
            static <E> Set<E>	of​(E e1)	
            Returns an unmodifiable set containing one element.
            
            static <E> Set<E>	of​(E... elements)	
            Returns an unmodifiable set containing an arbitrary number of elements.

            boolean	retainAll​(Collection<?> c)	
            Retains only the elements in this set that are contained in the specified collection (optional operation).

                
            default Spliterator<E>	spliterator()	
            Creates a Spliterator over the elements in this set.
                    
            <T> T[]	toArray​(T[] a)
            Returns an array containing all of the elements in this set; the runtime type of the returned array is that of the specified array.
            



         */

        /**
         * 
        boolean	add​(E e)	
        Adds the specified element to this set if it is not already present (optional operation).
        
        boolean	addAll​(Collection<? extends E> c)	
        Adds all of the elements in the specified collection to this set if they're not already present (optional operation).
        
        void	clear()	
        Removes all of the elements from this set (optional operation).
        
        boolean	contains​(Object o)	
        Returns true if this set contains the specified element.
        
        boolean	containsAll​(Collection<?> c)	
        Returns true if this set contains all of the elements of the specified collection.
        
        boolean	isEmpty()	
        Returns true if this set contains no elements.
        
        Iterator<E>	iterator()	
        Returns an iterator over the elements in this set.
        
        static <E> Set<E>	of()	
        Returns an unmodifiable set containing zero elements.
        
        static <E> Set<E>	of​(E e1)	
        Returns an unmodifiable set containing one element.
        
        static <E> Set<E>	of​(E... elements)	
        Returns an unmodifiable set containing an arbitrary number of elements.
        
        boolean	remove​(Object o)	
        Removes the specified element from this set if it is present (optional operation).
        
        boolean	removeAll​(Collection<?> c)	
        Removes from this set all of its elements that are contained in the specified collection (optional operation).
        
        int	size()	
        Returns the number of elements in this set (its cardinality).
        
        Object[]	toArray()	
        Returns an array containing all of the elements in this set.
        */
    
        
    }
    
}
