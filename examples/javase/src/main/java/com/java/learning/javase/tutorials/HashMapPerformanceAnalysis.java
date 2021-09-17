package com.java.learning.javase.tutorials;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;


/**
 * A microsecond is an SI unit of time equal to one millionth (0.000001 or 10−6 or 1⁄1,000,000) of a second.
 * A microsecond is equal to 1000 nanoseconds or 1⁄1,000 of a millisecond.
 */
public class HashMapPerformanceAnalysis{
    
    private static final char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static void main(String[] args) {
        Person me = new Person("Adam", "McQuistan", LocalDate.parse("1987-09-23"));

        // set timer 
        long start = System.currentTimeMillis();
        // Data Structure to contain         
        List<Person> peopleList = new ArrayList<>();

        // try insertion.
        for (int i = 0; i < 10000; i++) {
            if (i == 4999) {
                peopleList.add(me);
            }
            peopleList.add(new Person(getRandomName(), getRandomName(), getRandomDate()));
        }

        System.out.println("Microseconds to build list: " + getTimeElapsed(start, System.currentTimeMillis()));

        //reset start for testing HashMap
        start = System.currentTimeMillis();

        Map<Person, String> peopleMap = new HashMap<>();

        for (int i = 0; i < 10000; i++) {
            if (i == 4999) {
                peopleMap.put(me, me.toString());
            }
            Person p = new Person(getRandomName(), getRandomName(), getRandomDate());
            peopleMap.put(p, p.toString());
        }

        System.out.println("Miliseconds to build map: " + getTimeElapsed(start, System.currentTimeMillis()));

        start = System.currentTimeMillis();
        // test search in List
        boolean found = peopleList.contains(me);
        System.out.println("Miliseconds to search list is " + getTimeElapsed(start, System.currentTimeMillis()));

        start = System.currentTimeMillis();
        // test search in HashMap
        found = peopleMap.containsKey(me);
        System.out.println("Miliseconds to search map is " + getTimeElapsed(start, System.currentTimeMillis()));
    }

    public static String getRandomName() {
        int size = alphabet.length;
        Random rand = new Random();
        List<Character> chars = Arrays.asList(alphabet[rand.nextInt(size)], alphabet[rand.nextInt(size)],
                alphabet[rand.nextInt(size)], alphabet[rand.nextInt(size)]);
        return chars.stream().map(String::valueOf).collect(Collectors.joining());
    }

    public static LocalDate getRandomDate() {
        Random rand = new Random();
        int min = (int) LocalDate.of(1980, 1, 1).toEpochDay();
        int max = (int) LocalDate.of(2018, 10, 14).toEpochDay();
        long day = min + rand.nextInt(max - min);
        return LocalDate.ofEpochDay(day);
    }

    public static long getTimeElapsed(long start, long end) {
        return (end - start);         

    }
}