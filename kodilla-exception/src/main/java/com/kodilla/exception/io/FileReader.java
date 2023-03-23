package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

    public void readFile() {
        ClassLoader classLoader = getClass().getClassLoader();
        //File file = new File(classLoader.getResource("names.txt").getFile());

        try {
            Path path = Path.of(classLoader.getResource("names.txt").toURI());
            //System.out.println(path);
            Stream<String> fileLines = Files.lines(path);
            fileLines.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Błąd odczytu pliku");
            //e.printStackTrace();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("A am gonna be here... always!");
        }

        //System.out.println(file.getPath());
    }
}
