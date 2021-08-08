package com.java.learning.javase;


 /**
  * https://www.kdgregory.com/index.php?page=java.byteBuffer
  * 
  * Here is a great article explaining ByteBuffer benefits. Following are the key
  * points in the article:
  * 
  * First advantage of a ByteBuffer irrespective of whether it is direct or
  * indirect is efficient random access of structured binary data (e.g.,
  * low-level IO as stated in one of the answers). Prior to Java 1.4, to read
  * such data one could use a DataInputStream, but without random access.
  * Following are benefits specifically for direct ByteBuffer/MappedByteBuffer.
  * Note that direct buffers are created outside of heap:
  * 
  * Unaffected by gc cycles: Direct buffers won't be moved during garbage
  * collection cycles as they reside outside of heap. TerraCota's BigMemory
  * caching technology seems to rely heavily on this advantage. If they were on
  * heap, it would slow down gc pause times. Performance boost: In stream IO,
  * read calls would entail system calls, which require a context-switch between
  * user to kernel mode and vice versa, which would be costly especially if file
  * is being accessed constantly. However, with memory-mapping this
  * context-switching is reduced as data is more likely to be found in memory
  * (MappedByteBuffer). If data is available in memory, it is accessed directly
  * without invoking OS, i.e., no context-switching. Note that MappedByteBuffers
  * are very useful especially if the files are big and few groups of blocks are
  * accessed more frequently.
  * 
  * Page sharing: Memory mapped files can be shared between processes as they are
  * allocated in process's virtual memory space and can be shared across
  * processes.
  * 
  * In Android you can create shared buffer between C++ and Java (with
  * directAlloc method) and manipulate it in both sides.
  * 
  */
public class ByteBufferSE {
    
}
