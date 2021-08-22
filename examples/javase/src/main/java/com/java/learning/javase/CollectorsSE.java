package com.java.learning.javase;

/**
 *  public final class Collectors
    extends Object

Implementations of Collector that implement various useful reduction operations, such as accumulating elements into collections, summarizing 
elements according to various criteria, etc. The following are examples of using the predefined collectors to perform common mutable reduction tasks:

 // Accumulate names into a List
 List<String> list = people.stream()
   .map(Person::getName)
   .collect(Collectors.toList());

 // Accumulate names into a TreeSet
 Set<String> set = people.stream()
   .map(Person::getName)
   .collect(Collectors.toCollection(TreeSet::new));

 // Convert elements to strings and concatenate them, separated by commas
 String joined = things.stream()
   .map(Object::toString)
   .collect(Collectors.joining(", "));

 // Compute sum of salaries of employee
 int total = employees.stream()
   .collect(Collectors.summingInt(Employee::getSalary));

 // Group employees by department
 Map<Department, List<Employee>> byDept = employees.stream()
   .collect(Collectors.groupingBy(Employee::getDepartment));

 // Compute sum of salaries by department
 Map<Department, Integer> totalByDept = employees.stream()
   .collect(Collectors.groupingBy(Employee::getDepartment,
                                  Collectors.summingInt(Employee::getSalary)));

 // Partition students into passing and failing
 Map<Boolean, List<Student>> passingFailing = students.stream()
   .collect(Collectors.partitioningBy(s -> s.getGrade() >= PASS_THRESHOLD));


 */
