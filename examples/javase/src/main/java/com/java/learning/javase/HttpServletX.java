package com.java.learning.javase;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * public abstract class HttpServlet
extends GenericServlet
Provides an abstract class to be subclassed to create an HTTP servlet suitable for a Web site. A subclass of HttpServlet must override at least one method, usually one of these:
doGet, if the servlet supports HTTP GET requests
doPost, for HTTP POST requests
doPut, for HTTP PUT requests
doDelete, for HTTP DELETE requests
init and destroy, to manage resources that are held for the life of the servlet
getServletInfo, which the servlet uses to provide information about itself
There's almost no reason to override the service method. service handles standard HTTP requests by dispatching them to the handler methods for each HTTP request type (the doXXX methods listed above).

Likewise, there's almost no reason to override the doOptions and doTrace methods.

Servlets typically run on multithreaded servers, so be aware that a servlet must handle concurrent requests and be careful to synchronize access to shared resources. Shared resources include in-memory data such as instance or class variables and external objects such as files, database connections, and network connections. See the Java Tutorial on Multithreaded Programming for more information on handling multiple threads in a Java program.
 */

public class HttpServletX extends HttpServlet{

    private String message;

    @Override
    public void init() throws ServletException {
        // Do required initialization
        message = "Hello World";
    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Set response content type
        response.setContentType("text/html");

        //What implementation of interface HttpServletResponse is there?        
        try{
            // ServletResponse.getWriter()
            PrintWriter out = response.getWriter();
            out.println("<h1>" + message + "</h1>");
        }catch(IOException ie){
            // do nothing for now
        }
    }
    @Override
    public void destroy() {
        // do nothing.
    }
    public static void main(String[] args) {

        System.out.println("http-servletx is being called");

        /**
         * protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException
        
        Called by the server (via the service method) to allow a servlet to handle a GET request.
        Overriding this method to support a GET request also automatically supports an HTTP HEAD request. A HEAD request is a GET request that returns 
        no body in the response, only the request header fields.

        When overriding this method, read the request data, write the response headers, get the response's writer or output stream object, and 
        finally, write the response data. It's best to include content type and encoding. When using a PrintWriter object to return the response,
        set the content type before accessing the PrintWriter object.

        The servlet container must write the headers before committing the response, because in HTTP the headers must be sent before the response body.

        Where possible, set the Content-Length header (with the ServletResponse.setContentLength(int) method), to allow the servlet container to use a 
        persistent connection to return its response to the client, improving performance. The content length is automatically set if the entire 
        response fits inside the response buffer.

        When using HTTP 1.1 chunked encoding (which means that the response has a Transfer-Encoding header), do not set the Content-Length header.

        The GET method should be safe, that is, without any side effects for which users are held responsible. For example, most form queries have no
        side effects. If a client request is intended to change stored data, the request should use some other HTTP method.

        The GET method should also be idempotent, meaning that it can be safely repeated. Sometimes making a method safe also makes it idempotent. 
        For example, repeating queries is both safe and idempotent, but buying a product online or modifying data is neither safe nor idempotent.

        If the request is incorrectly formatted, doGet returns an HTTP "Bad Request" message.

        Parameters:
        req - an HttpServletRequest object that contains the request the client has made of the servlet
        resp - an HttpServletResponse object that contains the response the servlet sends to the client
        Throws:
        IOException - if an input or output error is detected when the servlet handles the GET request
        ServletException - if the request for the GET could not be handled
        */
    }
    

/**
https://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpServlet.html

protected void	doDelete(HttpServletRequest req, HttpServletResponse resp)
Called by the server (via the service method) to allow a servlet to handle a DELETE request.
protected void	doGet(HttpServletRequest req, HttpServletResponse resp)
Called by the server (via the service method) to allow a servlet to handle a GET request.
protected void	doHead(HttpServletRequest req, HttpServletResponse resp)
Receives an HTTP HEAD request from the protected service method and handles the request.
protected void	doOptions(HttpServletRequest req, HttpServletResponse resp)
Called by the server (via the service method) to allow a servlet to handle a OPTIONS request.
protected void	doPost(HttpServletRequest req, HttpServletResponse resp)
Called by the server (via the service method) to allow a servlet to handle a POST request.
protected void	doPut(HttpServletRequest req, HttpServletResponse resp)
Called by the server (via the service method) to allow a servlet to handle a PUT request.
protected void	doTrace(HttpServletRequest req, HttpServletResponse resp)
Called by the server (via the service method) to allow a servlet to handle a TRACE request.
protected long	getLastModified(HttpServletRequest req)
Returns the time the HttpServletRequest object was last modified, in milliseconds since midnight January 1, 1970 GMT.
protected void	service(HttpServletRequest req, HttpServletResponse resp)
Receives standard HTTP requests from the public service method and dispatches them to the doXXX methods defined in this class.
void	service(ServletRequest req, ServletResponse res)
Dispatches client requests to the protected service method.

*/

}
