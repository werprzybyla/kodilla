package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReaderWithoutHandling {

    public void readFile() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();

        try {
            File file = new File(classLoader.getResource("names.txt").toURI());
            Stream<String> fileLines = Files.lines(Paths.get(file.getPath()));
            fileLines.forEach(System.out::println);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}