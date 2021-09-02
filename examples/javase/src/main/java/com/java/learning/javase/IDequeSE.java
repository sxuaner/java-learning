package com.java.learning.javase;

/**
 
public interface Deque<E>
    extends Queue<E>
    
A linear collection that supports element insertion and removal at both ends. The name deque is short for "double ended queue" and
is usually pronounced "deck". Most Deque implementations place no fixed limits on the number of elements they may contain, but this 
interface supports capacity-restricted deques as well as those with no fixed size limit.

This interface defines methods to access the elements at both ends of the deque. Methods are provided to insert, remove, and examine 
the element. Each of these methods exists in two forms: one throws an exception if the operation fails, the other returns a special 
value (either null or false, depending on the operation). The latter form of the insert operation is designed specifically for use 
with capacity-restricted Deque implementations; in most implementations, insert operations cannot fail.

The twelve methods described above are summarized in the following table:

Summary of Deque methods
        First Element (Head)	                    Last Element (Tail)
        Throws exception	Special value	Throws exception	Special value
Insert	addFirst(e)	        offerFirst(e)	addLast(e)	        offerLast(e)
Remove	removeFirst()	    pollFirst()	    removeLast()	    pollLast()
Examine	getFirst()	        peekFirst()	    getLast()	        peekLast()

This interface extends the Queue interface. When a deque is used as a queue, FIFO (First-In-First-Out) behavior results. 
Elements are added at the end of the deque and removed from the beginning. The methods inherited from the Queue interface 
are precisely equivalent to Deque methods as indicated in the following table:

Comparison of Queue and Deque methods
Queue Method	Equivalent Deque Method
add(e)	        addLast(e)
offer(e)	    offerLast(e)
remove()	    removeFirst()
poll()	        pollFirst()
element()	    getFirst()
peek()	        peekFirst()

Deques can also be used as LIFO (Last-In-First-Out) stacks. This interface should be used in preference to the legacy Stack class. 
When a deque is used as a stack, elements are pushed and popped from the beginning of the deque. Stack methods are equivalent to Deque methods as indicated in the table below:

Comparison of Stack and Deque methods
Stack Method	Equivalent Deque Method
push(e)	        addFirst(e)
pop()	        removeFirst()
peek()	        getFirst()

Note that the peek method works equally well when a deque is used as a queue or a stack; in either case, elements are drawn from the beginning of the deque.

This interface provides two methods to remove interior elements, removeFirstOccurrence and removeLastOccurrence.

Unlike the List interface, this interface does not provide support for indexed access to elements.

While Deque implementations are not strictly required to prohibit the insertion of null elements, they are strongly encouraged to do so. Users of any Deque 
implementations that do allow null elements are strongly encouraged not to take advantage of the ability to insert nulls. This is so because null is used as 
a special return value by various methods to indicate that the deque is empty.

Deque implementations generally do not define element-based versions of the equals and hashCode methods, but instead inherit the identity-based versions 
from class Object.

This interface is a member of the Java Collections Framework.
 */

public class IDequeSE {
    public static void main(String[] args) {
        
        /* 
        boolean	add​(E e)	
        Inserts the specified element into the queue represented by this deque (in other words, at the tail of this deque) if it is 
        possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.
        
        boolean	addAll​(Collection<? extends E> c)	
        Adds all of the elements in the specified collection at the end of this deque, as if by calling addLast(E) on each one, in the order that they are returned by the collection's iterator.
        
        void	addFirst​(E e)	
        Inserts the specified element at the front of this deque if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
        
        void	addLast​(E e)	
        Inserts the specified element at the end of this deque if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
        
        boolean	contains​(Object o)	
        Returns true if this deque contains the specified element.
        
        Iterator<E>	descendingIterator()	
        Returns an iterator over the elements in this deque in reverse sequential order.
        
        E	element()	
        Retrieves, but does not remove, the head of the queue represented by this deque (in other words, the first element of this deque).
        
        E	getFirst()	
        Retrieves, but does not remove, the first element of this deque.
        
        E	getLast()	
        Retrieves, but does not remove, the last element of this deque.
        
        Iterator<E>	iterator()	
        Returns an iterator over the elements in this deque in proper sequence.
        
        boolean	offer​(E e)	
        Inserts the specified element into the queue represented by this deque (in other words, at the tail of this deque) if it is possible to do so immediately without violating capacity restrictions, returning true upon success and false if no space is currently available.
        
        boolean	offerFirst​(E e)	
        Inserts the specified element at the front of this deque unless it would violate capacity restrictions.
        
        boolean	offerLast​(E e)	
        Inserts the specified element at the end of this deque unless it would violate capacity restrictions.
        
        E	peek()	
        Retrieves, but does not remove, the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.
        
        E	peekFirst()	
        Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.
        
        E	peekLast()	
        Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty.
        
        E	poll()	
        Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.
        
        E	pollFirst()	
        Retrieves and removes the first element of this deque, or returns null if this deque is empty.
        
        E	pollLast()	
        Retrieves and removes the last element of this deque, or returns null if this deque is empty.
        
        E	pop()	
        Pops an element from the stack represented by this deque.
        
        void	push​(E e)	
        Pushes an element onto the stack represented by this deque (in other words, at the head of this deque) if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
        
        E	remove()	
        Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque).
        
        boolean	remove​(Object o)	
        Removes the first occurrence of the specified element from this deque.
        
        E	removeFirst()	
        Retrieves and removes the first element of this deque.
        boolean	removeFirstOccurrence​(Object o)	
        Removes the first occurrence of the specified element from this deque.
        
        E	removeLast()	
        Retrieves and removes the last element of this deque.
        boolean	removeLastOccurrence​(Object o)	
        Removes the last occurrence of the specified element from this deque.
        
        int	size()	
        Returns the number of elements in this deque. */
        
    }
    
}
