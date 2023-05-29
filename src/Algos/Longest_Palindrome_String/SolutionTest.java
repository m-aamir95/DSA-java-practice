package Algos.Longest_Palindrome_String;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void leetcode_basecase_1(){
        Solution sol =  new Solution();

        String input = "babad";
        String output = "bab";

        assertEquals(output, sol.longestPalindrome(input));
    }

    @Test
    public void leetcode_basecase_2(){
        Solution sol =  new Solution();

        String input = "cbbd";
        String output = "bb";

        assertEquals(output, sol.longestPalindrome(input));
    }
}