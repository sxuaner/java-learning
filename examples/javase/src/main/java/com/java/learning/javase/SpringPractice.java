package com.java.learning.javase;

import java.util.Properties;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SpringBootWebSecurityConfiguration;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.context.ApplicationContext;
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

// @RestController
@Configuration
// @SpringBootApplication
public class SpringPractice {
    @Autowired
    private ApplicationContext appcon;

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
        // SpringApplication.run(SpringPractice.class, args);

        AnnotationConfigApplicationContext acfc = new AnnotationConfigApplicationContext(SpringPractice.class);
        
        String beanValue = acfc.getBean(String.class);

        String[] names = acfc.getBeanDefinitionNames();

        // SpringBootWebSecurityConfiguration
        // DelegatingFilterProxy
        // SecurityAutoConfiguration;
        ServletContext sc;        

    }
        
    @Bean
    public String getValue(){
        return "value";
    }

    // ------------------------- Following line of code requires ServletWebServerFactory --------------------------
    // @RequestMapping
    // /**
    // The @RequestMapping annotation provides “routing” information. It tells Spring that any HTTP request with the / path should be mapped to 
    // the home method. The @RestController annotation tells Spring to render the resulting string directly back to the calle
    // */
    // public String restCon(){
    //     return "";
    // }

    // how to inspect what beans are assembled?
    

    // How to use main() in SpringApplication.java

    // why there are so many run() overloads in SpringApplication.java

    // What are util classes?
    
}
