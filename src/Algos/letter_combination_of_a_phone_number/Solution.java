package Algos.letter_combination_of_a_phone_number;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result =  new ArrayList<>();

        if (digits.length() == 0) return result;

        //digit to character-set mapping
        String[] mapping =  new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        backTrackingPermutations(0,"", mapping, digits, result);

        return result;
    }

    private void backTrackingPermutations(int index,
                                          String curr_permutation,
                                          String[] mappings,
                                          String digits,
                                          List<String> result){

        if (curr_permutation.length() == digits.length()){
            result.add(curr_permutation);
            return;
        }

        //characters mapping for the current digit
        char[] chars = mappings[digits.charAt(index) - '0'].toCharArray();
        //Recursive backtracking
        for(int i=0 ;i < chars.length; i++){
            backTrackingPermutations(index+1,
                    curr_permutation+ String.valueOf(chars[i]),
                    mappings, digits,
                    result
                    );
        }

    }
}