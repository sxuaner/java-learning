package com.java.learning.javase.spring;

/**
@Target(value=TYPE)
@Retention(value=RUNTIME)
@Documented
public @interface Import

Indicates one or more component classes to import — typically @Configuration classes.
Provides functionality equivalent to the <import/> element in Spring XML. Allows for importing @Configuration classes, ImportSelector and 
ImportBeanDefinitionRegistrar implementations, as well as regular component classes (as of 4.2; analogous to 
AnnotationConfigApplicationContext.register(java.lang.Class<?>...)).

@Bean definitions declared in imported @Configuration classes should be accessed by using @Autowired injection. Either the bean itself can be autowired, or the configuration class instance declaring the bean can be autowired. The latter approach allows for explicit, IDE-friendly navigation between @Configuration class methods.

May be declared at the class level or as a meta-annotation.

If XML or other non-@Configuration bean definition resources need to be imported, use the @ImportResource annotation instead.
 */
public class IImportSpring {
    
}
