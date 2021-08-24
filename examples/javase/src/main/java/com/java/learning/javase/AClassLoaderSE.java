package com.java.learning.javase;

import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 
    public abstract class ClassLoader
        extends Object

A class loader is an object that is responsible for loading classes. The class ClassLoader is an abstract class. 

### How  does it work
Given the binary name of a class, a class loader should attempt to locate or generate data that constitutes a definition for the class. 
A typical strategy is to transform the name into a file name and then read a "class file" of that name from a file system. 

!Does this mean that classloader only loads a .class file after compilation?

Every Class object contains a reference to the ClassLoader that defined it.( Could be seen in VisualVM)

Class objects for array classes(Such as primitive arrays or object arrays?) are not created by class loaders, but are created automatically as 
required by the Java runtime. The class loader for an array class, as returned by Class.getClassLoader() is the same as the class loader for 
its element type; if the element type is a primitive type, then the array class has no class loader.

Applications implement subclasses of ClassLoader in order to extend the manner in which the Java virtual machine dynamically loads classes.

Class loaders may typically be used by security managers to indicate security domains.

The ClassLoader class uses a delegation model to search for classes and resources. Each instance of ClassLoader has an associated parent class 
loader. When requested to find a class or resource, a ClassLoader instance will delegate the search for the class or resource to its parent 
class loader before attempting to find the class or resource itself. The virtual machine's built-in class loader, called the "bootstrap 
class loader", does not itself have a parent but may serve as the parent of a ClassLoader instance.

Class loaders that support concurrent loading of classes are known as parallel capable class loaders and are required to register themselves at their class initialization time by invoking the ClassLoader.registerAsParallelCapable method. Note that the ClassLoader class is registered as parallel capable by default. However, its subclasses still need to register themselves if they are parallel capable. 
In environments in which the delegation model is not strictly hierarchical, class loaders need to be parallel capable, otherwise class loading can lead to deadlocks because the loader lock is held for the duration of the class loading process (see loadClass methods).

Normally, the Java virtual machine loads classes from the local file system in a platform-dependent manner. For example, on UNIX systems, the virtual machine loads classes from the directory defined by the CLASSPATH environment variable.

However, some classes may not originate from a file; they may originate from other sources, such as the network, or they could be constructed by an application. The method defineClass converts an array of bytes into an instance of class Class. Instances of this newly defined class can be created using Class.newInstance.

The methods and constructors of objects created by a class loader may reference other classes. To determine the class(es) referred to, the Java virtual machine invokes the loadClass method of the class loader that originally created the class.

For example, an application could create a network class loader to download class files from a server. Sample code might look like:

   ClassLoader loader = new NetworkClassLoader(host, port);
   Object main = loader.loadClass("Main", true).newInstance();
        . . .
 
The network class loader subclass must define the methods findClass and loadClassData to load a class from the network. Once it has downloaded the bytes that make up the class, it should use the method defineClass to create a class instance. A sample implementation is:

     class NetworkClassLoader extends ClassLoader {
         String host;
         int port;

         public Class findClass(String name) {
             byte[] b = loadClassData(name);
             return defineClass(name, b, 0, b.length);
         }

         private byte[] loadClassData(String name) {
             // load the class data from the connection
              . . .
         }
     }
 
Binary names

Any class name provided as a String parameter to methods in ClassLoader must be a binary name as defined by The Java™ Language Specification.

Examples of valid class names include:

   "java.lang.String"
   "javax.swing.JSpinner$DefaultEditor"
   "java.security.KeyStore$Builder$FileBuilder$1"
   "java.net.URLClassLoader$3$1"
 * 
 * 
 * Returns the class loader for the class. Some implementations may use null to represent the bootstrap class loader. This method will return null in such implementations if this class was loaded by the bootstrap class loader.

If this object represents a primitive type or void, null is returned.
 * 
 */
