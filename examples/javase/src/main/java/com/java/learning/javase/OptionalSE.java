package com.java.learning.javase;

/**

    public final class Optional<T> extends Object

A container object which may or may not contain a non-null value. If a value is present, isPresent() returns true. If no value is present, 
the object is considered empty and isPresent() returns false.

Additional methods that depend on the presence or absence of a contained value are provided, such as orElse() (returns a default value if no 
value is present) and ifPresent() (performs an action if a value is present).

This is a value-based class; use of identity-sensitive operations (including reference equality (==), identity hash code, or
synchronization) on instances of Optional may have unpredictable results and should be avoided.

API Note:
Optional is primarily intended for use as a method return type where there is a clear need to represent "no result," and where using null is 
likely to cause errors. A variable whose type is Optional should never itself be null; it should always point to an Optional instance. final?
 */
public class OptionalSE {




/* 
static <T> Optional<T>	empty()	
Returns an empty Optional instance.
boolean	equals​(Object obj)	
Indicates whether some other object is "equal to" this Optional.
Optional<T>	filter​(Predicate<? super T> predicate)	
If a value is present, and the value matches the given predicate, returns an Optional describing the value, otherwise returns an empty Optional.
<U> Optional<U>	flatMap​(Function<? super T,​? extends Optional<? extends U>> mapper)	
If a value is present, returns the result of applying the given Optional-bearing mapping function to the value, otherwise returns an empty Optional.
T	get()	
If a value is present, returns the value, otherwise throws NoSuchElementException.
int	hashCode()	
Returns the hash code of the value, if present, otherwise 0 (zero) if no value is present.
void	ifPresent​(Consumer<? super T> action)	
If a value is present, performs the given action with the value, otherwise does nothing.
void	ifPresentOrElse​(Consumer<? super T> action, Runnable emptyAction)	
If a value is present, performs the given action with the value, otherwise performs the given empty-based action.
boolean	isEmpty()	
If a value is not present, returns true, otherwise false.
boolean	isPresent()	
If a value is present, returns true, otherwise false.
<U> Optional<U>	map​(Function<? super T,​? extends U> mapper)	
If a value is present, returns an Optional describing (as if by ofNullable(T)) the result of applying the given mapping function to the value, otherwise returns an empty Optional.
static <T> Optional<T>	of​(T value)	
Returns an Optional describing the given non-null value.
static <T> Optional<T>	ofNullable​(T value)	
Returns an Optional describing the given value, if non-null, otherwise returns an empty Optional.
Optional<T>	or​(Supplier<? extends Optional<? extends T>> supplier)	
If a value is present, returns an Optional describing the value, otherwise returns an Optional produced by the supplying function.
T	orElse​(T other)	
If a value is present, returns the value, otherwise returns other.
T	orElseGet​(Supplier<? extends T> supplier)	
If a value is present, returns the value, otherwise returns the result produced by the supplying function.
T	orElseThrow()	
If a value is present, returns the value, otherwise throws NoSuchElementException.
<X extends Throwable>
T	orElseThrow​(Supplier<? extends X> exceptionSupplier)	
If a value is present, returns the value, otherwise throws an exception produced by the exception supplying function.
Stream<T>	stream()	
If a value is present, returns a sequential Stream containing only that value, otherwise returns an empty Stream.
String	toString()	
Returns a non-empty string representation of this Optional suitable for debugging. */
    
}
