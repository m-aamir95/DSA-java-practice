package Algos.two_sum_two;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void leetcode_basecase_1(){
        Solution sol = new Solution();
        int[] input =  new int[]{2,7,11,15};
        int[] expected = new int[]{1,2};
        int target = 9;
        assertArrayEquals(expected, sol.twoSum(input, target));
    }

    @Test
    public void leetcode_basecase_2(){
        Solution sol = new Solution();
        int[] input =  new int[]{2,3,4};
        int[] expected = new int[]{1,3};
        int target = 6;
        assertArrayEquals(expected, sol.twoSum(input, target));
    }

    @Test
    public void leetcode_basecase_3(){
        Solution sol = new Solution();
        int[] input =  new int[]{-1,0};
        int[] expected = new int[]{1,2};
        int target = -1;
        assertArrayEquals(expected, sol.twoSum(input, target));
    }

}