package com.java.learning.javase;

import java.nio.CharBuffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * 
 * For regex constructs see Regex.notes
 * 
 * public final class Pattern
        extends Object
        simplements Serializable

A compiled representation of a regular expression.
A regular expression, specified as a string, must first be compiled into an instance of this class. The resulting pattern can then be used 
to create a Matcher object that can match arbitrary character sequences against the regular expression. All of the state involved in 
performing a match resides in the matcher, so many matchers can share the same pattern.

A typical invocation sequence is thus

Pattern p = Pattern.compile("a*b");
 Matcher m = p.matcher("aaaaab");
 boolean b = m.matches();

A matches method is defined by this class as a convenience for when a regular expression is used just once. This method compiles an expression and 
matches an input sequence against it in a single invocation. The statement

 boolean b = Pattern.matches("a*b", "aaaaab");

is equivalent to the three statements above, though for repeated matches it is less efficient since it does not allow the compiled pattern to be reused.
Instances of this class are immutable and are safe for use by multiple concurrent threads. Instances of the Matcher class are not safe for such use.

Group number

Capturing groups are numbered by counting their opening parentheses from left to right. In the expression ((A)(B(C))), for example, there are four such groups:

((A)(B(C)))
(A)
(B(C))
(C)
Group zero always stands for the entire expression.

Capturing groups are so named because, during a match, each subsequence of the input sequence that matches such a group is saved. The captured subsequence may be used later in the expression, via a back reference, and may also be retrieved from the matcher once the match operation is complete.

Group name

A capturing group can also be assigned a "name", a named-capturing group, and then be back-referenced later by the "name". Group names are composed of the following characters. The first character must be a letter.

The uppercase letters 'A' through 'Z' ('\u0041' through '\u005a'),
The lowercase letters 'a' through 'z' ('\u0061' through '\u007a'),
The digits '0' through '9' ('\u0030' through '\u0039'),
A named-capturing group is still numbered as described in Group number.

The captured input associated with a group is always the subsequence that the group most recently matched. If a group is evaluated a second time because of quantification then its previously-captured value, if any, will be retained if the second evaluation fails. Matching the string "aba" against the expression (a(b)?)+, for example, leaves group two set to "b". All captured input is discarded at the beginning of each match.

Groups

beginning with (? are either pure, non-capturing groups that do not capture text and do not count towards the group total, or named-capturing group.

Unicode support

This class is in conformance with Level 1 of Unicode Technical Standard #18: Unicode Regular Expression, plus RL2.1 Canonical Equivalents.

Unicode escape sequences such as \u2014 in Java source code are processed as described in section 3.3 of The Java™ Language Specification. Such escape sequences are also implemented directly by the regular-expression parser so that Unicode escapes can be used in expressions that are read from files or from the keyboard. Thus the strings "\u2014" and "\\u2014", while not equal, compile into the same pattern, which matches the character with hexadecimal value 0x2014.

A Unicode character can also be represented by using its Hex notation (hexadecimal code point value) directly as described in construct \x{...}, for example a supplementary character U+2011F can be specified as \x{2011F}, instead of two consecutive Unicode escape sequences of the surrogate pair \uD840\uDD1F.

Unicode character names are supported by the named character construct \N{...}, for example, \N{WHITE SMILING FACE} specifies character \u263A. The character names supported by this class are the valid Unicode character names matched by Character.codePointOf(name).

Unicode extended grapheme clusters are supported by the grapheme cluster matcher \X and the corresponding boundary matcher \b{g}.

Unicode scripts, blocks, categories and binary properties are written with the \p and \P constructs as in Perl. \p{prop} matches if the input has the property prop, while \P{prop} does not match if the input has that property.

Scripts, blocks, categories and binary properties can be used both inside and outside of a character class.

Scripts are specified either with the prefix Is, as in IsHiragana, or by using the script keyword (or its short form sc) as in script=Hiragana or sc=Hiragana.

The script names supported by Pattern are the valid script names accepted and defined by UnicodeScript.forName.

Blocks are specified with the prefix In, as in InMongolian, or by using the keyword block (or its short form blk) as in block=Mongolian or blk=Mongolian.

The block names supported by Pattern are the valid block names accepted and defined by UnicodeBlock.forName.

Categories may be specified with the optional prefix Is: Both \p{L} and \p{IsL} denote the category of Unicode letters. Same as scripts and blocks, categories can also be specified by using the keyword general_category (or its short form gc) as in general_category=Lu or gc=Lu.

The supported categories are those of The Unicode Standard in the version specified by the Character class. The category names are those defined in the Standard, both normative and informative.

Binary properties are specified with the prefix Is, as in IsAlphabetic. The supported binary properties by Pattern are

*/

public class PatternSE {
    
    public static void main(String[] args) {
        String str = "123";

        /** matches() method in String class: 
         * 
         *     public boolean matches(String regex) {
                   return Pattern.matches(regex, this);
                }
         */
        Boolean matched =  str.matches(".*[0-9]");

        // If a pattern is to be used multiple times, compiling it once and reusing
        // it will be more efficient than invoking Pattern.matches() each time.
        
        Boolean matched2 = Pattern.matches("[0-9]", CharBuffer.wrap(str.toCharArray()));
        Boolean matched3 = Pattern.matches(".[0-9]", CharBuffer.wrap(str.toCharArray()));
        // returns an instance of Pattern
        Pattern regex = Pattern.compile("123");
        Matcher mat = regex.matcher("aaaaa123456");
        //false
        Boolean matched4 = mat.matches();

        //true
        Boolean matched5 =  Pattern.compile(".*123.*").matcher("aaaaa123456").matches();

        // to reuse regex
        Matcher mat3 = regex.matcher("54321");
        //false
        Boolean matched6 = mat3.matches();

        /**
         * Instances of Pattern class are immutable and are safe for use by multiple
         * concurrent threads. Instances of the Matcher class are not safe for such use.
         * 
         * Why is an instance of Pattern class immutable? Because the immutable design pattern is applied
         * 
         * Firstly, What is a immutable class? 
         * Objects of a immutable class never change its state once constructed.
         * 
         * So, due to the fact that Pattern class has only one private constructor:
         * 
         * private Pattern(String p, int f) {...}
         * 
         * And an instance can only be obtained through the static compile()
        *  
           public static Pattern compile(String regex) {
                return new Pattern(regex, 0);
            }

            This makes sure that once an instance is created, its content can never be modified, because there is no mutator method(or setter method)
            that changes the pattern variable. 
         */


    }
}
