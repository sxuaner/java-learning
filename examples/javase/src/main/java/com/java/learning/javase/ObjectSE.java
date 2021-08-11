package com.java.learning.javase;

/**
 * 
 * Class Object is the root of the class hierarchy. Every class has Object as
 * a superclass. All objects, including arrays, implement the methods of this
 * class.
 * 
 */

/**
 * 
 * ################### equals #####################
 * 
 * What's under the hood of Object.equals()? It is actually testing if 2
 * references are same. However, equals() is usually overwritten.
 * 
 * this: reference to current object(PC? is pointing to?) obj: the reference to
 * the object {ObjectSE$1ObjBean@10}in the heap
 * 
 * public boolean equals(Object obj) { return (this == obj); }
 * 
 * !!!!! The principle is that hash code must change if equals comparison result
 * changes and vice versa. This usually means that all the variables taken into
 * account when comparing two items should be considered when computing the
 * hashcode, so that if something changes, this change is relflected both on
 * comparisons and on hashcodes.
 * 
 * A hash code can be any value that will fit in an "int". That includes negative numbers.
 * 
 * There is no guarantee that different objects will have different hash codes.
 * The guarantee is that equal objects will have equal hash codes. It is in fact
 * legal (but inadvisable) for a class to return the same hash code for all
 * instances.
 * 
 * Basically, when implementing hashCode(), one first ensures that equal objects
 * generate the same hash code, then tries to ensure that different objects
 * produce a reasonable spread of hash codes. But one is constrained by a need
 * for hashCode() to run quickly, so sometimes one compromises hashing quality
 * for speed.
 * 
 * ################### HashCode ###################
 * 
 * @HotSpotIntrinsicCandidate public native int hashCode();
 * 
 *                            Returns a hash code value for the object. This
 *                            method is supported for the benefit of hash tables
 *                            such as those provided by java.util.HashMap.
 * 
 *                            The general contract of hashCode is:
 * 
 *                            Whenever it is invoked on the same object more
 *                            than once during an execution of a Java
 *                            application, hashCode method must consistently
 *                            return the same integer,
 * 
 *                            // ???????? Why is this, see following; provided
 *                            no information used in equals comparisons on the
 *                            object is modified.
 * 
 *                            This integer need not remain consistent from one
 *                            execution of an application to another execution
 *                            of the same application.
 * 
 *                            If two objects are equal according to the
 *                            equals(Object) method, then calling the hashCode
 *                            method on each of the two objects must produce the
 *                            same integer result.
 * 
 *                            It is NOT required that if two objects are unequal
 *                            according to the
 *                            java.lang.Object#equals(java.lang.Object)} method,
 *                            then calling the hashCode} method on each of the
 *                            two objects must produce distinct integer results.
 *                            However, the programmer should be aware that
 *                            producing distinct integer results for unequal
 *                            objects may improve the performance of hash
 *                            tables.
 * 
 *                            As much as is reasonably practical, the hashCode
 *                            method defined by class Object does return
 *                            distinct integers for distinct objects. (The
 *                            hashCode may or may not be implemented as some
 *                            function of an object's memory address at some
 *                            point in time.)
 */

// Invoking hashCode() on the same object must consistently return the same int,
// if equal comparison is not modified, the int must not be consistent restarting the app

// If 2 obejcts are equal, hashCode must be the same int.

public class ObjectSE {
    public static void main(String[] args) {
        // clone() copies a new object in heap. Calling  clone() directly however is not a very good idea. ??
        // Create bean instead:
        class ObjBean {
            Object obj;
            public ObjBean(Object anyObj){
                this.obj = anyObj;
            }
        }

        Object sourceObj = new Object();
        ObjBean obj = new ObjBean(sourceObj);
        ObjBean obj2 = new ObjBean(sourceObj);

        // obj is not equal to obj2 because 
        Boolean isObjEqualToObj2 = (obj.equals(obj2));

        int hash1 = obj.hashCode();
        int hash1_1 = obj.hashCode();
        Boolean hashCodeMethodInvokedOnSameObjectMustReturnSameInteger = (hash1 == hash1_1);


        // false. Equal objects cannot be created this way. Reference must be copied.
        Boolean equalObjectMustHaveSameHashCode = (obj.hashCode() == obj2.hashCode());

        obj2 = obj;
        //true. So what's compared here is the reference
        equalObjectMustHaveSameHashCode = (obj.hashCode() == obj2.hashCode());

        //true
        Boolean distinctObjShouldHaveDistinctHashCode = (obj.hashCode() == obj2.hashCode());

        /**
         * https://stackoverflow.com/questions/869033/how-do-i-copy-an-object-in-java
         * Chandra's description is correct. And so is your description of what happens;
         * I am saying that you have an incorrect understanding of the meaning of
         * "copies all the fields". The field is the reference, it is not the object
         * being referred to. "copying all fields" means "copying all those references".
         * It is good that you pointed out what exactly this means, for anyone else who
         * has the same mis-interpretation as you, of the statement "copying all
         * fields". :)
         */

        // For bette  performance, distinct objects should have different int returned from hashCode();

        // Possible to get memeory address of an object?

        // toString()
        /**
         * public String toString() 
         * { return getClass().getName() + "@" + Integer.toHexString(hashCode()); }
         * 
         * what does  getClass() do?
         */
        obj.toString();

        // Class<? extends ObjBean> java.lang.Object.getClass()
        /**
         * @HotSpotIntrinsicCandidate 
         * public final native Class<?> getClass();
         */
        obj.getClass();
        
        // Returns a string representation of the integer argument as an unsigned
        // integer in base 16. The HashCode can be sometimes negative. 
        // why base 16? 
        Integer.toHexString(obj.hashCode());

        // ???????? Why is this ??????????
        // provided no information used in equals comparisons on the object is modified. 
        // provided  means given the condition
        // information used in equal comparison on the object, if equal() is not changed:
        // return (this == obj);


    }
}