public class CollectorsSE {
  
public static void main(String[] args) {

        /* tatic <T> Collector<T,​?,​Double>	averagingDouble​(ToDoubleFunction<? super T> mapper)	
        Returns a Collector that produces the arithmetic mean of a double-valued function applied to the input elements.
        static <T> Collector<T,​?,​Double>

        averagingInt​(ToIntFunction<? super T> mapper)	
        Returns a Collector that produces the arithmetic mean of an integer-valued function applied to the input elements.
        static <T> Collector<T,​?,​Double>

            averagingLong​(ToLongFunction<? super T> mapper)	
        Returns a Collector that produces the arithmetic mean of a long-valued function applied to the input elements.
        static <T,​A,​R,​RR>
        Collector<T,​A,​RR>	collectingAndThen​(Collector<T,​A,​R> downstream, Function<R,​RR> finisher)	
        Adapts a Collector to perform an additional finishing transformation.
        static <T> Collector<T,​?,​Long>	counting()	
        Returns a Collector accepting elements of type T that counts the number of input elements.
        static <T,​A,​R>
        Collector<T,​?,​R>

            filtering​(Predicate<? super T> predicate, Collector<? super T,​A,​R> downstream)	
        Adapts a Collector to one accepting elements of the same type T by applying the predicate to each input element and only accumulating if the predicate returns true.
        static <T,​U,​A,​R>
        Collector<T,​?,​R>	flatMapping​(Function<? super T,​? extends Stream<? extends U>> mapper, Collector<? super U,​A,​R> downstream)	
        Adapts a Collector accepting elements of type U to one accepting elements of type T by applying a flat mapping function to each input element before accumulation.
        static <T,​K>
        Collector<T,​?,​Map<K,​List<T>>>	groupingBy​(Function<? super T,​? extends K> classifier)	
        Returns a Collector implementing a "group by" operation on input elements of type T, grouping elements according to a classification function, and returning the results in a Map.
        static <T,​K,​D,​A,​M extends Map<K,​D>>
        Collector<T,​?,​M>	groupingBy​(Function<? super T,​? extends K> classifier, Supplier<M> mapFactory, Collector<? super T,​A,​D> downstream)	
        Returns a Collector implementing a cascaded "group by" operation on input elements of type T, grouping elements according to a classification function, and then performing a reduction operation on the values associated with a given key using the specified downstream Collector.
        static <T,​K,​A,​D>
        Collector<T,​?,​Map<K,​D>>	groupingBy​(Function<? super T,​? extends K> classifier, Collector<? super T,​A,​D> downstream)	
        Returns a Collector implementing a cascaded "group by" operation on input elements of type T, grouping elements according to a classification function, and then performing a reduction operation on the values associated with a given key using the specified downstream Collector.
        static <T,​K>
        Collector<T,​?,​ConcurrentMap<K,​List<T>>>	groupingByConcurrent​(Function<? super T,​? extends K> classifier)	
        Returns a concurrent Collector implementing a "group by" operation on input elements of type T, grouping elements according to a classification function.
        static <T,​K,​A,​D,​M extends ConcurrentMap<K,​D>>
        Collector<T,​?,​M>	groupingByConcurrent​(Function<? super T,​? extends K> classifier, Supplier<M> mapFactory, Collector<? super T,​A,​D> downstream)	
        Returns a concurrent Collector implementing a cascaded "group by" operation on input elements of type T, grouping elements according to a classification function, and then performing a reduction operation on the values associated with a given key using the specified downstream Collector.
        static <T,​K,​A,​D>
        Collector<T,​?,​ConcurrentMap<K,​D>>	groupingByConcurrent​(Function<? super T,​? extends K> classifier, Collector<? super T,​A,​D> downstream)	
        Returns a concurrent Collector implementing a cascaded "group by" operation on input elements of type T, grouping elements according to a classification function, and then performing a reduction operation on the values associated with a given key using the specified downstream Collector.
        static Collector<CharSequence,​?,​String>	joining()	
        Returns a Collector that concatenates the input elements into a String, in encounter order.
        static Collector<CharSequence,​?,​String>

            joining​(CharSequence delimiter)	
        Returns a Collector that concatenates the input elements, separated by the specified delimiter, in encounter order.
        static Collector<CharSequence,​?,​String>

            joining​(CharSequence delimiter, CharSequence prefix, CharSequence suffix)	
        Returns a Collector that concatenates the input elements, separated by the specified delimiter, with the specified prefix and suffix, in encounter order.
        static <T,​U,​A,​R>
        Collector<T,​?,​R>	mapping​(Function<? super T,​? extends U> mapper, Collector<? super U,​A,​R> downstream)	
        Adapts a Collector accepting elements of type U to one accepting elements of type T by applying a mapping function to each input element before accumulation.
        static <T> Collector<T,​?,​Optional<T>>

            maxBy​(Comparator<? super T> comparator)	
        Returns a Collector that produces the maximal element according to a given Comparator, described as an Optional<T>.
        static <T> Collector<T,​?,​Optional<T>>

            minBy​(Comparator<? super T> comparator)	
        Returns a Collector that produces the minimal element according to a given Comparator, described as an Optional<T>.
        static <T> Collector<T,​?,​Map<Boolean,​List<T>>>

            partitioningBy​(Predicate<? super T> predicate)	
        Returns a Collector which partitions the input elements according to a Predicate, and organizes them into a Map<Boolean, List<T>>.
        static <T,​D,​A>
        Collector<T,​?,​Map<Boolean,​D>>	partitioningBy​(Predicate<? super T> predicate, Collector<? super T,​A,​D> downstream)	
        Returns a Collector which partitions the input elements according to a Predicate, reduces the values in each partition according to another Collector, and organizes them into a Map<Boolean, D> whose values are the result of the downstream reduction.
        static <T> Collector<T,​?,​Optional<T>>

            reducing​(BinaryOperator<T> op)	
        Returns a Collector which performs a reduction of its input elements under a specified BinaryOperator.
        static <T> Collector<T,​?,​T>

            reducing​(T identity, BinaryOperator<T> op)	
        Returns a Collector which performs a reduction of its input elements under a specified BinaryOperator using the provided identity.
        static <T,​U>
        Collector<T,​?,​U>	reducing​(U identity, Function<? super T,​? extends U> mapper, BinaryOperator<U> op)	
        Returns a Collector which performs a reduction of its input elements under a specified mapping function and BinaryOperator.
        static <T> Collector<T,​?,​DoubleSummaryStatistics>

            summarizingDouble​(ToDoubleFunction<? super T> mapper)	
        Returns a Collector which applies an double-producing mapping function to each input element, and returns summary statistics for the resulting values.
        static <T> Collector<T,​?,​IntSummaryStatistics>

            summarizingInt​(ToIntFunction<? super T> mapper)	
        Returns a Collector which applies an int-producing mapping function to each input element, and returns summary statistics for the resulting values.
        static <T> Collector<T,​?,​LongSummaryStatistics>

            summarizingLong​(ToLongFunction<? super T> mapper)	
        Returns a Collector which applies an long-producing mapping function to each input element, and returns summary statistics for the resulting values.
        static <T> Collector<T,​?,​Double>

            summingDouble​(ToDoubleFunction<? super T> mapper)	
        Returns a Collector that produces the sum of a double-valued function applied to the input elements.
        static <T> Collector<T,​?,​Integer>

            summingInt​(ToIntFunction<? super T> mapper)	
        Returns a Collector that produces the sum of a integer-valued function applied to the input elements.
        static <T> Collector<T,​?,​Long>

            summingLong​(ToLongFunction<? super T> mapper)	
        Returns a Collector that produces the sum of a long-valued function applied to the input elements.
        static <T,​C extends Collection<T>>
        Collector<T,​?,​C>

            toCollection​(Supplier<C> collectionFactory)	
        Returns a Collector that accumulates the input elements into a new Collection, in encounter order.
        static <T,​K,​U>
        Collector<T,​?,​ConcurrentMap<K,​U>>	toConcurrentMap​(Function<? super T,​? extends K> keyMapper, Function<? super T,​? extends U> valueMapper)	
        Returns a concurrent Collector that accumulates elements into a ConcurrentMap whose keys and values are the result of applying the provided mapping functions to the input elements.
        static <T,​K,​U>
        Collector<T,​?,​ConcurrentMap<K,​U>>	toConcurrentMap​(Function<? super T,​? extends K> keyMapper, Function<? super T,​? extends U> valueMapper, BinaryOperator<U> mergeFunction)	
        Returns a concurrent Collector that accumulates elements into a ConcurrentMap whose keys and values are the result of applying the provided mapping functions to the input elements.
        static <T,​K,​U,​M extends ConcurrentMap<K,​U>>
        Collector<T,​?,​M>	toConcurrentMap​(Function<? super T,​? extends K> keyMapper, Function<? super T,​? extends U> valueMapper, BinaryOperator<U> mergeFunction, Supplier<M> mapFactory)	
        Returns a concurrent Collector that accumulates elements into a ConcurrentMap whose keys and values are the result of applying the provided mapping functions to the input elements.
        static <T> Collector<T,​?,​List<T>>	toList()	
        Returns a Collector that accumulates the input elements into a new List.
        static <T,​K,​U>
        Collector<T,​?,​Map<K,​U>>	toMap​(Function<? super T,​? extends K> keyMapper, Function<? super T,​? extends U> valueMapper)	
        Returns a Collector that accumulates elements into a Map whose keys and values are the result of applying the provided mapping functions to the input elements.
        static <T,​K,​U>
        Collector<T,​?,​Map<K,​U>>	toMap​(Function<? super T,​? extends K> keyMapper, Function<? super T,​? extends U> valueMapper, BinaryOperator<U> mergeFunction)	
        Returns a Collector that accumulates elements into a Map whose keys and values are the result of applying the provided mapping functions to the input elements.
        static <T,​K,​U,​M extends Map<K,​U>>
        Collector<T,​?,​M>	toMap​(Function<? super T,​? extends K> keyMapper, Function<? super T,​? extends U> valueMapper, BinaryOperator<U> mergeFunction, Supplier<M> mapFactory)	
        Returns a Collector that accumulates elements into a Map whose keys and values are the result of applying the provided mapping functions to the input elements.
        static <T> Collector<T,​?,​Set<T>>	toSet()	
        Returns a Collector that accumulates the input elements into a new Set.
        static <T> Collector<T,​?,​List<T>>	toUnmodifiableList()	
        Returns a Collector that accumulates the input elements into an unmodifiable List in encounter order.
        static <T,​K,​U>
        Collector<T,​?,​Map<K,​U>>	toUnmodifiableMap​(Function<? super T,​? extends K> keyMapper, Function<? super T,​? extends U> valueMapper)	
        Returns a Collector that accumulates the input elements into an unmodifiable Map, whose keys and values are the result of applying the provided mapping functions to the input elements.
        static <T,​K,​U>
        Collector<T,​?,​Map<K,​U>>	toUnmodifiableMap​(Function<? super T,​? extends K> keyMapper, Function<? super T,​? extends U> valueMapper, BinaryOperator<U> mergeFunction)	
        Returns a Collector that accumulates the input elements into an unmodifiable Map, whose keys and values are the result of applying the provided mapping functions to the input elements.
        static <T> Collector<T,​?,​Set<T>>	toUnmodifiableSet() */
    
}
}
