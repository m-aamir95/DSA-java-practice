package Algos.Roman_To_Integer;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {


    @Test
    public void leetcode_basecase_1(){
        Solution sol =  new Solution();
        String input = "III";
        int expected = 3;
        assertEquals(expected, sol.romanToInt(input));
    }


    @Test
    public void leetcode_basecase_2(){
        Solution sol =  new Solution();
        String input = "LVIII";
        int expected = 58;
        assertEquals(expected, sol.romanToInt(input));
    }

    @Test
    public void leetcode_basecase_3(){
        Solution sol =  new Solution();
        String input = "MCMXCIV";
        int expected = 1994;
        assertEquals(expected, sol.romanToInt(input));
    }


}