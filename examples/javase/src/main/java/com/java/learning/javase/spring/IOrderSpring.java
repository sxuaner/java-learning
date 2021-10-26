package com.java.learning.javase.spring;

// org.springframework.core.annotation

/**
 
@Retention(value=RUNTIME)
@Target(value={TYPE,METHOD,FIELD})
@Documented
public @interface Order

@Order defines the sort order for an annotated component.

The value() is optional and represents an order value as defined in the Ordered interface. Lower values have higher priority. The default value is 
Ordered.LOWEST_PRECEDENCE, indicating lowest priority (losing to any other specified order value).

NOTE: Since Spring 4.0, annotation-based ordering is supported for many kinds of components in Spring, even for collection injection where the order 
values of the target components are taken into account (either from their target class or from their @Bean method). While such order values may 
influence priorities at injection points, please be aware that they do not influence singleton startup order which is an orthogonal concern determined 
by dependency relationships and @DependsOn declarations (influencing a runtime-determined dependency graph).

Since Spring 4.1, the standard Priority annotation can be used as a drop-in replacement for this annotation in ordering scenarios. Note that @Priority
may have additional semantics when a single element has to be picked (see AnnotationAwareOrderComparator.getPriority(java.lang.Object)).

Alternatively, order values may also be determined on a per-instance basis through the Ordered interface, allowing for configuration-determined instance 
values instead of hard-coded values attached to a particular class.

Consult the javadoc for OrderComparator for details on the sort semantics for non-ordered objects.
 */
public class IOrderSpring {
    
}
