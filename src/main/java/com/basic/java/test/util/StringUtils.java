package com.basic.java.test.util;

public class StringUtils {

    public static String repeat(String string,int times){
        if (times<0){
            throw  new IllegalArgumentException("times parameter can not be negative");
        }
        String result = "";
        for (int i = 0; i < times; i++) {
            result +=string;
        }
        return  result;

    }
}
