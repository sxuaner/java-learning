package com.java.learning.javase.spring;


/**
    public interface ResourceLoader 

    Strategy interface for loading resources (e.g., class path or file system resources). An ApplicationContext is required to provide this 
    functionality plus extended ResourcePatternResolver support. 
    
    DefaultResourceLoader is a standalone implementation that is usable outside an ApplicationContext and is also used by ResourceEditor.
    
    Bean properties of type Resource and Resource[] can be populated from Strings when running in an ApplicationContext, using the particular 
    context's resource loading strategy.
*/

public class IResourceLoaderSpring {

    public static void main(String[] args) {
        /**
        
        static final String CLASSPATH_URL_PREFIX
        
        Pseudo URL prefix for loading from the class path: "classpath:".
        -------------------------------------------
        Resource getResource(String location)
        
        Return a Resource handle for the specified resource location.

        In computer programming, a handle is an abstract reference to a resource that is used when application software references blocks of memory 
        or objects that are managed by another system like a database or an operating system.

        The handle should always be a reusable resource descriptor, allowing for multiple InputStreamSource.getInputStream() calls.
            Must support fully qualified URLs, e.g. "file:C:/test.dat".
            Must support classpath pseudo-URLs, e.g. "classpath:test.dat".
            Should support relative file paths, e.g. "WEB-INF/test.dat". (This will be implementation-specific, typically provided by an 
            ApplicationContext implementation.)

        Note that a Resource handle does not imply an existing resource; you need to invoke Resource.exists() to check for existence.
        ------------------------------------------- 
        @Nullable
        ClassLoader getClassLoader()
        
        Expose the ClassLoader used by this ResourceLoader.
        
        Clients which need to access the ClassLoader directly can do so in a uniform manner with the ResourceLoader, rather than relying on 
        the thread context ClassLoader.
        
        Returns: the ClassLoader (only null if even the system ClassLoader isn't accessible)
         */
    }
    
}
