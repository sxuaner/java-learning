package com.java.learning.javase;
/*
public interface Stream<T>
        extends BaseStream<T,​Stream<T>>

A sequence of elements supporting sequential and parallel aggregate operations. The following example illustrates an aggregate operation using Stream and IntStream:
     int sum = widgets.stream()
                      .filter(w -> w.getColor() == RED)
                      .mapToInt(w -> w.getWeight())
                      .sum();
 
In this example, widgets is a Collection<Widget>. We create a stream of Widget objects via Collection.stream(), filter it to produce a stream containing only the red widgets, and then transform it into a stream of int values representing the weight of each red widget. Then this stream is summed to produce a total weight.
In addition to Stream, which is a stream of object references, there are primitive specializations for IntStream, LongStream, and DoubleStream, all of which are referred to as "streams" and conform to the characteristics and restrictions described here.

To perform a computation, stream operations are composed into a stream pipeline. A stream pipeline consists of a source (which might be an array, a collection, a generator function, an I/O channel, etc), zero or more intermediate operations (which transform a stream into another stream, such as filter(Predicate)), and a terminal operation (which produces a result or side-effect, such as count() or forEach(Consumer)). Streams are lazy; computation on the source data is only performed when the terminal operation is initiated, and source elements are consumed only as needed.

A stream implementation is permitted significant latitude in optimizing the computation of the result. For example, a stream implementation is free to elide operations (or entire stages) from a stream pipeline -- and therefore elide invocation of behavioral parameters -- if it can prove that it would not affect the result of the computation. This means that side-effects of behavioral parameters may not always be executed and should not be relied upon, unless otherwise specified (such as by the terminal operations forEach and forEachOrdered). (For a specific example of such an optimization, see the API note documented on the count() operation. For more detail, see the side-effects section of the stream package documentation.)

Collections and streams, while bearing some superficial similarities, have different goals. Collections are primarily concerned with the efficient management of, and access to, their elements. By contrast, streams do not provide a means to directly access or manipulate their elements, and are instead concerned with declaratively describing their source and the computational operations which will be performed in aggregate on that source. However, if the provided stream operations do not offer the desired functionality, the BaseStream.iterator() and BaseStream.spliterator() operations can be used to perform a controlled traversal.

A stream pipeline, like the "widgets" example above, can be viewed as a query on the stream source. Unless the source was explicitly designed for concurrent modification (such as a ConcurrentHashMap), unpredictable or erroneous behavior may result from modifying the stream source while it is being queried.

Most stream operations accept parameters that describe user-specified behavior, such as the lambda expression w -> w.getWeight() passed to mapToInt in the example above. To preserve correct behavior, these behavioral parameters:

must be non-interfering (they do not modify the stream source); and
in most cases must be stateless (their result should not depend on any state that might change during execution of the stream pipeline).
Such parameters are always instances of a functional interface such as Function, and are often lambda expressions or method references. Unless otherwise specified these parameters must be non-null.

A stream should be operated on (invoking an intermediate or terminal stream operation) only once. This rules out, for example, "forked" streams, where the same source feeds two or more pipelines, or multiple traversals of the same stream. A stream implementation may throw IllegalStateException if it detects that the stream is being reused. However, since some stream operations may return their receiver rather than a new stream object, it may not be possible to detect reuse in all cases.

Streams have a BaseStream.close() method and implement AutoCloseable. Operating on a stream after it has been closed will throw IllegalStateException. Most stream instances do not actually need to be closed after use, as they are backed by collections, arrays, or generating functions, which require no special resource management. Generally, only streams whose source is an IO channel, such as those returned by Files.lines(Path), will require closing. If a stream does require closing, it must be opened as a resource within a try-with-resources statement or similar control structure to ensure that it is closed promptly after its operations have completed.

Stream pipelines may execute either sequentially or in parallel. This execution mode is a property of the stream. Streams are created with an initial choice of sequential or parallel execution. (For example, Collection.stream() creates a sequential stream, and Collection.parallelStream() creates a parallel one.) This choice of execution mode may be modified by the BaseStream.sequential() or BaseStream.parallel() methods, and may be queried with the BaseStream.isParallel() method.




 * Stream:
 * Classes to support functional-style operations on streams of elements, such as map-reduce transformations on 
 * collections.
 * 
 * Stream and IntStream are interfaces.
 * 
 * In addition to Stream, which is a stream of object references, there are primitive specializations 
 * for IntStream, LongStream, and DoubleStream, all of which are referred to as "streams" and conform to 
 * the characteristics and restrictions described here.
 * 
 * Stream is more generic, whereas IntStream targets only int type
 * 
 * public interface IntStream extends BaseStream<Integer,IntStream>
 * A sequence of primitive int-valued elements supporting sequential and parallel aggregate operations. 
 * This is the int primitive specialization of Stream.
 * 
 * public interface Stream<T> extends BaseStream<T,Stream<T>>
 * 
 * To perform a computation, stream operations are composed into a stream pipeline. A stream pipeline 
 * consists of a source (which might be an array, a collection, a generator function, an I/O channel, 
 * etc), zero or more intermediate operations (which transform a stream into another stream, such as 
 * filter(Predicate)), and a terminal operation (which produces a result or side-effect, such as count()
 * or forEach(Consumer)). Streams are lazy; computation on the source data is only performed when the 
 * terminal operation is initiated, and source elements are consumed only as needed.
 *
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class IStreamSE {
    public static void main(String[] args) {
        List<Integer> mylist = Arrays.asList(1,2,3,4,5,6);
        Stream aStream = mylist.stream();

    /*
     * Stream<T> filter(Predicate<? super T> predicate)     // Filter out qualified candidates based on a
     *                                                      // boolean prediate
     * 
     * public interface Predicate<T> :: boolean test(T t);
     */

     // Result of following
        Integer[] result = mylist.stream()
                                //  .filter(new MyPredicate())
                                .filter(x -> x>3)
                                .toArray(Integer[]::new);

        List<Integer> resultArrayList =   Arrays.asList(result);
        // .toArray(Integer[]::new) is a function?
        // No, it's called method reference
        
        // See why .toArray(Integer[]::new) is legitimate in 23. Functional Programming.notes
        result.getClass();
        resultArrayList.size();
        // How to create Streams? How many approaches are there?
        // map
        /**
         * 
         */
        // Stream<R> java.util.stream.Stream.map(Function<? super T, ? extends R> mapper)
        // aStream.map();

        // reduce

        List<Object[]> splitUpNames = Arrays.asList("John Woo", "Jeff Dean", "Josh Bloch", "Josh Long").stream()
                .map(name -> name.split(" ")).collect(Collectors.toList());

        //  * 1. How to obtain streams from normal user-defined classes???



    }
}
