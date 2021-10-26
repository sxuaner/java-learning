package com.java.learning.javase;

/**
public interface FilterConfig

A filter configuration object used by a servlet container to pass information to a filter during initialization.
 */
public class IFilterConfigX {
    /**
    String	getFilterName()
    Returns the filter-name of this filter as defined in the deployment descriptor.
    String	getInitParameter(String name)
    Returns a String containing the value of the named initialization parameter, or null if the initialization parameter does not exist.
    Enumeration<String>	getInitParameterNames()
    Returns the names of the filter's initialization parameters as an Enumeration of String objects, or an empty Enumeration if the filter has no initialization parameters.
    ServletContext	getServletContext()
    Returns a reference to the ServletContext in which the caller is executing.
     */
    
}
