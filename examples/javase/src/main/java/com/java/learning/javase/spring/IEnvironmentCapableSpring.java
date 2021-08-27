package com.java.learning.javase.spring;

public class IEnvironmentCapableSpring {
    /**
     * public interface EnvironmentCapable
     * 
        Interface indicating a component that contains and exposes an Environment reference.

        All Spring application contexts are EnvironmentCapable, and the interface is used primarily for performing instanceof checks in framework 
        methods that accept BeanFactory instances that may or may not actually be ApplicationContext instances in order to interact with the 
        environment if indeed it is available.

        As mentioned, ApplicationContext extends EnvironmentCapable, and thus exposes a getEnvironment() method; however, ConfigurableApplicationContext
        redefines getEnvironment() and narrows the signature to return a ConfigurableEnvironment. The effect is that an Environment object is 'read-only'
        until it is being accessed from a ConfigurableApplicationContext, at which point it too may be configured.
     * 
     */
    public static void main(String[] args) {
        
    }
}
