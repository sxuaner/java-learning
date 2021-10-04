package com.java.learning.javase.spring;

/**
 * 
@Retention(value=RUNTIME)
@Target(value=TYPE)
@Documented
@Repeatable(value=ComponentScans.class)
public @interface ComponentScan

Configures component scanning directives for use with @Configuration classes. 

Provides support parallel with Spring XML's <context:component-scan> element.

Either basePackageClasses() or basePackages() (or its alias value()) may be specified to define specific packages to scan. If specific packages 
are not defined, scanning will occur from the package of the class that declares this annotation.

Note that the <context:component-scan> element has an annotation-config attribute; however, this annotation does not. This is because in almost 
all cases when using @ComponentScan, default annotation config processing (e.g. processing @Autowired and friends) is assumed. Furthermore, when using
AnnotationConfigApplicationContext, annotation config processors are always registered, meaning that any attempt to disable them at the @ComponentScan 
level would be ignored.

See @Configuration's Javadoc for usage examples.
 */

public class IComponentScanSpring {
    
}
