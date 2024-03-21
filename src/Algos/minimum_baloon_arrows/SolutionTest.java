package Algos.minimum_baloon_arrows;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void leetcode_basecase_1(){
        Solution sol =  new Solution();

        int[][] test_intervals = new int[][]{
                {10,16}, {2,8}, {1,6}, {7,12}
        };

        int minimum_arrows_expected = 2;
        int minimum_arrows_to_pop_baloons = sol.findMinArrowShots(test_intervals);
        assertEquals(minimum_arrows_expected, minimum_arrows_to_pop_baloons);
    }

    @Test
    public void leetcode_basecase_2(){
        Solution sol = new Solution();

        int[][] test_intervals = new int[][]{
                {1, 2}, {3, 4}, {5, 6}, {7, 8}
        };

        int minimum_arrows_expected = 4;
        int minimum_arrows_to_pop_balloons = sol.findMinArrowShots(test_intervals);
        assertEquals(minimum_arrows_expected, minimum_arrows_to_pop_balloons);
    }

    @Test
    public void leetcode_basecase_3(){
        Solution sol = new Solution();

        int[][] test_intervals = new int[][]{
                {1, 2}, {2, 3}  , {3, 4}, {4, 5}
        };

        int minimum_arrows_expected = 2;
        int minimum_arrows_to_pop_balloons = sol.findMinArrowShots(test_intervals);
        assertEquals(minimum_arrows_expected, minimum_arrows_to_pop_balloons);
    }

    @Test
    public void leetcode_submit_case_1(){
        Solution sol = new Solution();

        int[][] test_intervals = new int[][]{
                {-2147483646, -2147483645}, {2147483646, 2147483647}
        };

        int minimum_arrows_expected = 2;
        int minimum_arrows_to_pop_balloons = sol.findMinArrowShots(test_intervals);
        assertEquals(minimum_arrows_expected, minimum_arrows_to_pop_balloons);
    }

}