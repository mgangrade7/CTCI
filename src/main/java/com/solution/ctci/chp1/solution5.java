package com.solution.ctci.chp1;

/**
 *
 * @author gangrade.m
 */
public class solution5 {
    public static boolean oneEditAway(String s1, String s2){
        int misMatchFOund = 0;
        
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)){
                misMatchFOund++;
                if(misMatchFOund > 1) return false;                
            }
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        
        System.out.println(oneEditAway("gota", "gotu"));
        
        
    }
}
