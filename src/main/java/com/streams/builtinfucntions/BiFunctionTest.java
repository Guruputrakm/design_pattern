package com.streams.builtinfucntions;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.IntStream;

import static java.util.Arrays.stream;

public class BiFunctionTest {
    public static void main(String[] args) {
       /* String s1 = "abcj";
        String s2 = "acbj";
        if (s1.length() != s2.length()){
            return;
        }*/
        //Predicate< Integer> test = i -> s2.contains(s1.charAt(i)+"");
        //Validate if two strings are anagrams.
        BiPredicate<String , String> anagram =  (st1, st2 ) -> {
            if (st1.length() != st2.length()){
                return false;
            }
            st1 = st1.replace("\\s","").toLowerCase();
            st2 = st2.replace("\\s", "").toLowerCase();

            if(st1.length() != st2.length()) {
                return false;
            }
          /*  char[] map = new char[256];
            for (int i =0; i<st1.length(); i++){
                map[st1.charAt(i)]++;
                map[st2.charAt(i)]--;
            }

            for (int i =0; i<map.length; i++){
                if(map[i] != 0){
                    return false;
                }
            }*/

            char[] a = st1.toCharArray();
            char[] b = st2.toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);
            return Arrays.equals(a, b);
        } ;
        System.out.println(anagram.test("abcj", "jabc"));


        //Merge first and last names into uppercase full name, then append designation using andThen().
       BiFunction<String, String, String> mergeName = (s1, s2 ) -> s1+s2;
        Function<String, String > upperCase = String::toUpperCase;
        String string = mergeName.andThen(upperCase).apply("Guru", "putra");
        System.out.println(string);

        //Take two Lists (names & salaries), print “Name – Salary” pairs.
        List<String> names = List.of("GURU", "KIran", "XYZ");
        List<Integer> salaries = List.of(1000, 2000,3000);
        BiConsumer<String , Integer> mergeNameAndSal = (name, sal) -> System.out.println(name+"--"+sal);
        IntStream.range(0, 3).forEach(i -> mergeNameAndSal.accept(names.get(i), salaries.get(i)));
    }
}
