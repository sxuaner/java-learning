package com.java.learning.javase;

public class GenericProgrammingSE {

    /* public static <T, SOURCE extends Collection<T>, DEST extends Collection<T>> DEST transferElements(
            SOURCE sourceCollection, Supplier<DEST> collectionFactory) {

        DEST result = collectionFactory.get();
        for (T t : sourceCollection) {
            result.add(t);
        }
        return result;
    } */

    // The functional interface Supplier contains one method get that takes no
    // arguments and returns an object.

    // Set<Person> rosterSetLambda = transferElements(roster, () -> {
    //     return new HashSet<>();
    // });
    
    // Set<Person> rosterSet = transferElements(roster, HashSet<Person>::new);
    
}
