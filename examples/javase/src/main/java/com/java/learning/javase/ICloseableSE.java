package com.java.learning.javase;

/**
 * public interface Closeable extends AutoCloseable
   A Closeable is a source or destination of data that can be closed. The close method is invoked to release resources that the object is holding
   (such as open files).
 */
public class ICloseableSE {
    public static void main(String[] args) {
        /**
         *  void close() throws IOException
            Closes this stream and releases any system resources associated with it. If the stream is already closed then invoking this method has 
            no effect.
            As noted in AutoCloseable.close(), cases where the close may fail require careful attention. It is strongly advised to relinquish the
            underlying resources and to internally mark the Closeable as closed, prior to throwing the IOException.

            relinquish: to give up something such as a responsibility or claim:
            e.g.: He has relinquished his claim to the throne.

            Specified by:
            close in interface AutoCloseable
            
            Throws:
            IOException - if an I/O error occurs
         */
    }
    
}
