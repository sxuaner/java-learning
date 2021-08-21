package com.java.learning.javase;

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


public class ReverseAString {

    public static void main(String[] args) {
        /*
         * Interview Question: How to reverse the order of digits in a String, given
         * that the String consists of only digits? How to optimize the performance?
         */

        String stringToReverse = "12345678";
        // Convert a String to an array of primitive type char:
        // Complexity?
        char[] arrayStringToReverse = stringToReverse.toCharArray();
        /*
         * List characteristics:
         * 
         * Interface List<E> Type Parameters: E - the type of elements in this list 1.
         * An ordered collection 2. Index based methods to insert, update, delete and
         * search the elements. The index is zero based. 3. allow duplicate elements. 4.
         * Null element allowed in some implementations 5. provides a special iterator,
         * called a ListIterator. It allows element insertion and replacement, and
         * bidirectional access(forward&backford) in addition to the normal operations
         * that the Iterator interface provides. 6. provides two methods to search for a
         * specified object. From a performance standpoint, these methods should be used
         * with caution. In many implementations they will perform costly linear
         * searches. O(n)
         * 
         * Interface ListIterator<E> A ListIterator has no current element; its cursor
         * position always lies between the element that would be returned by a call to
         * previous() and the element that would be returned by a call to next(). An
         * iterator for a list of length n has n+1 possible cursor positions, as
         * illustrated by the carets (^) below: Element(0) Element(1) Element(2) ...
         * Element(n-1) cursor positions: ^ ^ ^ ^ ^
         * 
         * What is charSequence?
         */
        List<Character> listStringToReverse = new ArrayList<>();

        // Iterate through the array and add each element to the arraylist
        for (char charIterator : arrayStringToReverse) {
            listStringToReverse.add(charIterator);
        }
        // Now reverse the list, because list is ordered
        Collections.reverse(listStringToReverse);

        // Positve case
        String result = "";
        Iterator<Character> iteratorListStringToReverse = listStringToReverse.iterator();
        while (iteratorListStringToReverse.hasNext()) {
            result += iteratorListStringToReverse.next();
        }
        // Now result is 87654321
        // Place what should be smaller on first operand
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
        Character[] tempArrayCharacter = negNum.chars().mapToObj(x-> (Character)(char)x).toArray(Character[]::new);

        // You can use an IntStream to generate the indices followed by mapToObj:

        // Approach 1: to reverse an array with Arrays
        Arrays.sort(tempArrayCharacter, new ReverseOrderComparator());

        // Compile the regex 
        Pattern pat = Pattern.compile("[0-9]");

        // .collect() expcts a collector returned and methods in Collectors.joining() can accomplish this
        String resultInString = Arrays.stream(tempArrayCharacter).map(x -> String.valueOf(x)).filter(pat.asPredicate()).collect(Collectors.joining());

        // Now let's convert the List of String into a String
        System.out.println("-" + resultInString);

        // Approach 2
        // reset result
        resultInString = "";
        // now filter the stream and reduce with String::concat
        // BinaryOperator<String> accumulator
        // What accumulators are available there?
        // 
        resultInString = Arrays.stream(tempArrayCharacter).map(x -> String.valueOf(x)).filter(pat.asPredicate()).reduce("", String::concat);

        System.out.println("-"+resultInString);
        // Or, join() expects a CharSequence, Charbuffer.wrap()
     
        // Approach 2: put the array into a list and reverse using Collections
        List<Character> myList = new ArrayList<>();
        for(char c: tempArrayCharacter){
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
    
}
