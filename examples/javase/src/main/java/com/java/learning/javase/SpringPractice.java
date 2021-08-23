package com.java.learning.javase;

import javax.swing.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

/**
 * SpringApplication:
 * Class that can be used to bootstrap and launch a Spring application from a Java main method. By default class will perform the
   following steps to bootstrap your application:

    Create an appropriate ApplicationContext instance (depending on your classpath)
    Register a CommandLinePropertySource to expose command line arguments as Spring properties
    Refresh the application context, loading all singleton beans
    Trigger any CommandLineRunner beans 
 */

@SpringBootApplication
@RestController
public class SpringPractice {
    public static void main(String[] args) {
        // Try to understand SpringApplication.run() and stopped at SpringApplication.class 270 line
		// this.primarySources = new LinkedHashSet<>(Arrays.asList(primarySources)); learn this and continue
        SpringApplication.run(SpringPractice.class, args);
    }
    @Bean
    public String getValue(){
        return "value";

    }

    // how to inspect what beans are assembled?

    // How to use main() in SpringApplication.java

    // why there are so many run() overloads in SpringApplication.java

    // What are util classes?
    
}
