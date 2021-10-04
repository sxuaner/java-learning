package com.java.learning.javase.spring;

/*
org.springframework.boot.autoconfigure.SpringBootApplication

Annotation Type SpringBootApplication

@Target(value=TYPE)
@Retention(value=RUNTIME)
@Documented
@Inherited
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(excludeFilters={@ComponentScan.Filter(type=CUSTOM,classes=TypeExcludeFilter.class),})
public @interface SpringBootApplication

Indicates a configuration class that declares one or more @Bean methods and also triggers auto-configuration and component scanning. This is a 
convenience annotation that is equivalent to declaring @Configuration, @EnableAutoConfiguration and @ComponentScan.

?? component scan
*/


public class ISpringBootApplicationSpring {
    
/**
    Class<?>[]	exclude
    Exclude specific auto-configuration classes such that they will never be applied.
    
    String[]	excludeName
    Exclude specific auto-configuration class names such that they will never be applied.
    
    Class<? extends BeanNameGenerator>	nameGenerator
    The BeanNameGenerator class to be used for naming detected components within the Spring container.
    
    boolean	proxyBeanMethods
    Specify whether @Bean methods should get proxied in order to enforce bean lifecycle behavior, e.g.
    
    Class<?>[]	scanBasePackageClasses
    Type-safe alternative to scanBasePackages() for specifying the packages to scan for annotated components.
    
    String[]	scanBasePackages
    Base packages to scan for annotated components.

    @AliasFor(annotation=org.springframework.context.annotation.ComponentScan.class,
          attribute="basePackages")
    public abstract String[] scanBasePackages
    Base packages to scan for annotated components. Use scanBasePackageClasses() for a type-safe alternative to String-based package names.
    Note: this setting is an alias for @ComponentScan only. It has no effect on @Entity scanning or Spring Data Repository scanning. For those you 
    should add @EntityScan and @Enable...Repositories annotations.
 */
}
