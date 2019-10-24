package com.solution.ctci.chp1;

//URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string
//has sufficient space at the end to hold the additional characters, and that you are given the "true"
//length of the string. (Note: If implementing in Java, please use a character array so that you can
//perform this operation in place.)
//EXAMPLE
//Input: "Mr 3ohn Smit h 13
//Output: "Mr%203ohn%20Smith" 
public class solution3 {
    
    public static String URLify1(String ip){
        StringBuilder sb = new StringBuilder();
        String toAdd = "%20";
        
        for(char c : ip.toCharArray()){
            if(c == ' '){
                sb.append(toAdd);
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
    
    public static char[] URLify2(char[] string, int trueLength){
        int spaceCount = 0;
        
        for (int i = 0; i < trueLength; i++) {
            if(string[i] == ' ') spaceCount++;            
        }
        
        int index = trueLength + 3 * spaceCount;
        
        for (int i = trueLength - 1; i >=0 ; i--) {
            if(string[i] != ' '){
                string[index - 1] = string[i];
                index--;
            }else if (string[i] == ' '){
                string[index - 1] = '0';
                string[index - 2] = '2';
                string[index - 3] = '%';
                index = index - 3;
            }            
        }
        return string;
    }
    
    public static void main(String[] args) {
        String input = "Mr 3ohn Smith";
        System.out.println(URLify1(input));
        
        char[] ip = {'h','i',' ','m','a','y','a','n','k',' ',' ',' '};
        
        System.out.println(URLify2(ip, 9));
    }
    
}
