package com.java.learning.javase.spring;

/**
 * public abstract class RegistrationBean 
        extends Object 
        implements ServletContextInitializer, Ordered 
 
    Base class for Servlet 3.0+ based registration beans.
 */

public class RegistrationBeanSpring {

    public static void main(String[] args) {
        /**
            protected abstract String	getDescription()
            Return a description of the registration.
            
            int	getOrder()
            Get the order of the registration bean.

            boolean	isEnabled()
            Return if the registration is enabled.

            void	onStartup(ServletContext servletContext)
            Configure the given ServletContext with any servlets, filters, listeners context-params and attributes necessary for initialization.

            protected abstract void	register(String description, ServletContext servletContext)
            Register this bean with the servlet context.

            void	setEnabled(boolean enabled)

            Flag to indicate that the registration is enabled.

            void	setOrder(int order)
            Set the order of the registration bean.
         */
    }
    
}
