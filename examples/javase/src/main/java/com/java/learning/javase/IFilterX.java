package com.java.learning.javase;

/**

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
 */
public class IFilterX {
    
}
