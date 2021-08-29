package com.java.learning.javase.spring;

/**
 * 
public class ServletWebServerApplicationContext
extends GenericWebApplicationContext
implements ConfigurableWebServerApplicationContext

A WebApplicationContext that can be used to bootstrap itself from a contained ServletWebServerFactory bean.
This context will create, initialize and run an WebServer by searching for a single ServletWebServerFactory bean within the ApplicationContext 
itself. The ServletWebServerFactory is free to use standard Spring concepts (such as dependency injection, lifecycle callbacks and property 
placeholder variables).

In addition, any Servlet or Filter beans defined in the context will be automatically registered with the web server. In the case of a single Servlet 
bean, the '/' mapping will be used. If multiple Servlet beans are found then the lowercase bean name will be used as a mapping prefix. Any Servlet 
named 'dispatcherServlet' will always be mapped to '/'. Filter beans will be mapped to all URLs ('/*').

For more advanced configuration, the context can instead define beans that implement the ServletContextInitializer interface (most often ServletRegistrationBeans 
and/or FilterRegistrationBeans). To prevent double registration, the use of ServletContextInitializer beans will disable automatic Servlet and 
Filter bean registration.

Although this context can be used directly, most developers should consider using the AnnotationConfigServletWebServerApplicationContext or 
XmlServletWebServerApplicationContext variants, which are the direct subclasses of this interface.
 */
public class ServletWebServerApplicationContextSpring {
    
}
