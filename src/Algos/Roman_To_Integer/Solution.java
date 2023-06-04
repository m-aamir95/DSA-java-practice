package Algos.Roman_To_Integer;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        int y = 0;
        int len = s.length();

        Map<String, Integer> roman_to_int =  new HashMap<>();
        roman_to_int.put("I", 1);
        roman_to_int.put("V", 5);
        roman_to_int.put("X", 10);
        roman_to_int.put("L", 50);
        roman_to_int.put("C", 100);
        roman_to_int.put("D", 500);
        roman_to_int.put("M", 1000);
        roman_to_int.put("IV", 4);
        roman_to_int.put("IX", 9);
        roman_to_int.put("XL", 40);
        roman_to_int.put("XC", 90);
        roman_to_int.put("CD", 400);
        roman_to_int.put("CM", 900);

        for(int i=0; i< len; i++){

            StringBuilder to_compare =  new StringBuilder();
            to_compare.append(s.charAt(i));

            y += roman_to_int.get(to_compare.toString());

            if(i+1 < len){
                to_compare.append(s.charAt(i+1));
                String pair = to_compare.toString();
                if (roman_to_int.containsKey(pair)){
                    i++; //because we are considering two characters instead of the regular one
                    y -= roman_to_int.get(pair.substring(0,1)); //Remove the single digit
                    y += roman_to_int.get(pair);
                }
            }


        }
        return y;
    }
}