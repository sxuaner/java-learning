package com.java.learning.javase;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
public class InputStreamReader
        extends Reader

An InputStreamReader is a bridge from byte streams to character streams: It reads bytes and decodes them into characters using a specified charset. 
The charset that it uses may be specified by name or may be given explicitly, or the platform's default charset may be accepted.

Each invocation of one of an InputStreamReader's read() methods may cause one or more bytes to be read from the underlying byte-input stream. 
To enable the efficient conversion of bytes to characters, more bytes may be read ahead from the underlying stream than are necessary to satisfy the current read operation.

For top efficiency, consider wrapping an InputStreamReader within a BufferedReader. For example:

BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
   
*/

public class InputStreamReaderSE {
    public static void main(String[] args) {
        
      InputStreamReader isr;
      try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))){
        while(true){
         System.out.println(in.readLine()); 
        }
      }catch(IOException ioe){

      }

    }
    
}