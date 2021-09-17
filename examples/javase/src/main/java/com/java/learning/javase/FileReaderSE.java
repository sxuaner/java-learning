package com.java.learning.javase;

import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.BufferedReader;
import java.io.IOException;

/**
public class FileReader
    extends InputStreamReader

Reads text from character files using a default buffer size. Decoding from bytes to characters uses either a 
specified charset or the platform's default charset.

The FileReader is meant for reading streams of characters. For reading streams of raw bytes, consider using a FileInputStream.
*/

public class FileReaderSE {
    public static void main(String[] args) {
        // FileReader fr = new FileReader("file");

        Path path = FileSystems.getDefault().getPath("FileReaderSE.java");

        String pathStr = path.toString();   

        // For a quick dirty solution, absolute path is used here. Try to get relative path
        try (BufferedReader in = new BufferedReader(new FileReader("/Users/xuansong/projects/java/java-learning/examples/javase/src/main/java/com/java/learning/javase/FileReaderSE.java"))) 
        {
            while (in.ready()) {
                Stream<String> s = in.lines();
                String input = s.map(String::valueOf).collect(Collectors.joining());
                System.out.println(input);
            }
        } catch (IOException ioe) {

        }
 
        
    }
    
}
