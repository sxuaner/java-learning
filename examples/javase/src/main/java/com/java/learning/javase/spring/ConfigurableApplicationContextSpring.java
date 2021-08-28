package com.java.learning.javase.spring;


/**
public interface ConfigurableApplicationContext
    extends ApplicationContext, Lifecycle, Closeable

SPI interface to be implemented by most if not all application contexts. Provides facilities to configure an application context in addition to the 
application context client methods in the ApplicationContext interface.

SPI means:
Service Provider Interface (SPI) is an API intended to be implemented or extended by a third party. It can be used to enable framework extension 
and replaceable components.

What are the application context client metho
ds?

Configuration and lifecycle methods are encapsulated here to avoid making them obvious to ApplicationContext client code. The present methods should 
only be used by startup and shutdown code.

*/
public class ConfigurableApplicationContextSpring {
    public static void main(String[] args) {
        
    }
    
}
