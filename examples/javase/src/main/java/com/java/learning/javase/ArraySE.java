package com.java.learning.javase;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
    Read Java Language Specification for more 

    Characteristics of array in Java
    1. fixed size
    2. index based
    3. Elements must be of the same type
    4. can be looped with  for-each loop for(Element c: Array). Time Complexity is O(n).
*/

public class ArraySE {

    public static void main(String[] args) {
        Character[] charArray= {'a', 'b', 'c'};
        // char[] charArray is not applicable here because?
        //  Spliterators.spliterator() takes Object[], int[], long[], doulbe[]

        // Optional<T> reduce(BinaryOperator<T> accumulator);
        Arrays.stream(charArray).parallel().map(a->a).collect(Collectors::toList);
        Arrays.stream(charArray).parallel().reduce();




    }

    
}
