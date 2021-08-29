package com.java.learning.javase.spring;


public class SpringApplicationBuilderSpring {
    public static void main(String[] args) {
        /**
 SpringApplicationBuilder	addBootstrapper(Bootstrapper bootstrapper)
Deprecated. 
since 2.4.5 for removal in 2.6 in favor of addBootstrapRegistryInitializer(BootstrapRegistryInitializer)
SpringApplicationBuilder	addBootstrapRegistryInitializer(BootstrapRegistryInitializer bootstrapRegistryInitializer)
Adds BootstrapRegistryInitializer instances that can be used to initialize the BootstrapRegistry.
SpringApplicationBuilder	addCommandLineProperties(boolean addCommandLineProperties)
Flag to indicate that command line arguments should be added to the environment.
SpringApplication	application()
Accessor for the current application.
SpringApplicationBuilder	applicationStartup(ApplicationStartup applicationStartup)
Configure the ApplicationStartup to be used with the ApplicationContext for collecting startup metrics.
SpringApplicationBuilder	banner(Banner banner)
Sets the Banner instance which will be used to print the banner when no static banner file is provided.
SpringApplicationBuilder	bannerMode(Banner.Mode bannerMode) 
SpringApplicationBuilder	beanNameGenerator(BeanNameGenerator beanNameGenerator)
Bean name generator for automatically generated bean names in the application context.
SpringApplication	build()
Returns a fully configured SpringApplication that is ready to run.
SpringApplication	build(String... args)
Returns a fully configured SpringApplication that is ready to run.
SpringApplicationBuilder	child(Class<?>... sources)
Create a child application with the provided sources.
ConfigurableApplicationContext	context()
Accessor for the current application context.
SpringApplicationBuilder	contextClass(Class<? extends ConfigurableApplicationContext> cls)
Deprecated. 
since 2.4.0 for removal in 2.6.0 in favor of contextFactory(ApplicationContextFactory)
SpringApplicationBuilder	contextFactory(ApplicationContextFactory factory)
Explicitly set the factory used to create the application context.
protected SpringApplication	createSpringApplication(Class<?>... sources)
Creates a new SpringApplication instance from the given sources.
SpringApplicationBuilder	environment(ConfigurableEnvironment environment)
Environment for the application context.
SpringApplicationBuilder	environmentPrefix(String environmentPrefix)
Prefix that should be applied when obtaining configuration properties from the system environment.
SpringApplicationBuilder	headless(boolean headless)
Sets if the application is headless and should not instantiate AWT.
SpringApplicationBuilder	initializers(ApplicationContextInitializer<?>... initializers)
Add some initializers to the application (applied to the ApplicationContext before any bean definitions are loaded).
SpringApplicationBuilder	lazyInitialization(boolean lazyInitialization)
Flag to control whether the application should be initialized lazily.
SpringApplicationBuilder	listeners(ApplicationListener<?>... listeners)
Add some listeners to the application (listening for SpringApplication events as well as regular Spring events once the context is running).
SpringApplicationBuilder	logStartupInfo(boolean logStartupInfo)
Flag to indicate the startup information should be logged.
SpringApplicationBuilder	main(Class<?> mainApplicationClass)
Fixes the main application class that is used to anchor the startup messages.
SpringApplicationBuilder	parent(Class<?>... sources)
Add a parent application with the provided sources.
SpringApplicationBuilder	parent(ConfigurableApplicationContext parent)
Add an already running parent context to an existing application.
SpringApplicationBuilder	profiles(String... profiles)
Add to the active Spring profiles for this app (and its parent and children).
SpringApplicationBuilder	properties(Map<String,Object> defaults)
Default properties for the environment.
SpringApplicationBuilder	properties(Properties defaultProperties)
Default properties for the environment.Multiple calls to this method are cumulative and will not clear any previously set properties.
SpringApplicationBuilder	properties(String... defaultProperties)
Default properties for the environment in the form key=value or key:value.
SpringApplicationBuilder	registerShutdownHook(boolean registerShutdownHook)
Sets if the created ApplicationContext should have a shutdown hook registered.
SpringApplicationBuilder	resourceLoader(ResourceLoader resourceLoader)
ResourceLoader for the application context.
ConfigurableApplicationContext	run(String... args)
Create an application context (and its parent if specified) with the command line args provided.
SpringApplicationBuilder	setAddConversionService(boolean addConversionService)
Flag to indicate if the ApplicationConversionService should be added to the application context's Environment.
SpringApplicationBuilder	sibling(Class<?>... sources)
Create a sibling application (one with the same parent).
SpringApplicationBuilder	sibling(Class<?>[] sources, String... args)
Create a sibling application (one with the same parent).
SpringApplicationBuilder	sources(Class<?>... sources)
Add more sources (configuration classes and components) to this application.
SpringApplicationBuilder	web(WebApplicationType webApplicationType)
Flag to explicitly request a specific type of web application.
         */
        
    }
    
}
