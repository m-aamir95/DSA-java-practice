package Algos.Arithmetic_SubArrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void leetcode_basecase_1(){
        Solution sol =  new Solution();

        int[] nums = new int[]{4,6,5,9,3,7};
        int[] l =  new int[]{0,0,2};
        int[] r =  new int[]{2,3,5};

        Boolean[] expected = new Boolean[]{true,false,true};
        Boolean[] result = sol.checkArithmeticSubarrays(nums, l, r).stream().toArray(Boolean[]::new);
        assertArrayEquals(expected, result);
    }

    @Test
    public void leetcode_basecase_2(){
        Solution sol =  new Solution();

        int[] nums = new int[]{-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10};
        int[] l =  new int[]{0,1,6,4,8,7};
        int[] r =  new int[]{4,4,9,7,9,10};

        Boolean[] expected = new Boolean[]{false,true,false,false,true,true};
        Boolean[] result = sol.checkArithmeticSubarrays(nums, l, r).stream().toArray(Boolean[]::new);
        assertArrayEquals(expected, result);
    }
}