package com.example;

import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";
        String s1 = reverseWithSingleDot(s);
        System.out.println(s1);

        s = "..home..sweet.home.";
        String s2 = reverseWithSingleDot(s);
        System.out.println(s2);

        s = "...home......";
        String s3 = reverseWithSingleDot(s);
        System.out.println(s3);
    }

    public static String reverseWithSingleDot(String s) {
        String[] split = s.split("\\.");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = split.length-1; i >= 0 ; i--) {
            if(split[i] != "") {
                stringBuilder.append(split[i]).append(".");
            }

        }
        String string1 = stringBuilder.toString();
        return string1.substring(0, string1.length() - 1);

    }

    //”..home..sweet.home.”
    public static String reverseWithTwoAndOneDot(String s) {
        String[] split = s.split("\\.");
        String[] split1 = s.split("\\..");
        return  "";
    }
}
