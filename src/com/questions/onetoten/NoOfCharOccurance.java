package com.questions.onetoten;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NoOfCharOccurance {

    public static void main(String args[]){
        System.out.println(noOfOccurance("Sundar  Rajagopal"));
    }

    private static HashMap noOfOccurance(String name){
        //name  Sundar Rajagopal
        char[] chars= name.toCharArray();
        HashMap<Character, Integer> charCountMap
                = new HashMap<Character, Integer>();
        for (char c:chars){
            if(charCountMap.containsKey(c)){
                charCountMap.put(c,charCountMap.get(c)+1);
            }else{
                charCountMap.put(c,1);
            }
        }
        return charCountMap;
    }
}
