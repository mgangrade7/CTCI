package com.solution.ctci.chp1;

import java.util.Arrays;

/**
 * Check Permutation: Given two strings, write a method to decide if one is a permutation of the
 * other.
 */
public class solution2 {
    
    public static boolean isPermutation1(String s1, String s2){
        
        if(s1.length() != s2.length()) return false;
        
        int[] position = new int[256];
        
        for (int i = 0; i < s1.length(); i++) {
            int val = s1.charAt(i);
            position[val]++;            
        }
        
        for (int i = 0; i < s2.length(); i++) {
            int val = s2.charAt(i);
            position[val]--;            
            if(position[val] < 0) return false;                    
        }        
        return true;        
    }
    
    public static String sortArray(String s){
        char[] tempArray = s.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
    public static boolean isPermutation2(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        return sortArray(s1).equals(sortArray(s2));
    }
    
    public static void main(String[] args) {
        
        String s1 = "hello";
        String s2 = "loleh";
        String s3 = "helos";
        
        System.out.println(isPermutation1(s1, s2));  // true
        System.out.println(isPermutation1(s1, s3));  // false
        
        System.out.println(isPermutation2(s1, s2));  // true
        System.out.println(isPermutation2(s1, s3));  // false
     }
    
}
