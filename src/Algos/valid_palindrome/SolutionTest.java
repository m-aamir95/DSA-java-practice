package Algos.valid_palindrome;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void leetcode_basecase_1(){

        Solution sol =  new Solution();

        String input = "A man, a plan, a canal: Panama";
        boolean expected_output = true;

        assertEquals(sol.isPalindrome(input), expected_output);
    }
}