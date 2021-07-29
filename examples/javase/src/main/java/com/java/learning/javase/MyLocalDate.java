package com.java.learning.javase;

import java.time.LocalDate;

/*  This class does not store or represent a time or time-zone. Instead, it is a description of the date, as used for 
    birthdays. It cannot represent an instant/an extremely short period of time/ on the time-line without additional information such as an offset or 
    time-zone.
    THen what should be used to represent a time-zone based time?
 */
public class MyLocalDate {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2021, 3, 19);
        int result = ld.compareTo(LocalDate.of(2021, 3, 20));

        new Integer(result).hashCode();

        

    }
    
}
