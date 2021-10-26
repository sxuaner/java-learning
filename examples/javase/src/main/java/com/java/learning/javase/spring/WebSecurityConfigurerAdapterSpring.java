package com.java.learning.javase.spring;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**

@Order(100)
public abstract class WebSecurityConfigurerAdapter
extends java.lang.Object
implements WebSecurityConfigurer<WebSecurity>

Provides a convenient base class for creating a WebSecurityConfigurer instance. The implementation allows customization by overriding methods.
Will automatically apply the result of looking up AbstractHttpConfigurer from SpringFactoriesLoader to allow developers to extend the defaults. 
To do this, you must create a class that extends AbstractHttpConfigurer and then create a file in the classpath at "META-INF/spring.factories" that 
looks something like:

org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer = sample.MyClassThatExtendsAbstractHttpConfigurer
 
If you have multiple classes that should be added you can use "," to separate the values. For example:
org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer = sample.MyClassThatExtendsAbstractHttpConfigurer, 
sample.OtherThatExtendsAbstractHttpConfigurer
 

 * 
 */
public class WebSecurityConfigurerAdapterSpring {
    
}
