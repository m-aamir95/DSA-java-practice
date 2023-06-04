package Algos.container_with_most_water;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void leetcode_basecase_1(){
        Solution sol = new Solution();

        int[] input = new int[]{1,8,6,2,5,4,8,3,7};
        int expected = 49;
        assertEquals(expected, sol.maxArea(input));
    }

    @Test
    public void leetcode_basecase_2(){
        Solution sol = new Solution();

        int[] input = new int[]{1,1};
        int expected = 1;
        assertEquals(expected, sol.maxArea(input));
    }



}