package com.java.learning.javase;

/**
public class FileInputStream
    extends InputStream

A FileInputStream obtains input bytes from a file in a file system. What files are available depends on the host environment.
FileInputStream is meant for reading streams of raw bytes such as image data. 

For reading streams of characters, consider using FileReader.

API Note:
To release resources used by this stream close() should be called directly or by try-with-resources. Subclasses are responsible for 
the cleanup of resources acquired by the subclass. Subclasses that override finalize() in order to perform cleanup should be modified 
to use alternative cleanup mechanisms such as Cleaner and remove the overriding finalize method.

Implementation Requirements:
If this FileInputStream has been subclassed and the close() method has been overridden, the close() method will be called when the 
FileInputStream is unreachable. Otherwise, it is implementation specific how the resource cleanup described in close() is performed.
 */
public class FileInputStreamSE {
    public static void main(String[] args) {
        
    }
    
}
