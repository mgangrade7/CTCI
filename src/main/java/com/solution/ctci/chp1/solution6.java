package com.solution.ctci.chp1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author gangrade.m
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
