package com.java.learning.javase;

/**
 * Direct vs. non-direct buffers
 * 
 * A byte buffer is either direct or non-direct. Direct buffers are directly acted upon.
 * 
 * Given a direct byte buffer, the
 * Java virtual machine will make a best effort to perform native I/O operations
 * directly upon it. That is, it will attempt to avoid copying the buffer's
 * content to (or from) an intermediate buffer before (or after) each invocation
 * of one of the underlying operating system's native I/O operations.
 * 
 * A direct byte buffer may be created by invoking the allocateDirect factory
 * method of this class. The buffers returned by this method typically have
 * somewhat higher allocation and deallocation costs than non-direct buffers.

 * The contents of direct buffers may reside outside of the normal
 * garbage-collected heap, and so their impact upon the memory footprint of an
 * application might not be obvious. It is therefore recommended that direct
 * buffers be allocated primarily for large, long-lived buffers that are subject
 * to the underlying system's native I/O operations. 
 * 
 * In general it is best to allocate direct buffers only when they yield a measurable gain in program performance.
 * 
 * A direct byte buffer may also be created by mapping a region of a file
 * directly into memory. An implementation of the Java platform may optionally
 * support the creation of direct byte buffers from native code via JNI. If an
 * instance of one of these kinds of buffers refers to an inaccessible region of
 * memory then an attempt to access that region will not change the buffer's
 * content and will cause an unspecified exception to be thrown either at the
 * time of the access or at some later time.
 * 
 * Whether a byte buffer is direct or non-direct may be determined by invoking
 * its isDirect method. This method is provided so that explicit buffer
 * management can be done in performance-critical code.
 * 
 */


 /**
  * Java IO using stream oriented APIs is performed using a buffer as temporary
  * storage of data within user space. Data read from disk by DMA is first copied
  * to buffers in kernel space, which is then transfer to buffer in user space.
  * Hence there is overhead. Avoiding it can achieve considerable gain in
  * performance.
  * 
  * We could skip this temporary buffer in user space, if there was a way
  * directly to access the buffer in kernel space. Java NIO provides a way to do
  * so.
  * 
  * ByteBuffer is among several buffers provided by Java NIO. Its just a
  * container or holding tank to read data from or write data to. Above behavior
  * is achieved by allocating a direct buffer using allocateDirect() API on
  * Buffer.
  */
public class DirectBufferSE {
    
}
