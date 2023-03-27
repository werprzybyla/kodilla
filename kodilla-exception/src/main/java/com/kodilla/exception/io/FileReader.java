package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

    public void readFile() throws FileReaderException{
        ClassLoader classLoader = getClass().getClassLoader();

        try {
            File file = new File(classLoader.getResource("names.txt").toURI());
            Stream<String> fileLines = Files.lines(Paths.get(file.getPath()));
            fileLines.forEach(System.out::println);
        } catch (IOException e) {
            throw new FileReaderException();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("A am gonna be here... always!");
        }
    }

    public void readFile(final String fileName) throws FileReaderException{
        ClassLoader classLoader = getClass().getClassLoader();

        try (Stream<String> fileLines = Files.lines(Path.of(classLoader.getResource(fileName).toURI()));){
            fileLines.forEach(System.out::println);
        } catch (Exception e) {
            throw new FileReaderException();
//        } catch (URISyntaxException e) {
//            throw new RuntimeException(e);
        } finally {
            System.out.println("A am gonna be here... always!");
        }
    }
}
