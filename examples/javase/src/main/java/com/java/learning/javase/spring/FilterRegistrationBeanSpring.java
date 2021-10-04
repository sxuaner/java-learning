package com.java.learning.javase.spring;

import org.springframework.boot.web.servlet.FilterRegistrationBean;

/*

org.springframework.boot.web.servlet.FilterRegistrationBean

public class FilterRegistrationBean<T extends Filter>
    extends AbstractFilterRegistrationBean<T>

A ServletContextInitializer to register Filters in a Servlet 3.0+ container. Similar to the registration features provided by ServletContext but 
with a Spring Bean friendly design. The Filter must be specified before calling RegistrationBean.onStartup(ServletContext). Registrations can be 
associated with URL patterns and/or servlets (either by name or via a ServletRegistrationBeans. When no URL pattern or servlets are specified the 
filter will be associated to '/*'. The filter name will be deduced if not specified.
*/



public class FilterRegistrationBeanSpring {
    /*
     * T getFilter() 
     * Return the Filter to be registered.
     * 
     * void setFilter(T filter) 
     * Set the filter to be registered.
     */
    public static void main(String[] args) {
        FilterRegistrationBean frb = new FilterRegistrationBean();
    }
}
