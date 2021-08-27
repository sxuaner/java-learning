package com.java.learning.javase;

/**
 *  public interface InputStreamSource
 * 
    Simple interface for objects that are sources for an InputStream.
    This is the base interface for Spring's more extensive Resource interface.

    For single-use streams, InputStreamResource can be used for any given InputStream. Spring's ByteArrayResource or any file-based Resource 
    implementation can be used as a concrete instance, allowing one to read the underlying content stream multiple times. This makes this interface 
    useful as an abstract content source for mail attachments, for example.
 */
public class InputStreamSourceSpring {
    /**
     * InputStream getInputStream()
                    throws IOException

        Return an InputStream for the content of an underlying resource.
        It is expected that each call creates a fresh stream.

        This requirement is particularly important when you consider an API such as JavaMail, which needs to be able to read the stream multiple times when 
        creating mail attachments. For such a use case, it is required that each getInputStream() call returns a fresh stream.

        Returns:
        the input stream for the underlying resource (must not be null)
        Throws:
        FileNotFoundException - if the underlying resource doesn't exist
        IOException - if the content stream could not be opened
     */
    
}
