package com.java.learning.javase.utils;

/**
 * 
@Retention(value=RUNTIME)
 @Target(value=TYPE)
 @Documented
public @interface ImportResource

Indicates one or more resources containing bean definitions to import.

Like @Import, this annotation provides functionality similar to the <import/> element in Spring XML. It is typically used when designing 
@Configuration classes to be bootstrapped by an AnnotationConfigApplicationContext, but where some XML functionality such as namespaces is still 
necessary.

By default, arguments to the value() attribute will be processed using a GroovyBeanDefinitionReader if ending in ".groovy"; otherwise, an 
XmlBeanDefinitionReader will be used to parse Spring <beans/> XML files. Optionally, the reader() attribute may be declared, allowing the user to 
choose a custom BeanDefinitionReader implementation.
 */
public class IImportResourceSpring {
    
}
