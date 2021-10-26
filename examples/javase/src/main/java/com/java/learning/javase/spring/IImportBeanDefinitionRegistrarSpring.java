package com.java.learning.javase.spring;
/**

public interface ImportBeanDefinitionRegistrar

Interface to be implemented by types that register additional bean definitions when processing @Configuration classes. Useful when operating at the 
bean definition level (as opposed to @Bean method/instance level) is desired or necessary.

Along with @Configuration and ImportSelector, classes of this type may be provided to the @Import annotation (or may also be returned from an 
ImportSelector).

An ImportBeanDefinitionRegistrar may implement any of the following Aware interfaces, and their respective methods will be called prior to 
registerBeanDefinitions(org.springframework.core.type.AnnotationMetadata, org.springframework.beans.factory.support.BeanDefinitionRegistry, 
org.springframework.beans.factory.support.BeanNameGenerator):

EnvironmentAware
BeanFactoryAware
BeanClassLoaderAware
ResourceLoaderAware
Alternatively, the class may provide a single constructor with one or more of the following supported parameter types:

Environment
BeanFactory
ClassLoader
ResourceLoader
See implementations and associated unit tests for usage examples.
 */

 public class IImportBeanDefinitionRegistrarSpring{
     /**
    default void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,
                                     BeanDefinitionRegistry registry,
                                     BeanNameGenerator importBeanNameGenerator)

    Register bean definitions as necessary based on the given annotation metadata of the importing @Configuration class.
    Note that BeanDefinitionRegistryPostProcessor types may not be registered here, due to lifecycle constraints related to @Configuration class 
    processing.

    The default implementation delegates to registerBeanDefinitions(AnnotationMetadata, BeanDefinitionRegistry).

    Parameters:
    importingClassMetadata - annotation metadata of the importing class
    registry - current bean definition registry
    importBeanNameGenerator - the bean name generator strategy for imported beans: ConfigurationClassPostProcessor.IMPORT_BEAN_NAME_GENERATOR by 
    default, or a user-provided one if ConfigurationClassPostProcessor.setBeanNameGenerator(org.springframework.beans.factory.support.BeanNameGenerator) 
    has been set. In the latter case, the passed-in strategy will be the same used for component scanning in the containing application context 
    (otherwise, the default component-scan naming strategy is AnnotationBeanNameGenerator.INSTANCE).
    */

 }
