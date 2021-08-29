package com.java.learning.javase.spring;

import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.io.ClassPathResource;

// package: org.springframework.context.support

// public class GenericApplicationContext 
// extends AbstractApplicationContext 
// implements BeanDefinitionRegistry

/**
Generic ApplicationContext implementation that holds a single internal DefaultListableBeanFactory instance and does not assume a specific bean 
definition format. Implements the BeanDefinitionRegistry interface in order to allow for applying any bean definition readers to it.

Typical usage is to register a variety of bean definitions via the BeanDefinitionRegistry interface and then call AbstractApplicationContext.refresh() 
to initialize those beans with application context semantics (handling ApplicationContextAware, auto-detecting BeanFactoryPostProcessors, etc).

In contrast to other ApplicationContext implementations(Such as?) that create a new internal BeanFactory instance for each refresh, the internal BeanFactory of 
this context is available right from the start, to be able to register bean definitions on it. AbstractApplicationContext.refresh() may only be called 
once.

if (!this.refreshed.compareAndSet(false, true)) {
            throw new IllegalStateException(
                    "GenericApplicationContext does not support multiple refresh attempts: just call 'refresh' once");
        }

For the typical case of XML bean definitions, simply use ClassPathXmlApplicationContext or FileSystemXmlApplicationContext, which are easier to set 
up - but less flexible, since you can just use standard resource locations for XML bean definitions, rather than mixing arbitrary bean definition 
formats. The equivalent in a web environment is XmlWebApplicationContext.

For custom application context implementations that are supposed to read special bean definition formats in a refreshable manner, consider deriving
from the AbstractRefreshableApplicationContext base class.

*/


public class GenericApplicationContextSpring {
    public static void main(String[] args) {
        GenericApplicationContext ctx = new GenericApplicationContext();

        XmlBeanDefinitionReader xmlReader = new XmlBeanDefinitionReader(ctx);
        xmlReader.loadBeanDefinitions(new ClassPathResource("applicationContext.xml"));
        PropertiesBeanDefinitionReader propReader = new PropertiesBeanDefinitionReader(ctx);
        propReader.loadBeanDefinitions(new ClassPathResource("otherBeans.properties"));
        ctx.refresh();

        class MyBean{

        }

        MyBean myBean = (MyBean) ctx.getBean("myBean");

        /* 
        protected void	cancelRefresh(BeansException ex)
        Cancel this context's refresh attempt, resetting the active flag after an exception got thrown.

        protected void	closeBeanFactory()
        Not much to do: We hold a single internal BeanFactory that will never get released.
        
        AutowireCapableBeanFactory	getAutowireCapableBeanFactory()
        Return this context's internal bean factory as AutowireCapableBeanFactory, if already available.
        
        BeanDefinition	getBeanDefinition(String beanName)
        Return the BeanDefinition for the given bean name.
        
        ConfigurableListableBeanFactory	getBeanFactory()
        Return the single internal BeanFactory held by this context (as ConfigurableListableBeanFactory).
        
        ClassLoader	getClassLoader()
        Return the ClassLoader to load class path resources with.
        
        DefaultListableBeanFactory	getDefaultListableBeanFactory()
        Return the underlying bean factory of this context, available for registering bean definitions.
        
        Resource	getResource(String location)
        This implementation delegates to this context's ResourceLoader if set, falling back to the default superclass behavior else.
        
        Resource[]	getResources(String locationPattern)
        This implementation delegates to this context's ResourceLoader if it implements the ResourcePatternResolver interface, falling back to the default superclass behavior else.
        
        boolean	isAlias(String beanName)
        Determine whether the given name is defined as an alias (as opposed to the name of an actually registered component).
        
        boolean	isBeanNameInUse(String beanName)
        Determine whether the given bean name is already in use within this registry, i.e.
        
        protected void	refreshBeanFactory()
        Do nothing: We hold a single internal BeanFactory and rely on callers to register beans through our public methods (or the BeanFactory's).
        
        void	registerAlias(String beanName, String alias)
        Given a name, register an alias for it.
        
        <T> void	registerBean(Class<T> beanClass, BeanDefinitionCustomizer... customizers)
        Register a bean from the given bean class, optionally customizing its bean definition metadata (typically declared as a lambda expression).
        
        <T> void	registerBean(Class<T> beanClass, Object... constructorArgs)
        Register a bean from the given bean class, optionally providing explicit constructor arguments for consideration in the autowiring process.
        
        <T> void	registerBean(Class<T> beanClass, Supplier<T> supplier, BeanDefinitionCustomizer... customizers)
        Register a bean from the given bean class, using the given supplier for obtaining a new instance (typically declared as a lambda expression or method reference), optionally customizing its bean definition metadata (again typically declared as a lambda expression).
        
        <T> void	registerBean(String beanName, Class<T> beanClass, BeanDefinitionCustomizer... customizers)
        Register a bean from the given bean class, optionally customizing its bean definition metadata (typically declared as a lambda expression).
        
        <T> void	registerBean(String beanName, Class<T> beanClass, Object... constructorArgs)
        Register a bean from the given bean class, optionally providing explicit constructor arguments for consideration in the autowiring process.
        
        <T> void	registerBean(String beanName, Class<T> beanClass, Supplier<T> supplier, BeanDefinitionCustomizer... customizers)
        Register a bean from the given bean class, using the given supplier for obtaining a new instance (typically declared as a lambda expression or method reference), optionally customizing its bean definition metadata (again typically declared as a lambda expression).
        
        void	registerBeanDefinition(String beanName, BeanDefinition beanDefinition)
        Register a new bean definition with this registry.
        
        void	removeAlias(String alias)
        Remove the specified alias from this registry.
        
        void	removeBeanDefinition(String beanName)
        Remove the BeanDefinition for the given name.
        
        void	setAllowBeanDefinitionOverriding(boolean allowBeanDefinitionOverriding)
        Set whether it should be allowed to override bean definitions by registering a different definition with the same name, automatically replacing the former.
        
        void	setAllowCircularReferences(boolean allowCircularReferences)
        Set whether to allow circular references between beans - and automatically try to resolve them.
        
        void	setApplicationStartup(ApplicationStartup applicationStartup)
        Set the ApplicationStartup for this application context.
        
        void	setClassLoader(ClassLoader classLoader)
        Specify the ClassLoader to load class path resources with, or null for using the thread context class loader at the time of actual resource access.
        
        void	setParent(ApplicationContext parent)
        Set the parent of this application context, also setting the parent of the internal BeanFactory accordingly.
        
        void	setResourceLoader(ResourceLoader resourceLoader)
        Set a ResourceLoader to use for this context. */
    }

    
}
