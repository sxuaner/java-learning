package com.java.learning.javase.spring;

/**
 * 
public interface WebApplicationContext
extends ApplicationContext{}

Interface to provide configuration for a web application. This is read-only while the application is running, but may be reloaded if the 
implementation supports this. 

This interface adds a getServletContext() method to the generic ApplicationContext interface, and defines a well-known application attribute name 
that the root context must be bound to in the bootstrap process.

Like generic application contexts, web application contexts are hierarchical. There is a single root context per application, while each servlet 
in the application (including a dispatcher servlet in the MVC framework) has its own child context.

In addition to standard application context lifecycle capabilities, WebApplicationContext implementations need to detect ServletContextAware beans 
and invoke the setServletContext method accordingly.
*/

public class IWebApplicationContextSpring {
    
}
