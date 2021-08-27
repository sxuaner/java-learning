package com.java.learning.javase.spring;

public class IApplicationContextSpring {
    /**
     * public interface ApplicationContext
        extends EnvironmentCapable, ListableBeanFactory, HierarchicalBeanFactory, MessageSource, ApplicationEventPublisher, ResourcePatternResolver

        Central interface to provide configuration for an application. This is read-only while the application is running, but may be reloaded if the 
        implementation supports this. An ApplicationContext provides:

        Bean factory methods for accessing application components. Inherited from ListableBeanFactory.
        1. The ability to load file resources in a generic fashion. Inherited from the ResourceLoader interface.
        2. The ability to publish events to registered listeners. Inherited from the ApplicationEventPublisher interface.
        3. The ability to resolve messages, supporting internationalization. Inherited from the MessageSource interface.
        4. Inheritance from a parent context. Definitions in a descendant context will always take priority. This means, for example, that a single 
           parent context can be used by an entire web application, while each servlet has its own child context that is independent of that of any 
           other servlet.
        5. In addition to standard BeanFactory lifecycle capabilities, ApplicationContext implementations detect and invoke ApplicationContextAware 
        beans as well as ResourceLoaderAware, ApplicationEventPublisherAware and MessageSourceAware beans.
     * @param args
     */

    public static void main(String[] args) {
       /**
        * 
        * 
        * String getApplicationName() Return a name for the deployed application that
        * this context belongs to.
        * 
        * 
        */

        
        
        /**
            
            AutowireCapableBeanFactory	getAutowireCapableBeanFactory()
            Expose AutowireCapableBeanFactory functionality for this context.
            
            String	getDisplayName()
            Return a friendly name for this context.
            
            String	getId()
            Return the unique id of this application context.
            
            ApplicationContext	getParent()
            Return the parent context, or null if there is no parent and this is the root of the context hierarchy.
            
            long	getStartupDate()
            Return the timestamp when this context was first loaded.
         */
    }
    
}
