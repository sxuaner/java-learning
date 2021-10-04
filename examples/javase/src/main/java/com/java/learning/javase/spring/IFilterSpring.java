package com.java.learning.javase.spring;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/** 
 https://docs.oracle.com/en/java/javase/11/docs/api/jdk.httpserver/com/sun/net/httpserver/Filter.html      add this to notes
 */

/**
 * 
public interface Filter

    A filter is an object that performs filtering tasks on either the request to a resource (a servlet or static content), or on the response from a 
    resource, or both.

    Filters perform filtering in the doFilter method. Every Filter has access to a FilterConfig object from which it can obtain its initialization 
    parameters, and a reference to the ServletContext which it can use, for example, to load resources needed for filtering tasks.

    Filters are configured in the deployment descriptor of a web application.

    Examples that have been identified for this design are:
        Authentication Filters
        Logging and Auditing Filters
        Image conversion Filters
        Data compression Filters
        Encryption Filters
        Tokenizing Filters
        Filters that trigger resource access events
        XSL/T filters
        Mime-type chain Filter

Since:
Servlet 2.3
 */

public class IFilterSpring implements Filter{

    public static void main(String[] args) {
        /**
        void destroy()
            Called by the web container to indicate to a filter that it is being taken out of service.

        void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
            The doFilter method of the Filter is called by the container each time a request/response pair is passed through the chain due to a client 
            request for a resource at the end of the chain. The FilterChain passed in to this method allows the Filter to pass on the request and 
            response to the next entity in the chain.
            
            A typical implementation of this method would follow the following pattern:
                Examine the request
                Optionally wrap the request object with a custom implementation to filter content or headers for input filtering
                Optionally wrap the response object with a custom implementation to filter content or headers for output filtering
                Either invoke the next entity in the chain using the FilterChain object (chain.doFilter()),
                or not pass on the request/response pair to the next entity in the filter chain to block the request processing
                Directly set headers on the response after invocation of the next entity in the filter chain.

            Throws:
            IOException
            ServletException
     
     
        void init(FilterConfig filterConfig)  throws ServletException
            Called by the web container to indicate to a filter that it is being placed into service.
            The servlet container calls the init method exactly once after instantiating the filter. The init method must complete successfully 
            before the filter is asked to do any filtering work.

            The web container cannot place the filter into service if the init method either
                Throws a ServletException
                Does not return within a time period defined by the web container

            Throws:
            ServletException
         */
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // TODO Auto-generated method stub
        
    }


    
}
