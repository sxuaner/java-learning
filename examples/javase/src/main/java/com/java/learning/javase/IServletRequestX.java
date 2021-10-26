/**

public interface ServletRequest

Defines an object to provide client request information to a servlet. The servlet container creates a ServletRequest object and passes it as an 
argument to the servlet's service method.

A ServletRequest object provides data including parameter name and values, attributes, and an input stream. Interfaces that extend ServletRequest can 
provide additional protocol-specific data (for example, HTTP data is provided by HttpServletRequest.

*/