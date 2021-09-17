package com.java.learning.javase;
/**
public interface Path
    extends Comparable<Path>, Iterable<Path>, Watchable

An object that may be used to locate a file in a file system. It will typically represent a system dependent file path.
A Path represents a path that is hierarchical and composed of a sequence of directory and file name elements separated by a special separator
or delimiter. A root component, that identifies a file system hierarchy, may also be present. The name element that is farthest from the 
root of the directory hierarchy is the name of a file or directory. The other name elements are directory names. A Path can represent a root, 
a root and a sequence of names, or simply one or more name elements. A Path is considered to be an empty path if it consists solely of one name 
element that is empty. Accessing a file using an empty path is equivalent to accessing the default directory of the file system. Path defines 
the getFileName, getParent, getRoot, and subpath methods to access the path components or a subsequence of its name elements.

In addition to accessing the components of a path, a Path also defines the resolve and resolveSibling methods to combine paths. The relativize method that can be used to construct a relative path between two paths. Paths can be compared, and tested against each other using the startsWith and endsWith methods.

This interface extends Watchable interface so that a directory located by a path can be registered with a WatchService and entries in the directory watched.

WARNING: This interface is only intended to be implemented by those developing custom file system implementations. Methods may be added to this interface in future releases.

Accessing Files
Paths may be used with the Files class to operate on files, directories, and other types of files. For example, suppose we want a BufferedReader to read text from a file "access.log". The file is located in a directory "logs" relative to the current working directory and is UTF-8 encoded.

     Path path = FileSystems.getDefault().getPath("logs", "access.log");
     BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
 
Interoperability
Paths associated with the default provider are generally interoperable with the java.io.File class. Paths created by other providers are unlikely to be interoperable with the abstract path names represented by java.io.File. The toPath method may be used to obtain a Path from the abstract path name represented by a java.io.File object. The resulting Path can be used to operate on the same file as the java.io.File object. In addition, the toFile method is useful to construct a File from the String representation of a Path.

Concurrency
Implementations of this interface are immutable and safe for use by multiple concurrent threads.
 */
public class PathNIO {
    
}
