package com.java.learning.javase;

/**
 * 
public class BufferedReader
        extends Reader

Reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters, arrays, and lines.
The buffer size may be specified, or the default size may be used. The default is large enough for most purposes.

In general, each read request made of a Reader causes a corresponding read request to be made of the underlying character or byte stream. 
It is therefore advisable to wrap a BufferedReader around any Reader whose read() operations may be costly, such as FileReaders and InputStreamReaders. For example,

BufferedReader in = new BufferedReader(new FileReader("foo.in"));
 
will buffer the input from the specified file. 

Without buffering, each invocation of read() or readLine() could cause bytes to be read from the file, converted into characters, 
and then returned, which can be very inefficient. 

Programs that use DataInputStreams for textual input can be localized by replacing each DataInputStream with an appropriate BufferedReader.
 */
public class BufferredReaderSE {
    
    public static void main(String[] args) {
        /**
         *  Stream<String>	lines()	
            Returns a Stream, the elements of which are lines read from this BufferedReader.
            
            ???
            void	mark​(int readAheadLimit)	
            Marks the present position in the stream.
            
            boolean	markSupported()	
            Tells whether this stream supports the mark() operation, which it does.
            
            int	read()	
            Reads a single character.
            
            int	read​(char[] cbuf, int off, int len)	
            Reads characters into a portion of an array.
            
            String	readLine()	
            Reads a line of text.
            
            boolean	ready()	
            Tells whether this stream is ready to be read.
            
            void	reset()	
            Resets the stream to the most recent mark.

            long	skip​(long n)	
            Skips characters.
         */
        
    }
}
