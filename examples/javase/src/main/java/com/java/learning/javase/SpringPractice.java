package com.java.learning.javase;

import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * The @RestController and @RequestMapping annotations are Spring MVC annotations.
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SpringApplication:
   Class that can be used to bootstrap and launch a Spring application from a Java main method. By default class will perform the
   following steps to bootstrap your application:

    Create an appropriate ApplicationContext instance (depending on your classpath)
    Register a CommandLinePropertySource to expose command line arguments as Spring properties
    Refresh the application context, loading all singleton beans
    Trigger any CommandLineRunner beans 
 */

 /**
  * Now let's create a spring project without spring-boot
   
  */

@RestController
// @Configuration
@SpringBootApplication
public class SpringPractice {
    /**
    The “main” Method
    The final part of our application is the main method. This is a standard method that follows the Java convention for an application entry point. 
    Our main method delegates to Spring Boot’s SpringApplication class by calling run. SpringApplication bootstraps our application, starting Spring, 
    which, in turn, starts the auto-configured Tomcat web server. We need to pass MyApplication.class as an argument to the run method to tell 
    SpringApplication which is the primary Spring component. The args array is also passed through to expose any command-line arguments.
     */
    public static void main(String[] args) {
        // Try to understand SpringApplication.run() and stopped at SpringApplication.class 270 line
		// this.primarySources = new LinkedHashSet<>(Arrays.asList(primarySources)); learn this and continue
        SpringApplication.run(SpringPractice.class, args);
    

    }
    @Bean
    public String getValue(){
        return "value";
    }

    @RequestMapping
    /**
    The @RequestMapping annotation provides “routing” information. It tells Spring that any HTTP request with the / path should be mapped to 
    the home method. The @RestController annotation tells Spring to render the resulting string directly back to the calle
    */
    public String restCon(){
        return "";
    }

    // how to inspect what beans are assembled?

    // How to use main() in SpringApplication.java

    // why there are so many run() overloads in SpringApplication.java

    // What are util classes?
    
}
