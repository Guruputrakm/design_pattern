package com.test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
       /* String num = 10+"";
        Integer integer = Integer.getInteger(num);
        System.out.println(integer);*/
        int i = ConvertToInt("-10");
        System.out.println(i);
    }

    public static int ConvertToInt(String num){
        int n =0;
        for (int i =0; i< num.length(); i++){
            char c = 0;
            if(num.charAt(0) != 45) {
                int number = (int) num.charAt(i) - 48;// Decimal Conversion
                //   number = c%10; //Digit
                n = n * 10 + number;//
            } else {
                c = num.charAt(i+1);
                int number = (int) c - 48;// Decimal Conversion
                //   number = c%10; //Digit
                n = n * 10 + number;

            }
            // "10"
            //1
            //1
            //10+1
        }
        return n;

 /*       int asInt = IntStream.range(0, num.length())
                .boxed()
                .mapToInt(c -> c.intValue())
                .reduce((a, b) -> a + b).getAsInt();*/
    }
}
