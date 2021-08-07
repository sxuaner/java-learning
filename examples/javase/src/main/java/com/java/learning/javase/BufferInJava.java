package com.java.learning.javase;

/**
 * what is a buffer in general? In computer science, a data buffer (or just
 * buffer) is a region of a physical memory storage used to temporarily store
 * data while it is being moved from one place to another. Typically, the data
 * is stored in a buffer as it is retrieved from an input device (such as a
 * microphone) or just before it is sent to an output device (such as speakers).
 * However, a buffer may be used when moving data between processes within a
 * computer. This is comparable to buffers in telecommunication. Buffers can be
 * implemented in a fixed memory location in hardware—or by using a virtual data
 * buffer in software, pointing at a location in the physical memory. In all
 * cases, the data stored in a data buffer are stored on a physical storage
 * medium. A majority of buffers are implemented in software, which typically
 * use the faster RAM to store temporary data, due to the much faster access
 * time compared with hard disk drives. Buffers are typically used when there is
 * a difference between the rate at which data is received and the rate at which
 * it can be processed, or in the case that these rates are variable, for
 * example in a printer spooler or in online video streaming. In the distributed
 * computing environment, data buffer is often implemented in the form of burst
 * buffer that provides distributed buffering service. A buffer often adjusts
 * timing by implementing a queue (or FIFO) algorithm in memory, simultaneously
 * writing data into the queue at one rate and reading it at another rate.
 * 
 * 
 * What is buffer in java?
 * 
 * A container for data of a specific primitive type.
 * 
 * A buffer is a linear, finite sequence of elements of a specific primitive
 * type. Aside from its content, the essential properties of a buffer are its
 * capacity, limit, and positio:
 * 
 * A buffer's capacity is the number of elements it contains. The capacity of a
 * buffer is never negative and never changes.
 * 
 * A buffer's limit is the index of the first element that should not be read or
 * written. For an example: if /n means newline and it should not be read, the
 * index of this element is the limit
 * 
 * A buffer's limit is never negative and is never greater than its capacity.
 * 
 * A buffer's position is the index of the next element to be read or written. A
 * buffer's position is never negative and is never greater than its limit.
 * 
 * There is one subclass of this class for each non-boolean primitive type.
 * 
 * ################################ Transferring data
 * 
 * Each subclass of this class defines two categories of get and put operations:
 * 
 * Relative operations read or write one or more elements starting at the
 * current position and then increment the position by the number of elements
 * transferred. If the requested transfer exceeds the limit then a relative get
 * operation throws a BufferUnderflowException and a relative put operation
 * throws a BufferOverflowException; in either case, no data is transferred.
 * 
 * Absolute operations take an explicit element index and do not affect the
 * position. Absolute get and put operations throw an IndexOutOfBoundsException
 * if the index argument exceeds the limit.
 * 
 * Data may also, of course, be transferred in to or out of a buffer by the I/O
 * operations of an appropriate channel, which are always relative to the
 * current position.
 * 
 * ################################ Marking and resetting
 * 
 * A buffer's mark is the index to which its position will be reset when the
 * reset method is invoked. The mark is not always defined, but when it is
 * defined it is never negative and is never greater than the position. If the
 * mark is defined then it is discarded when the position or the limit is
 * adjusted to a value smaller than the mark. If the mark is not defined then
 * invoking the reset method causes an InvalidMarkException to be thrown.
 * 
 * ############################# Invariants
 * 
 * The following invariant holds for the mark, position, limit, and capacity
 * values:
 * 
 * 0 <= mark <= position <= limit <= capacity A newly-created buffer always has
 * a position of zero and a mark that is undefined. The initial limit may be
 * zero, or it may be some other value that depends upon the type of the buffer
 * and the manner in which it is constructed. Each element of a newly-allocated
 * buffer is initialized to zero.
 * 
 * ################################ Additional operations
 * 
 * In addition to methods for accessing the position, limit, and capacity values
 * and for marking and resetting, this class also defines the following
 * operations upon buffers:
 * 
 * clear() makes a buffer ready for a new sequence of channel-read or relative
 * put operations: It sets the limit to the capacity and the position to zero.
 * 
 * flip() makes a buffer ready for a new sequence of channel-write or relative
 * get operations: It sets the limit to the current position and then sets the
 * position to zero.
 * 
 * rewind() makes a buffer ready for re-reading the data that it already
 * contains: It leaves the limit unchanged and sets the position to zero.
 * 
 * slice() creates a subsequence of a buffer: It leaves the limit and the
 * position unchanged.
 * 
 * duplicate() creates a shallow copy of a buffer: It leaves the limit and the
 * position unchanged.
 * 
 * ################################ Read-only buffers
 * 
 * Every buffer is readable, but not every buffer is writable. The mutation
 * methods of each buffer class are specified as optional operations that will
 * throw a ReadOnlyBufferException when invoked upon a read-only buffer. A
 * read-only buffer does not allow its content to be changed, but its mark,
 * position, and limit values are mutable. Whether or not a buffer is read-only
 * may be determined by invoking its isReadOnly method.
 * 
 * ################################ Thread safety
 * 
 * Buffers are not safe for use by multiple concurrent threads. If a buffer is
 * to be used by more than one thread then access to the buffer should be
 * controlled by appropriate synchronization.
 * 
 * ################################ Invocation chaining
 * 
 * Methods in this class that do not otherwise have a value to return are
 * specified to return the buffer upon which they are invoked. This allows
 * method invocations to be chained; for example, the sequence of statements
 * 
 * b.flip(); b.position(23); b.limit(42); can be replaced by the single, more
 * compact statement b.flip().position(23).limit(42);
 */

/**
 * public abstract class Buffer (implicitly extends Object)
 */

public interface BufferInJava {
    
}
