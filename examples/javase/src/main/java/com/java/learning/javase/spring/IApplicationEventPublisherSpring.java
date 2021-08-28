package com.java.learning.javase.spring;

/**
@FunctionalInterface
public interface ApplicationEventPublisher
    
Interface that encapsulates event publication functionality. Serves as a super-interface for ApplicationContext.
 */
public class IApplicationEventPublisherSpring {
    
    public static void main(String[] args) {
    /**
        default is package-private. So publishEvent(ApplicationEvent event) can only be used in this package org.springframework.context.
        Can it be used in sub-packages?


        default void publishEvent(ApplicationEvent event)
        Notify all matching listeners registered with this application of an application event. Events may be framework events (such as 
        ContextRefreshedEvent) or application-specific events.
        
        Such an event publication step is effectively a hand-off to the multicaster and does not imply synchronous/asynchronous execution or even 
        immediate execution at all. Event listeners are encouraged to be as efficient as possible, individually using asynchronous execution for 
        longer-running and potentially blocking operations.

        Parameters:
        event - the event to publish
        ---------------------------------------------
        void publishEvent(Object event)
        Notify all matching listeners registered with this application of an event.

        Notify all matching listeners registered with this application of an event.
        If the specified event is not an ApplicationEvent, it is wrapped in a PayloadApplicationEvent.

        Such an event publication step is effectively a hand-off to the multicaster and does not imply synchronous/asynchronous execution or even immediate execution at all. Event listeners are encouraged to be as efficient as possible, individually using asynchronous execution for longer-running and potentially blocking operations.

        Parameters:
        event - the event to publish

        */


        
    }
}
