package com.solution.ctci.chp1;

import java.util.HashMap;
import java.util.Map;

/**
String Compression: Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become a2blc5a3, If the
"compressed" string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z).
Hints: #92, if 110 

 */
public class solution6 {

    public static String compress(String input) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        
        for (int i = 0; i < input.length(); i++) {
            sum++;
            if(i + 1 >= input.length() || input.charAt(i) != input.charAt(i+1)){
                sb.append(input.charAt(i)+""+sum);
                sum = 0;
            }
        }
        return ((sb.toString().length() < input.length()) ? sb.toString() : input);
    }

    public static void main(String[] args) {
        
        String test = "aaabb";
        StringBuilder sb = new StringBuilder();
        
        int sum = 0;
        for (int i = 0; i < test.length(); i++) {
            sum++;
            if(i + 1 >= test.length() || test.charAt(i) != test.charAt(i+1)){
                sb.append(test.charAt(i)+""+sum);
                sum = 0;
            }
        }
        
        System.out.println(compress("aaassssdddddaaasrrr"));
    }

}
