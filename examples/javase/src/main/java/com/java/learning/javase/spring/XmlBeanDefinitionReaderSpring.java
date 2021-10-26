package com.java.learning.javase.spring;

/**
 * 
public class XmlBeanDefinitionReader
extends AbstractBeanDefinitionReader

Bean definition reader for XML bean definitions. Delegates the actual XML document reading to an implementation of the BeanDefinitionDocumentReader 
interface.

Typically applied to a DefaultListableBeanFactory or a GenericApplicationContext.

This class loads a DOM document and applies the BeanDefinitionDocumentReader to it. The document reader will register each bean definition with the 
given bean factory, talking to the latter's implementation of the BeanDefinitionRegistry interface.
 */

public class XmlBeanDefinitionReaderSpring {
    public static void main(String[] args) {
        /**
         * Create new XmlBeanDefinitionReader for the given bean factory.
         * 
         * @param registry the BeanFactory to load bean definitions into, in the form of
         *                 a BeanDefinitionRegistry
         * 
           public XmlBeanDefinitionReader(BeanDefinitionRegistry registry) { super(registry); }

           --------------------------------------------------------------------------------------------------------------------------------------------
         */

    }
}
