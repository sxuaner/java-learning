package com.java.learning.javase;

import java.io.InputStream;

/**
public abstract class InputStream
        extends Object
        implements Closeable
This abstract class is the superclass of all classes representing an input stream of bytes.
Applications that need to define a subclass of InputStream must always provide a method that returns the next byte of input.

All known Subclasses:
AudioInputStream, ByteArrayInputStream, FileInputStream, FilterInputStream, ObjectInputStream, PipedInputStream, SequenceInputStream, StringBufferInputStream

System.in, System.out, System.err are instancees of InputStream

     */
public class InputStreamSE {
    
    public static void main(String[] args) {

        /**
        int	available()	
        Returns an estimate of the number of bytes that can be read (or skipped over) from this input stream without blocking, 
        which may be 0, or 0 when end of stream is detected.

        void	close()	
        Closes this input stream and releases any system resources associated with the stream.

        void	mark​(int readlimit)	
        Marks the current position in this input stream.

        boolean	markSupported()	
        Tests if this input stream supports the mark and reset methods.

        static InputStream	nullInputStream()	
        Returns a new InputStream that reads no bytes.

        abstract int	read()	
        Reads the next byte of data from the input stream.

        int	read​(byte[] b)	
        Reads some number of bytes from the input stream and stores them into the buffer array b.

        int	read​(byte[] b, int off, int len)	
        Reads up to len bytes of data from the input stream into an array of bytes. off is the starting position

        byte[]	readAllBytes()	
        Reads all remaining bytes from the input stream.

        int	readNBytes​(byte[] b, int off, int len)	
        Reads the requested number of bytes from the input stream into the given byte array.

        byte[]	readNBytes​(int len)	
        Reads up to a specified number of bytes from the input stream.

        void	reset()	
        Repositions this stream to the position at the time the mark method was last called on this input stream.

        long	skip​(long n)	
        Skips over and discards n bytes of data from this input stream.

        long	transferTo​(OutputStream out)	
        Reads all bytes from this input stream and writes the bytes to the given output stream in the order that they are read.
        */
        
    }
    
}
