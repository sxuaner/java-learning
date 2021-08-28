package com.java.learning.javase.spring;
/**
 public class DefaultResourceLoader
 extends Object 
 implements ResourceLoader

Default implementation of the ResourceLoader interface. Used by ResourceEditor, and serves as base class for AbstractApplicationContext. Can also 
be used standalone. Will return a UrlResource if the location value is a URL, and a ClassPathResource if it is a non-URL path or a "classpath:" 
pseudo-URL.

org.springframework.core.io
 */

public class DefaultResourceLoaderSpring {
    public static void main(String[] args) {
        /**
        protected static class 	DefaultResourceLoader.ClassPathContextResource
        
        ClassPathResource that explicitly expresses a context-relative path through implementing the ContextResource interface.
        ------------------------------
        void	addProtocolResolver(ProtocolResolver resolver)
        Register the given resolver with this resource loader, allowing for additional protocols to be handled.

        void	clearResourceCaches()
        Clear all resource caches in this resource loader.
        
        ClassLoader	getClassLoader()
        Return the ClassLoader to load class path resources with.
        
        Collection<ProtocolResolver>	getProtocolResolvers()
        Return the collection of currently registered protocol resolvers, allowing for introspection as well as modification.
        
        Resource	getResource(String location)
        Return a Resource handle for the specified resource location.
        
        protected Resource	getResourceByPath(String path)
        Return a Resource handle for the resource at the given path.
        
        <T> Map<Resource,T>	getResourceCache(Class<T> valueType)
        Obtain a cache for the given value type, keyed by Resource.
        
        void	setClassLoader(ClassLoader classLoader)
        Specify the ClassLoader to load class path resources with, or null for using the thread context class loader at the time of actual 
        resource access.
         */
    }
    
}
