package Algos.letter_combination_of_a_phone_number;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void leetcode_basecase_1(){
        Solution sol =  new Solution();
        String digits = "23";
        String[] expected =  new String[]{
                "ad","ae","af","bd","be","bf","cd","ce","cf"
        };
        String[] result = sol.letterCombinations(digits).stream().toArray(String[]::new);
        assertArrayEquals(expected, result);
    }

    @Test
    public void leetcode_basecase_2(){
        Solution sol =  new Solution();
        String digits = "";
        String[] expected =  new String[]{};
        String[] result = sol.letterCombinations(digits).stream().toArray(String[]::new);
        assertArrayEquals(expected, result);
    }


    @Test
    public void leetcode_basecase_3(){
        Solution sol =  new Solution();
        String digits = "2";
        String[] expected =  new String[]{"a","b","c"};
        String[] result = sol.letterCombinations(digits).stream().toArray(String[]::new);
        assertArrayEquals(expected, result);
    }

}

