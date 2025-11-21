package com.streams.newpackege;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Excercise2 {
    public static void main(String[] args)  {

        URL resource = Excercise2.class.getClassLoader().getResource("Test1.txt");
        try(Stream<String> stringStream = Files.lines(Path.of(resource.toURI())).filter(s -> s.length()<50)) {
            stringStream.forEach(System.out::println);
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
