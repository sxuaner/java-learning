package com.java.learning.javase.spring;
// org.springframework.context.support

/**
 
    public abstract class AbstractApplicationContext
    extends DefaultResourceLoader
    implements ConfigurableApplicationContext

Abstract implementation of the ApplicationContext interface. Doesn't mandate(allow) the type of storage used for configuration; simply implements common 
context functionality. Uses the Template Method design pattern, requiring concrete subclasses to implement abstract methods.

In contrast to a plain BeanFactory, an ApplicationContext is supposed to detect special beans defined in its internal bean factory: Therefore, this 
class automatically registers BeanFactoryPostProcessors, BeanPostProcessors, and ApplicationListeners which are defined as beans in the context.

A MessageSource may also be supplied as a bean in the context, with the name "messageSource"; otherwise, message resolution is delegated to the 
parent context. Furthermore, a multicaster for application events can be supplied as an "applicationEventMulticaster" bean of type 
ApplicationEventMulticaster in the context; otherwise, a default multicaster of type SimpleApplicationEventMulticaster will be used.

Implements resource loading by extending DefaultResourceLoader. Consequently treats non-URL resource paths as class path resources (supporting full
class path resource names that include the package path, e.g. "mypackage/myresource.dat"), unless the 
DefaultResourceLoader.getResourceByPath(java.lang.String) method is overridden in a subclass.

 */
public class IAbstractApplicationContextSpring {
    public static void main(String[] args) {

    }
    
}
