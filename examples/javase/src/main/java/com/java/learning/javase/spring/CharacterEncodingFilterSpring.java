package com.java.learning.javase.spring;

/**
public class CharacterEncodingFilter
    extends OncePerRequestFilter

Servlet Filter that allows one to specify a character encoding for requests. This is useful because current browsers typically do not set a character 
encoding even if specified in the HTML page or form.

This filter can either apply its encoding if the request does not already specify an encoding, or enforce this filter's encoding in any case 
("forceEncoding"="true"). In the latter case, the encoding will also be applied as default response encoding (although this will usually be overridden 
by a full content type set in the view).

*/
public class CharacterEncodingFilterSpring {
    
}
