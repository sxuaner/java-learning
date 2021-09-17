package com.java.learning.javase;
import java.io.Reader;
/**
public abstract class Reader 
      extends Object 
      implements Readable, Closeable

Abstract class for reading character streams. 

The only methods that a subclass must implement are read(char[], int, int) and close(). 
Most subclasses, however, will override some of the methods defined here in order to provide higher efficiency, additional functionality, or both.


Direct Known Subclasses:
BufferedReader, CharArrayReader, FilterReader, InputStreamReader, PipedReader, StringReader, URLReader
 */
public class AReaderSE{


    public static void main(String[] args) 
    {
    Reader r = Reader.nullReader();
        
        
    }
}