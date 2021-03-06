package com.java.learning.javase.interview;

import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import java.util.stream.Collectors;

/*
   * Interview Question: How to reverse the order of digits in a String, given
   * that the String consists of only digits? How to optimize the performance?
   */

public class ReverseAString {

    public static void main(String[] args) {
  
        String method3ReturnedValue =  method3();

        String stringToReverse = "12345678";
        // Convert a String to an array of primitive type char:
        // Complexity?
        char[] arrayStringToReverse = stringToReverse.toCharArray();
        List<Character> listStringToReverse = new ArrayList<>();

        // Iterate through the array and add each element to the arraylist. 
        // Because Collection can only contain reference types, primitive types are to be autoboxed.
        for (char charIterator : arrayStringToReverse) {
            listStringToReverse.add(charIterator);
        }
        // Now reverse the list, because list is ordered
        Collections.reverse(listStringToReverse);

        // Concatenate all elements in listStringToReverse.
        String result = "";
        Iterator<Character> iteratorOfListStringToReverse = listStringToReverse.iterator();
        while (iteratorOfListStringToReverse.hasNext()) {
            result += iteratorOfListStringToReverse.next();
        }
        // why can String:valueOf be used here? It returns an String and conforms to definition of function( one to one)
        /**
         public static String valueOf(Object obj) {
                return (obj == null) ? "null" : obj.toString();
            }
         */
        result = listStringToReverse.stream().map(String::valueOf).collect(Collectors.joining());

        // Place what should be smaller on first operand
        // login behind  this
        class  ReverseOrderComparator implements Comparator<Character>{
            @Override
            public int compare(Character o1, Character o2) {
                return (int)o2 - (int)o1;
            }
        }

        // Nagtive case:
        // How to apply regex to a string?
        // how to revese an array
        String negNum = "-12345";

        // No longer needed: char[] tempArrayChar = negNum.toCharArray();
        Character[] tempCharacterArray = negNum.chars().mapToObj(x-> (Character)(char)x).toArray(Character[]::new);

        // You can use an IntStream to generate the indices followed by mapToObj:

        // Approach 1: to reverse an array with Arrays
        Arrays.sort(tempCharacterArray, new ReverseOrderComparator());

        // Compile the regex 
        Pattern pat = Pattern.compile("[0-9]");

        // .collect() expcts a collector returned and methods in Collectors.joining() can accomplish this
        // Returns a Collector that concatenates the input elements into a String, in encounter order.
        String resultInString = Arrays.stream(tempCharacterArray).map(x -> String.valueOf(x)).filter(pat.asPredicate()).collect(Collectors.joining());

        // Now let's convert the List of String into a String
        System.out.println("-" + resultInString);

        // Approach 2
        // reset result
        resultInString = "";
        // now filter the stream and reduce with String::concat
        // BinaryOperator<String> accumulator
        // What accumulators are available there?
        // 
        resultInString = Arrays.stream(tempCharacterArray).map(x -> String.valueOf(x)).filter(pat.asPredicate()).reduce("", String::concat);

        System.out.println("-"+resultInString);
        // Or, join() expects a CharSequence, Charbuffer.wrap()
     
        // Approach 2: put the array into a list and reverse using Collections
        List<Character> myList = new ArrayList<>();
        for(char c: tempCharacterArray){
            myList.add(c);
        }

        Collections.reverse(myList);

        // Now lets print out the result
        //Problem 1: ArrayList.toString() returns [1,2,3,4], we need a string
        // How to concate elements of a list to a string
        // Stupid would be to loop through the list and append each and every element to the end of an empty string
        // If the last char is - sign, then syso("-" + mylist.stringform)

        // https://stackoverflow.com/questions/10168066/how-to-print-out-all-the-elements-of-a-list-in-java/24109978
        // This is not working
        // System.out.println(Arrays.toString(myList.toArray()));
        // And is equavalent to: 
        // Arrays.asList(a).toString()

        // Java 8 approach:
        // myList.stream().forEach(System.out::print);

        // But for this problem, we must filter the list and ouput the non-dash chars 
        if(myList.get(myList.size()-1) == '-'){
            StringBuilder reversedStringBuilder = new StringBuilder();
            myList.stream()
                .forEach(x -> {
                if (x != '-')
                    reversedStringBuilder.append(x);
            });
            System.out.println("-" + reversedStringBuilder);
        }else{
            myList.stream().forEach(System.out::print);
        }

        // differences among Stream.map(), Stream.forEach(), reduce()? see StreamSE.java
    }

    public static String method3(){
        String sampleStr = "1234567";
        Long result = 0l;
        try {
            result = Long.parseLong(sampleStr);
            // not working because reverse() reverses the bits
            result = Long.reverse(result);
        } catch (NumberFormatException ne) {
            ne.printStackTrace();
        }
        // how to convert a long to a String?
        return Long.toString(result);

    }

    
}
