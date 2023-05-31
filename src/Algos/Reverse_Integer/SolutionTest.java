package Algos.Reverse_Integer;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void leetcode_basecase_1(){
        Solution sol = new Solution();
        int input = 123;
        int expected = 321;
        assertEquals(expected, sol.reverse(input));
    }

    @Test
    public void leetcode_basecase_2(){
        Solution sol = new Solution();
        int input = -123;
        int expected = -321;
        assertEquals(expected, sol.reverse(input));
    }

    @Test
    public void leetcode_basecase_3(){
        Solution sol = new Solution();
        int input = 120;
        int expected = 21;
        assertEquals(expected, sol.reverse(input));
    }
}