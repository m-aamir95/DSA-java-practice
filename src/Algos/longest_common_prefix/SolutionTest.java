package Algos.longest_common_prefix;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void leetcode_basecase_1(){
        String[] strs =  new String[]{
            "flower", "flow", "flight"
        };

        Solution sol =  new Solution();

        assertEquals("fl", sol.longestCommonPrefix(strs));
    }

    @Test
    public void leetcode_basecase_2(){
        String[] strs =  new String[]{
                "dog", "racecar", "car"
        };

        Solution sol =  new Solution();

        assertEquals("", sol.longestCommonPrefix(strs));
    }

}