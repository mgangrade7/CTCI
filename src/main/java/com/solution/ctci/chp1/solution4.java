package com.solution.ctci.chp1;

/**
Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation
is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
EXAMPLE
Input: Tact Coa
Output: True (permutations : "taco cat" , "atco eta" , etc. ) 
 */
public class solution4 {
    
    public static int getHash(char c){
        return c - 'a';
    }
    
    public static boolean check(String str){
        int evenCount = 0;
        int oddCount = 0;
        int[] countArr = new int[26];
        
        for(char c : str.toLowerCase().toCharArray()){
            if(c != ' ') countArr[getHash(c)]++;
        }
        
        for (int i = 0; i < countArr.length; i++) {
            if(countArr[i] % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        
        return ((evenCount>0 && oddCount <=1) ? true : false);
    }
    
    public static void main(String[] args) {
        
        System.out.println(check("ma ya nk kn ay am"));
        
    }
            
}
