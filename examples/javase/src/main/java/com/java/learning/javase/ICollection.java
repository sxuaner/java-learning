package com.java.learning.javase;

/**
 * public interface Collection<E> extends Iterable<E>
 */

 /**
  * The root interface in the collection hierarchy. 

A collection represents a group of objects, known as its elements. 

Some collections allow duplicate elements and others do not. 
Allow duplicate elements:  List
No duplicate: Set

Some are ordered and others unordered. 

The JDK does not provide any direct implementations of this interface: it provides implementations of more specific 
subinterfaces like Set and List. This interface is typically used to pass collections around and manipulate them where maximum generality is 
desired. Bags or multisets (unordered collections that may contain duplicate elements) should implement this interface directly.

All general-purpose Collection implementation classes (which typically implement Collection indirectly through one of its subinterfaces) should
provide two "standard" constructors: a void (no arguments) constructor, which creates an empty collection, and a constructor with a single argument of type
Collection, which creates a new collection with the same elements as its argument. In effect, the latter constructor allows the user to copy any
collection, producing an equivalent collection of the desired implementation type. There is no way to enforce this convention (as interfaces cannot
contain constructors) but all of the general-purpose Collection implementations in the Java platform libraries comply.

Certain methods are specified to be optional. If a collection implementation doesn't implement a particular operation, it should define the 
corresponding method to throw UnsupportedOperationException. Such methods are marked "optional operation" in method specifications of the 
collections interfaces.

/ɪˈnel.ɪ.dʒə.bəl/  ineligible
Some collection implementations have restrictions on the elements that they may contain. For example, some implementations prohibit null elements, 
and some have restrictions on the types of their elements. Attempting to add an ineligible element throws an unchecked exception, typically
* NullPointerException or ClassCastException. Attempting to query the presence of an ineligible element may throw an exception, or it may simply 
return false; some implementations will exhibit the former behavior and some will exhibit the latter. More generally, attempting an operation on 
an ineligible element whose completion would not result in the insertion of an ineligible element into the collection may throw an exception or 
it may succeed, at the option of the implementation. Such exceptions are marked as "optional" in the specification for this interface.

* It is up to each collection to determine its own synchronization policy. In the absence of a stronger guarantee by the implementation, undefined 
behavior may result from the invocation of any method on a collection that is being mutated by another thread; this includes direct invocations, 
passing the collection to a method that might perform invocations, and using an existing iterator to examine the collection.
* 
* Many methods in Collections Framework interfaces are defined in terms of the equals method. For example, the specification for the contains(Objecto)
* method says: "returns true if and only if this collection contains at least one element e such that (o==null ? e==null : o.equals(e))." This
specification should not be construed to imply that invoking Collection.contains with a non-null argument o will cause o.equals(e) to be
* invoked for any element e. Implementations are free to implement optimizations whereby the equals invocation is avoided, for example, by first
* comparing the hash codes of the two elements. (The Object.hashCode() specification guarantees that two objects with unequal hash codes cannot be
* equal.) More generally, implementations of the various Collections Framework interfaces are free to take advantage of the specified behavior 
of underlying Object methods wherever the implementor deems it appropriate.
* 
* Some collection operations which perform recursive traversal of the collection may fail with an exception for self-referential instances where
* the collection directly or indirectly contains itself. This includes the clone(), equals(), hashCode() and toString() methods. Implementations may
* optionally handle the self-referential scenario, however most current implementations do not do so.
* 
* View Collections
* 
* Most collections manage storage for elements they contain. By contrast, view collections themselves do not store elements, but instead they rely on a
* backing collection to store the actual elements. Operations that are not handled by the view collection itself are delegated to the backing
* collection. Examples of view collections include the wrapper collections returned by methods such as Collections.checkedCollection,
* Collections.synchronizedCollection, and Collections.unmodifiableCollection. Other examples of view collections include collections that provide a
* different representation of the same elements, for example, as provided by List.subList, NavigableSet.subSet, or Map.entrySet. Any changes made 
to the backing collection are visible in the view collection. Correspondingly, any changes made to the view collection — if changes are permitted — are written
* through to the backing collection. Although they technically aren't collections, instances of Iterator and ListIterator can also allow
* modifications to be written through to the backing collection, and in some cases, modifications to the backing collection will be visible to the
* Iterator during iteration.
* 
* Unmodifiable Collections
* 
* Certain methods of this interface are considered "destructive" and are called "mutator" methods in that they modify the group of objects contained 
within the collection on which they operate. 

They can be specified to throw UnsupportedOperationException if this collection implementation does not
* support the operation. Such methods should (but are not required to) throw an UnsupportedOperationException if the invocation would have no effect
on the collection. For example, consider a collection that does not support the add operation. What will happen if the addAll method is invoked on
this collection, with an empty collection as the argument? The addition of zero elements has no effect, so it is permissible for this collection 
simply to do nothing and not to throw an exception. However, it is recommended that such cases throw an exception unconditionally, as throwing 
only in certain cases can lead to programming errors.
* 
* An unmodifiable collection is a collection, all of whose mutator methods (as defined above) are specified to throw UnsupportedOperationException. 
Such a collection thus cannot be modified by calling any methods on it. For a collection to be properly unmodifiable, any view collections derived
from it must also be unmodifiable. For example, if a List is unmodifiable, the List returned by List.subList is also unmodifiable.
* 
* An unmodifiable collection is not necessarily immutable. If the contained elements are mutable, the entire collection is clearly mutable, even though
* it might be unmodifiable. For example, consider two unmodifiable lists containing mutable elements. The result of calling list1.equals(list2) might
* differ from one call to the next if the elements had been mutated, even though both lists are unmodifiable. However, if an unmodifiable collection
* contains all immutable elements, it can be considered effectively immutable.
* 
* Unmodifiable View Collections
* 
* An unmodifiable view collection is a collection that is unmodifiable and that is also a view onto a backing collection. Its mutator methods throw
* UnsupportedOperationException, as described above, while reading and querying methods are delegated to the backing collection. The effect is to provide
* read-only access to the backing collection. This is useful for a component to provide users with read access to an internal collection, while preventing
* them from modifying such collections unexpectedly. Examples of unmodifiable view collections are those returned by the
* Collections.unmodifiableCollection, Collections.unmodifiableList, and related methods.
* 
* Note that changes to the backing collection might still be possible, and if they occur, they are visible through the unmodifiable view. Thus, an
* unmodifiable view collection is not necessarily immutable. However, if the backing collection of an unmodifiable view is effectively immutable, 
or if the only reference to the backing collection is through an unmodifiable view, the view can be considered effectively immutable.
* 
* This interface is a member of the Java Collections Framework.
* 
* Implementation Requirements: The default method implementations (inherited or otherwise) do not apply any synchronization protocol. If a Collection
* implementation has a specific synchronization protocol, then it must override default implementations to apply that protocol.
*/
public class ICollection {
    
}
