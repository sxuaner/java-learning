package com.java.learning.javase;

public class BitWiseOperators {
    public static void main(String[] args) {
        /**
         * | => cat BitWiseOperators.j 
         
.version 55 0 
.class public super com/java/learning/javase/BitWiseOperators 
.super java/lang/Object 

.method public <init> : ()V 
    .code stack 1 locals 1 
L0:     aload_0 
L1:     invokespecial Method java/lang/Object <init> ()V 
L4:     return 
L5:     
        .linenumbertable 
            L0 3 
        .end linenumbertable 
        .localvariabletable 
            0 is this Lcom/java/learning/javase/BitWiseOperators; from L0 to L5 
        .end localvariabletable 
    .end code 
.end method 

aload_<n>
The <n> must be an index into the local variable array of the current frame (§2.6). The local variable at <n> must 
contain a reference. The objectref in the local variable at <n> is pushed onto the operand stack.

.method public static main : ([Ljava/lang/String;)V 
    .code stack 2 locals 4 
L0:     iconst_5 (Or when a = 127, bipush 127)
L1:     istore_1 
L2:     iconst_1 
L3:     istore_2 
L4:     iload_1 
L5:     iload_2 
L6:     iushr 
L7:     dup 
L8:     istore_1 
L9:     istore_3 
L10:    return 
L11:    
        .linenumbertable 
            L0 7 
            L2 8 
            L4 9 
            L10 11 
        .end linenumbertable 
        .localvariabletable 
            0 is args [Ljava/lang/String; from L0 to L11 
            1 is a I from L2 to L11 
            2 is b I from L4 to L11 
            3 is result I from L10 to L11 
        .end localvariabletable 
    .end code 
.end method 
.sourcefile 'BitWiseOperators.java' 
.end class 

iconst_<i>
iconst_m1 = 2 (0x2)
iconst_0 = 3 (0x3)
iconst_1 = 4 (0x4)
iconst_2 = 5 (0x5)
iconst_3 = 6 (0x6)
iconst_4 = 7 (0x7)
iconst_5 = 8 (0x8)

iconst_5
Push the int constant <i> (-1, 0, 1, 2, 3, 4 or 5) onto the operand stack.

istore_<n>
The <n> must be an index into the local variable array of the current frame (§2.6). The value on the top of the 
operand stack must be of type int. It is popped from the operand stack, and the value of the local variable at <n> 
is set to value.

iushr
Both value1 and value2 must be of type int. The values are popped from the operand stack. An int result is calculated 
by shifting value1 right by s bit positions, with zero extension, where s is the value of the low 5 bits of value2. 
The result is pushed onto the operand stack.

dup 
Duplicate the top value on the operand stack and push the duplicated value onto the operand stack.
         */




        /**
         * | => javap -c BitWiseOperators.class 
         * 
Compiled from "BitWiseOperators.java"

public class com.java.learning.javase.BitWiseOperators {
  public com.java.learning.javase.BitWiseOperators();
    Code:
       0: aload_0
       1: invokespecial #8                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: bipush        127
       2: istore_1
       3: iconst_1
       4: istore_2
       5: iload_1
       6: iload_2
       7: iushr
       8: dup
       9: istore_1
      10: istore_3
      11: return
}

         */

        // >>>= ? meaning
        int a = 127;
        int b = 1;

        // The unsigned right shift operator ">>>" shifts a zero into the leftmost position, while the leftmost 
        // position after ">>" depends on sign extension.
        int result = a>>>=b;

        /**
         * .method public static main : ([Ljava/lang/String;)V 
    .code stack 2 locals 6 
L0:     bipush 127 
L2:     istore_1 
L3:     iconst_1 
L4:     istore_2 
L5:     iload_1 
L6:     iload_2 
L7:     iushr 
L8:     dup 
L9:     istore_1 
L10:    istore_3 


L11:    bipush 127 
L13:    istore 4 
L15:    iconst_2 
L16:    istore 5 
L18:    iload 4 
L20:    iload_2 
L21:    iushr 
L22:    istore 4 
L24:    return 
L25:    
        .linenumbertable 
            L0 122 
            L3 123 
            L5 124 
            L11 126 
            L15 127 
            L18 128 
            L24 132 
        .end linenumbertable 
        .localvariabletable 
            0 is args [Ljava/lang/String; from L0 to L25 
            1 is a I from L3 to L25 
            2 is b I from L5 to L25 
            3 is result I from L11 to L25 
            4 is c I from L15 to L25 
            5 is d I from L18 to L25 
        .end localvariabletable 
    .end code 

         */
        // 4 is c and 5 is d
        int c = 127;
        int d = 2;
        // Illegal: c>>b; Syntax error on token ">>", invalid AssignmentOperator
        c>>>=b;


        int invert =     256 >>> 3;
        // invert is 32
        // 256 = 1 * 2^8= 1 0000 0000
        
        // 256 >>3 
        // 0010 0000 
        // 1 2 4 8 16 32 64 128 256
        // 1 2 3 4  5  6  7  8   9
 


        
    }
    
}
