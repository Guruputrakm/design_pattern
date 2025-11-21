package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DelcartiveVSImparative {
    public static void main(String[] args) {
        System.out.println(filterNameWithGDeclartive(new String[]{"Guru", "Durga", "Shiva", "Mahesh"}));
        System.out.println(filterNameWithImparative(new String[]{"Guru", "Durga", "Shiva", "Mahesh"}));
    }

    public static List<String> filterNameWithGDeclartive(String[] names) {
        List<String> filterNames = new ArrayList<>();
        for (String name: names) {
            if(name.startsWith("G")) {
                filterNames.add(name);
            }
        }
        return filterNames;
    }

    public static String[] filterNameWithImparative(String[] names) {
        return (String[]) Stream.of(names).filter(s -> s.startsWith("G")).toList().toArray();
    }
}
