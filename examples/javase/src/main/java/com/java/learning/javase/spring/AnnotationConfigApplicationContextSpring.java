package com.java.learning.javase.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

// org.springframework.context.annotation
/**
 * 
public class AnnotationConfigApplicationContext
extends GenericApplicationContext
implements AnnotationConfigRegistry

Standalone application context, accepting component classes as input — in particular @Configuration-annotated classes, but also plain @Component 
types and JSR-330 compliant classes using javax.inject annotations.

Allows for registering classes one by one using register(Class...) as well as for classpath scanning using scan(String...).

In case of multiple @Configuration classes, @Bean methods defined in later classes will override those defined in earlier classes. This can be 
leveraged to deliberately override certain bean definitions via an extra @Configuration class.

See @Configuration's javadoc for usage examples.
 */
@Configuration
public class AnnotationConfigApplicationContextSpring {
    public static void main(String[] args) {

        /**
            void register(Class<?>... componentClasses)
            Register one or more component classes to be processed.
            
            <T> void	registerBean(String beanName, Class<T> beanClass, Supplier<T> supplier, BeanDefinitionCustomizer... customizers)
            Register a bean from the given bean class, using the given supplier for obtaining a new instance (typically declared as a lambda 
            expression or method reference), optionally customizing its bean definition metadata (again typically declared as a lambda expression).
            
            void	scan(String... basePackages)
            Perform a scan within the specified base packages.
            
            void	setBeanNameGenerator(BeanNameGenerator beanNameGenerator)
            Provide a custom BeanNameGenerator for use with AnnotatedBeanDefinitionReader and/or ClassPathBeanDefinitionScanner, if any.
            
            void	setEnvironment(ConfigurableEnvironment environment)
            Propagate the given custom Environment to the underlying AnnotatedBeanDefinitionReader and ClassPathBeanDefinitionScanner.
            
            void	setScopeMetadataResolver(ScopeMetadataResolver scopeMetadataResolver)
            Set the ScopeMetadataResolver to use for registered component classes.
        
            
        } */
        

        // How to use without par?
        AnnotationConfigApplicationContextSpring acac = new AnnotationConfigApplicationContextSpring();
        /**
        public class AnnotationConfigApplicationContext extends GenericApplicationContext implements AnnotationConfigRegistry Standalone 
        application context, accepting component classes as input — in particular

        @Configuration
        annotated classes, but also plain @Component types and JSR-330 compliant classes using javax.inject annotations. Allows for registering 
        classes one by one using register(Class...) as well as for classpath scanning using scan(String...). In case of multiple @Configuration 
        classes, @Bean methods defined in later classes will override those defined in earlier classes. This can be leveraged to deliberately 
        override certain bean definitions via an extra @Configuration class. See @Configuration's javadoc for usage examples.
         */

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AnnotationConfigApplicationContextSpring.class);
        ctx.refresh();
        AnnotationConfigApplicationContextSpring myBean = ctx.getBean(AnnotationConfigApplicationContextSpring.class);
        // use myBean ...

    }
    
}
