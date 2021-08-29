package com.java.learning.javase;
/**

public interface Servlet

All Known Subinterfaces:
HttpJspPage, JspPage

All Known Implementing Classes:
FacesServlet, GenericServlet, HttpServlet


Defines methods that all servlets must implement.

A servlet is a small Java program that runs within a Web server. Servlets receive and respond to requests from Web clients, usually across HTTP, 
the HyperText Transfer Protocol.

To implement this interface, you can write a generic servlet that extends javax.servlet.GenericServlet or an HTTP servlet that extends 
javax.servlet.http.HttpServlet.

This interface defines methods to initialize a servlet, to service requests, and to remove a servlet from the server. These are known as life-cycle 
methods and are called in the following sequence:

The servlet is constructed, then initialized with the init method.
Any calls from clients to the service method are handled.
The servlet is taken out of service, then destroyed with the destroy method, then garbage collected and finalized.
In addition to the life-cycle methods, this interface provides the getServletConfig method, which the servlet can use to get any startup information, 
and the getServletInfo method, which allows the servlet to return basic information about itself, such as author, version, and copyright.
 */

public class IServletSE {

    /**
    void destroy()
    Called by the servlet container to indicate to a servlet that the servlet is being taken out of service.
    ServletConfig	getServletConfig()
    Returns a ServletConfig object, which contains initialization and startup parameters for this servlet.
    String	getServletInfo()
    Returns information about the servlet, such as author, version, and copyright.
    void	init(ServletConfig config)
    Called by the servlet container to indicate to a servlet that the servlet is being placed into service.
    void	service(ServletRequest req, ServletResponse res)
    Called by the servlet container to allow the servlet to respond to a request.
     */
    
}
