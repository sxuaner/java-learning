package com.java.learning.javase;

import java.util.Comparator;

public class MyComparator  implements Comparator<Character>{

    @Override
    public int compare(Character o1, Character o2) {
        // What's the logic behind this? If the hashCode of o2 is greater than that of o1.
        // TimSort() will be called using the comparator.
        //     public static <T> void sort(T[] a, Comparator<? super T> c) {
        //          if (c == null) {
        //              sort(a);
        //          } else {
        //          if (LegacyMergeSort.userRequested)
        //                  legacyMergeSort(a, c);
        //             else
        //                  TimSort.sort(a, 0, a.length, c, null, 0, 0);
        //          }
        // }

        return o2.hashCode() - o1.hashCode();
    }
    
}
