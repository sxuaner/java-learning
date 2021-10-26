package com.java.learning.javase.spring;
import org.springframework.boot.autoconfigure.security.servlet.SecurityFilterAutoConfiguration;
/**
@Configuration(proxyBeanMethods=false)
@ConditionalOnWebApplication(type=SERVLET)
@EnableConfigurationProperties(value=SecurityProperties.class)
@ConditionalOnClass(value={org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer.class,org.springframework.security.config.http.SessionCreationPolicy.class})
@AutoConfigureAfter(value=SecurityAutoConfiguration.class)
public class SecurityFilterAutoConfiguration
extends Object

Auto-configuration for Spring Security's Filter. Configured separately from SpringBootWebSecurityConfiguration to ensure that the filter's order 
is still configured when a user-provided WebSecurityConfiguration exists.

 */

public class SecurityFilterAutoConfigurationSpring {
    
}
