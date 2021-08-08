package com.java.learning.javase;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MyIntStream {

    public static void main(String[] args) {
        char[] charArray = {'a','b','c'};
        List<Character> charList = new ArrayList<>();        
        for( char c : charArray){
            charList.add(c);
        }

        Stream<Character> charStream = charList.stream();
        /*         
        // reduce() is equvalent to: 
         // foundAny is a monitor object to find the first element of the stream.
        boolean foundAny = false;
         
          // result is used to store associative accumulation function
        int result = 0; 
           
        associative meaning:
        accumulation meaning:
        
        
        for (int element : charStream ) {
                // if the first element is now found, flip the monitor object so that we can execute the accumulative function
                if (!foundAny) {
                    foundAny = true;
                    result = element;
                }
                else
                    result = accumulator.applyAsInt(result, element);
            }
            return foundAny ? OptionalInt.of(result) : OptionalInt.empty(); */
            
        // but is not constrained to execute sequentially.The accumulator function must be an associative function.
        // This is a terminal operation.


        // getAsInt():
        // If a value is present in this OptionalInt, returns the value, otherwise
        // throws NoSuchElementException.
        int opint = new String(charArray).chars().reduce((x,y) -> x+y).getAsInt();
        //opint = 294

    }
    
}