public class AClassLoaderSE {
    public static void main(String[] args) {

        /**
        void clearAssertionStatus()
        Sets the default assertion status for this class loader to false and discards any package defaults or class assertion status settings associated with the class loader.
        protected Class<?>	defineClass(byte[] b, int off, int len)
        Deprecated. 
        Replaced by defineClass(String, byte[], int, int)
        protected Class<?>	defineClass(String name, byte[] b, int off, int len)
        Converts an array of bytes into an instance of class Class.
        protected Class<?>	defineClass(String name, byte[] b, int off, int len, ProtectionDomain protectionDomain)
        Converts an array of bytes into an instance of class Class, with an optional ProtectionDomain.
        protected Class<?>	defineClass(String name, ByteBuffer b, ProtectionDomain protectionDomain)
        Converts a ByteBuffer into an instance of class Class, with an optional ProtectionDomain.
        protected Package	definePackage(String name, String specTitle, String specVersion, String specVendor, String implTitle, String implVersion, String implVendor, URL sealBase)
        Defines a package by name in this ClassLoader.
        protected Class<?>	findClass(String name)
        Finds the class with the specified binary name.
        protected String	findLibrary(String libname)
        Returns the absolute path name of a native library.
        protected Class<?>	findLoadedClass(String name)
        Returns the class with the given binary name if this loader has been recorded by the Java virtual machine as an initiating loader of a class with that binary name.
        protected URL	findResource(String name)
        Finds the resource with the given name.
        protected Enumeration<URL>	findResources(String name)
        Returns an enumeration of URL objects representing all the resources with the given name.
        protected Class<?>	findSystemClass(String name)
        Finds a class with the specified binary name, loading it if necessary.
        protected Object	getClassLoadingLock(String className)
        Returns the lock object for class loading operations.
        protected Package	getPackage(String name)
        Returns a Package that has been defined by this class loader or any of its ancestors.
        protected Package[]	getPackages()
        Returns all of the Packages defined by this class loader and its ancestors.
        ClassLoader	getParent()
        Returns the parent class loader for delegation.
        URL	getResource(String name)
        Finds the resource with the given name.
        InputStream	getResourceAsStream(String name)
        Returns an input stream for reading the specified resource.
        Enumeration<URL>	getResources(String name)
        Finds all the resources with the given name.
        static ClassLoader	getSystemClassLoader()
        Returns the system class loader for delegation.
        static URL	getSystemResource(String name)
        Find a resource of the specified name from the search path used to load classes.
        static InputStream	getSystemResourceAsStream(String name)
        Open for reading, a resource of the specified name from the search path used to load classes.
        static Enumeration<URL>	getSystemResources(String name)
        Finds all resources of the specified name from the search path used to load classes.
        Class<?>	loadClass(String name)
        Loads the class with the specified binary name.
        protected Class<?>	loadClass(String name, boolean resolve)
        Loads the class with the specified binary name.
        protected static boolean	registerAsParallelCapable()
        Registers the caller as parallel capable.
        protected void	resolveClass(Class<?> c)
        Links the specified class.
        void	setClassAssertionStatus(String className, boolean enabled)
        Sets the desired assertion status for the named top-level class in this class loader and any nested classes contained therein.
        void	setDefaultAssertionStatus(boolean enabled)
        Sets the default assertion status for this class loader.
        void	setPackageAssertionStatus(String packageName, boolean enabled)
        Sets the package default assertion status for the named package.
        protected void	setSigners(Class<?> c, Object[] signers)
        Sets the signers of a class.
         */

    // Array classes have no class loader
        char[] charArray = {'1','2','3'};
        Integer[] integerArray = {1,2,3};
        List<Integer> objectList = new ArrayList<>();
        // Now put all elements of integerArray into the objectList
        // option1:
        // IntStream.range(0, integerArray.length-1).mapToObj( x -> objectList.add(integerArray[x])).close();

        // Option2:
        // Wrong: Arrays.stream(integerArray).map( x -> objectList.add(x)).close();
        Arrays.stream(integerArray).forEach(x -> objectList.add(x));
        

        Boolean primitiveArrayHasNullClassLoader = false;
        Boolean objectArrayHasNullClassLoader = false;

        // To get the class names
        String classOfCharArray = charArray.getClass().toString();
        String classOfObjectArray = integerArray.getClass().toString();

        String nameOfClassLoaderCharArray = "";
        String nameOfClassLoaderObjectArray  = "";

        // To get the class loaders' names
        try {
            /*
             * Returns the class loader for the class. Some implementations may use null to
             * represent the bootstrap class loader. This method will return null in such
             * implementations if this class was loaded by the bootstrap class loader.
             * 
             * If this object represents a primitive type or void, null is returned.
             * 
             * What is bootstrap class loader( Or null class loader)? check Classloader.notes
             */
            if(charArray.getClass().getClassLoader() == null) {
                primitiveArrayHasNullClassLoader = true;
            }else{
                // if class loader is not null, get the name
                nameOfClassLoaderCharArray =  Class.forName(classOfCharArray).getClassLoader().getName();
            }
        } catch (ClassNotFoundException e) {
            System.out.println("class not found exception was thrown");
            // let the program continue
            // does printStackTrace() call System.exit()?? Probably not
        }

        try {
            if (integerArray.getClass().getClassLoader() == null) {
                objectArrayHasNullClassLoader = true;
            }else{
                nameOfClassLoaderObjectArray = Class.forName(classOfObjectArray).getClassLoader().getName();
            }
        } catch (ClassNotFoundException e) {
            System.out.println("class not found exception was thrown");
        }

        Boolean objectListHasNullClassLoader = false;
        String nameOfClassLoaderObjectList = "";
        try {
            if (objectList.getClass().getClassLoader() == null) {
                objectListHasNullClassLoader = true;
            } else {
                nameOfClassLoaderObjectList = Class.forName(classOfObjectArray).getClassLoader().getName();
            }
        } catch (ClassNotFoundException e) {
            System.out.println("class not found exception was thrown");
        }

        
    }
    
}
