package com.java.learning.javase;
/*
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




    }
}
