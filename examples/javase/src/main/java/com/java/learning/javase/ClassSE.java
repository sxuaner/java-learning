package com.java.learning.javase;


/**
 *      public final class Class<T>
            extends Object
            implements Serializable, GenericDeclaration, Type, AnnotatedElement

T - the type of the class modeled by this Class object. For example, the type of String.class is Class<String>. Use Class<?> if the class being 
modeled is unknown.

Instances of the class Class represent classes and interfaces in a running Java application. 
An enum is a kind of class 

An annotation is a kind of interface. 

Every array also belongs to a class that is reflected as a Class object that is shared by all arrays with the same element type and number of 
dimensions. 

The primitive Java types (boolean, byte, char, short, int, long, float, and double), and the keyword void are also represented as Class objects.

Class has no public constructor. Instead Class objects are constructed automatically by the Java Virtual Machine as classes are loaded and 
by calls to the defineClass method in the class loader.

The following example uses a Class object to print the class name of an object:
     void printClassName(Object obj) {
         System.out.println("The class of " + obj +
                            " is " + obj.getClass().getName());
     }
It is also possible to get the Class object for a named type (or for void) using a class literal. See Section 15.8.2 of The Java™ Language 
Specification. For example:
System.out.println("The name of class Foo is: "+Foo.class.getName());

*/
public class ClassSE {
    /**
     * <U> Class<? extends U>	asSubclass(Class<U> clazz)
Casts this Class object to represent a subclass of the class represented by the specified class object.
T	cast(Object obj)
Casts an object to the class or interface represented by this Class object.
boolean	desiredAssertionStatus()
Returns the assertion status that would be assigned to this class if it were to be initialized at the time this method is invoked.
static Class<?>	forName(String className)
Returns the Class object associated with the class or interface with the given string name.
static Class<?>	forName(String name, boolean initialize, ClassLoader loader)
Returns the Class object associated with the class or interface with the given string name, using the given class loader.
AnnotatedType[]	getAnnotatedInterfaces()
Returns an array of AnnotatedType objects that represent the use of types to specify superinterfaces of the entity represented by this Class object.
AnnotatedType	getAnnotatedSuperclass()
Returns an AnnotatedType object that represents the use of a type to specify the superclass of the entity represented by this Class object.
<A extends Annotation>
A	getAnnotation(Class<A> annotationClass)
Returns this element's annotation for the specified type if such an annotation is present, else null.
Annotation[]	getAnnotations()
Returns annotations that are present on this element.
<A extends Annotation>
A[]	getAnnotationsByType(Class<A> annotationClass)
Returns annotations that are associated with this element.
String	getCanonicalName()
Returns the canonical name of the underlying class as defined by the Java Language Specification.
Class<?>[]	getClasses()
Returns an array containing Class objects representing all the public classes and interfaces that are members of the class represented by this Class object.
ClassLoader	getClassLoader()
Returns the class loader for the class.
Class<?>	getComponentType()
Returns the Class representing the component type of an array.
Constructor<T>	getConstructor(Class<?>... parameterTypes)
Returns a Constructor object that reflects the specified public constructor of the class represented by this Class object.
Constructor<?>[]	getConstructors()
Returns an array containing Constructor objects reflecting all the public constructors of the class represented by this Class object.
<A extends Annotation>
A	getDeclaredAnnotation(Class<A> annotationClass)
Returns this element's annotation for the specified type if such an annotation is directly present, else null.
Annotation[]	getDeclaredAnnotations()
Returns annotations that are directly present on this element.
<A extends Annotation>
A[]	getDeclaredAnnotationsByType(Class<A> annotationClass)
Returns this element's annotation(s) for the specified type if such annotations are either directly present or indirectly present.
Class<?>[]	getDeclaredClasses()
Returns an array of Class objects reflecting all the classes and interfaces declared as members of the class represented by this Class object.
Constructor<T>	getDeclaredConstructor(Class<?>... parameterTypes)
Returns a Constructor object that reflects the specified constructor of the class or interface represented by this Class object.
Constructor<?>[]	getDeclaredConstructors()
Returns an array of Constructor objects reflecting all the constructors declared by the class represented by this Class object.
Field	getDeclaredField(String name)
Returns a Field object that reflects the specified declared field of the class or interface represented by this Class object.
Field[]	getDeclaredFields()
Returns an array of Field objects reflecting all the fields declared by the class or interface represented by this Class object.
Method	getDeclaredMethod(String name, Class<?>... parameterTypes)
Returns a Method object that reflects the specified declared method of the class or interface represented by this Class object.
Method[]	getDeclaredMethods()
Returns an array containing Method objects reflecting all the declared methods of the class or interface represented by this Class object, including public, protected, default (package) access, and private methods, but excluding inherited methods.
Class<?>	getDeclaringClass()
If the class or interface represented by this Class object is a member of another class, returns the Class object representing the class in which it was declared.
Class<?>	getEnclosingClass()
Returns the immediately enclosing class of the underlying class.
Constructor<?>	getEnclosingConstructor()
If this Class object represents a local or anonymous class within a constructor, returns a Constructor object representing the immediately enclosing constructor of the underlying class.
Method	getEnclosingMethod()
If this Class object represents a local or anonymous class within a method, returns a Method object representing the immediately enclosing method of the underlying class.
T[]	getEnumConstants()
Returns the elements of this enum class or null if this Class object does not represent an enum type.
Field	getField(String name)
Returns a Field object that reflects the specified public member field of the class or interface represented by this Class object.
Field[]	getFields()
Returns an array containing Field objects reflecting all the accessible public fields of the class or interface represented by this Class object.
Type[]	getGenericInterfaces()
Returns the Types representing the interfaces directly implemented by the class or interface represented by this object.
Type	getGenericSuperclass()
Returns the Type representing the direct superclass of the entity (class, interface, primitive type or void) represented by this Class.
Class<?>[]	getInterfaces()
Determines the interfaces implemented by the class or interface represented by this object.
Method	getMethod(String name, Class<?>... parameterTypes)
Returns a Method object that reflects the specified public member method of the class or interface represented by this Class object.
Method[]	getMethods()
Returns an array containing Method objects reflecting all the public methods of the class or interface represented by this Class object, including those declared by the class or interface and those inherited from superclasses and superinterfaces.
int	getModifiers()
Returns the Java language modifiers for this class or interface, encoded in an integer.
String	getName()
Returns the name of the entity (class, interface, array class, primitive type, or void) represented by this Class object, as a String.
Package	getPackage()
Gets the package for this class.
ProtectionDomain	getProtectionDomain()
Returns the ProtectionDomain of this class.
URL	getResource(String name)
Finds a resource with a given name.
InputStream	getResourceAsStream(String name)
Finds a resource with a given name.
Object[]	getSigners()
Gets the signers of this class.
String	getSimpleName()
Returns the simple name of the underlying class as given in the source code.
Class<? super T>	getSuperclass()
Returns the Class representing the superclass of the entity (class, interface, primitive type or void) represented by this Class.
String	getTypeName()
Return an informative string for the name of this type.
TypeVariable<Class<T>>[]	getTypeParameters()
Returns an array of TypeVariable objects that represent the type variables declared by the generic declaration represented by this GenericDeclaration object, in declaration order.
boolean	isAnnotation()
Returns true if this Class object represents an annotation type.
boolean	isAnnotationPresent(Class<? extends Annotation> annotationClass)
Returns true if an annotation for the specified type is present on this element, else false.
boolean	isAnonymousClass()
Returns true if and only if the underlying class is an anonymous class.
boolean	isArray()
Determines if this Class object represents an array class.
boolean	isAssignableFrom(Class<?> cls)
Determines if the class or interface represented by this Class object is either the same as, or is a superclass or superinterface of, the class or interface represented by the specified Class parameter.
boolean	isEnum()
Returns true if and only if this class was declared as an enum in the source code.
boolean	isInstance(Object obj)
Determines if the specified Object is assignment-compatible with the object represented by this Class.
boolean	isInterface()
Determines if the specified Class object represents an interface type.
boolean	isLocalClass()
Returns true if and only if the underlying class is a local class.
boolean	isMemberClass()
Returns true if and only if the underlying class is a member class.
boolean	isPrimitive()
Determines if the specified Class object represents a primitive type.
boolean	isSynthetic()
Returns true if this class is a synthetic class; returns false otherwise.
T	newInstance()
Creates a new instance of the class represented by this Class object.
String	toGenericString()
Returns a string describing this Class, including information about modifiers and type parameters.
String	toString()
Converts the object to a string.
     */
    
}
