package com.java.learning.javase.spring;

/**
 
@FunctionalInterface
public interface ServletContextInitializer

Interface used to configure a Servlet 3.0+ context programmatically. Unlike WebApplicationInitializer, classes that implement this interface 
(and do not implement WebApplicationInitializer) will not be detected by SpringServletContainerInitializer and hence will not be automatically 
bootstrapped by the Servlet container.

This interface is designed to act in a similar way to ServletContainerInitializer, but have a lifecycle that's managed by Spring and not the Servlet 
container.

For configuration examples see WebApplicationInitializer.
 */
public class IServletContextInitializerSpring {
    
}
