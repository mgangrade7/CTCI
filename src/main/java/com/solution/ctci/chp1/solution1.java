package com.solution.ctci.chp1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class solution1 {
    public static boolean isUnique1(String ip){
        for (int i = 0; i < ip.length(); i++) {
            for (int j = i+1; j < ip.length(); j++) {
                if(ip.charAt(i) == ip.charAt(j)) return false;
            }            
        }
        return true;
    }
    
    public static boolean isUnique2(String ip){
        ArrayList<Character> list = new ArrayList<>();
        
        for(char c : ip.toCharArray()){
            if(list.contains(c)){
                return false;
            }else {
                list.add(c);
            }
        }
        return true;
    }
    
    public static boolean isUnique3(String ip){
        Set<Character> set = new HashSet<>();
        
        for(char c : ip.toCharArray()){
            set.add(c);
        }
        
        return ((set.size() == ip.length()));
    }
    
    public static void main(String[] args) {
        
//        input
        String input1 = "asdf";
        String input2 = "asdfgsd";
        
        System.out.println(isUnique1(input1)); //true
        System.out.println(isUnique1(input2)); //false
        
        System.out.println(isUnique2(input1)); //true
        System.out.println(isUnique2(input2)); //false
        
        System.out.println(isUnique3(input1)); //true
        System.out.println(isUnique3(input2)); //false
        
        
    }
    
}
