
package com.solution.other;

import java.util.HashMap;
import java.util.Map;

/**
 * Number of each type of character in a string
 * 
 */
public class solution1 {
    public static String compress(String input) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (map.containsKey(c)) {
                int val = map.get(c);
                map.put(c, val+1);
            } else {
                map.put(c, 1);
            }
        }
        
        for(Map.Entry me : map.entrySet()){
//            System.out.println(me.getKey()+"" + me.getValue());
            sb.append(me.getKey()+"" + me.getValue());
        }

//        map.forEach((k, v) -> sb.append(k + v));
        return ((sb.toString().length() < input.length()) ? sb.toString() : input);
    }

    public static void main(String[] args) {
        
        System.out.println(compress("aabccccaaa"));
    }

}
