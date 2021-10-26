package com.java.learning.javase.spring;

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/**
 * 
public abstract class SpringBootServletInitializer
extends Object
implements WebApplicationInitializer

An opinionated WebApplicationInitializer to run a SpringApplication from a traditional WAR deployment. Binds Servlet, Filter and 
ServletContextInitializer beans from the application context to the server.
To configure the application either override the configure(SpringApplicationBuilder) method (calling SpringApplicationBuilder.sources(Class...)) or 
make the initializer itself a @Configuration. If you are using SpringBootServletInitializer in combination with other WebApplicationInitializers you 
might also want to add an @Ordered annotation to configure a specific startup order.

Note that a WebApplicationInitializer is only needed if you are building a war file and deploying it. If you prefer to run an embedded web server then 
you won't need this at all.
 */

public class SpringBootServletInitializerSpring{

    public static void main(String[] args) {
        // First, how to use this?
        SpringBootServletInitializer ssi;
        
    }
}