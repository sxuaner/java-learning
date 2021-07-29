package com.java.learning.javase;

import java.util.function.Predicate;

public class MyPredicate implements Predicate<Integer>{

    @Override
    public boolean test(Integer t) {
      /*   if((int)t>0) return true;
        return false; */
        return t> 3;
    }

    
}
