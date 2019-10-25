
package com.solution.ctci.chp1;

/**
 *
 * @author gangrade.m
 */
public class solution9 {
    
    public static boolean isRotation(String s1, String  s2){
        
        String concat_s1 = s1.concat(s1);
        
        return concat_s1.contains(s2) ? true : false;   // contains => isSubstring
        
    }
    
    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        System.out.println(isRotation(s1, s2));
    }
}
