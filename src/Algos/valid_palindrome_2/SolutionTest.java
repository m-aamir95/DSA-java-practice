package Algos.valid_palindrome_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void leetcode_testcase_462(){

        Solution sol =  new Solution();

        String input = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
        boolean expected_output = true;

        assertEquals(expected_output, sol.validPalindrome(input));
    }
}