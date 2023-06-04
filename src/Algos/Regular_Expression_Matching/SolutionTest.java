package Algos.Regular_Expression_Matching;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void leetcode_basecase_1(){
        Solution sol = new Solution();
        String input = "aa";
        String pattern = "a";
        assertFalse(sol.isMatch(input,pattern));
    }

    @Test
    public void leetcode_basecase_2(){
        Solution sol = new Solution();
        String input = "aa";
        String pattern = "a*";
        assertTrue(sol.isMatch(input,pattern));
    }

    @Test
    public void leetcode_basecase_3(){
        Solution sol = new Solution();
        String input = "ab";
        String pattern = ".*";
        assertTrue(sol.isMatch(input,pattern));
    }

    @Test
    public void leetcode_basecase_4(){
        Solution sol = new Solution();
        String input = "mississippi";
        String pattern = "mis*is*p*.";
        assertFalse(sol.isMatch(input,pattern));
    }

    @Test
    public void leetcode_basecase_5(){
        Solution sol = new Solution();
        String input = "aaa";
        String pattern = "ab*a*c*a";
        assertTrue(sol.isMatch(input,pattern));
    }
}