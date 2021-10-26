package com.java.learning.javase.spring;
/**
public class ServletServerHttpRequest extends Object implements ServerHttpRequest

ServerHttpRequest implementation that is based on a HttpServletRequest.
 */
public class ServletServerHttpRequestSpring {
 
    
     /**
        ServerHttpAsyncRequestControl	getAsyncRequestControl(ServerHttpResponse response)
        Return a control that allows putting the request in asynchronous mode so the response remains open until closed explicitly from the current or another thread.
        
        InputStream	getBody()
        Return the body of the message as an input stream.
        
        HttpHeaders	getHeaders()
        Return the headers of this message.
        
        InetSocketAddress	getLocalAddress()
        Return the address on which the request was received.
        
        HttpMethod	getMethod()
        Return the HTTP method of the request.
        
        String	getMethodValue()
        Return the HTTP method of the request as a String value.
        
        Principal	getPrincipal()
        Return a Principal instance containing the name of the authenticated user.
        
        InetSocketAddress	getRemoteAddress()
        Return the address of the remote client.
        
        HttpServletRequest	getServletRequest()
        Returns the HttpServletRequest this object is based on.
        
        URI	getURI()
        Return the URI of the request (including a query string if any, but only if it is well-formed for a URI representation).
      */
}
