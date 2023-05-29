package Algos.Median_of_two_sorted_arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void leetcode_basecase_1(){

        Solution sol  =  new Solution();

        int[] nums1 = new int[] {1,3};
        int[] nums2 = new int[] {2};
        double expected_result = 2.0;

        assertEquals(expected_result, sol.findMedianSortedArrays(nums1, nums2), 0.0);
    }

    @Test
    public void leetcode_basecase_2(){

        Solution sol  =  new Solution();

        int[] nums1 = new int[] {1,2};
        int[] nums2 = new int[] {3,4};
        double expected_result = 2.5;

        assertEquals(expected_result, sol.findMedianSortedArrays(nums1, nums2), 0.0);
    }

    @Test
    public void leetcode_basecase_3(){

        Solution sol  =  new Solution();

        int[] nums1 = new int[] {0,0};
        int[] nums2 = new int[] {0,0};
        double expected_result = 0.0;

        assertEquals(expected_result, sol.findMedianSortedArrays(nums1, nums2), 0.0);
    }

    @Test
    public void leetcode_basecase_4(){

        Solution sol  =  new Solution();

        int[] nums1 = new int[] {};
        int[] nums2 = new int[] {1};
        double expected_result = 1.0;

        assertEquals(expected_result, sol.findMedianSortedArrays(nums1, nums2), 0.0);
    }

    @Test
    public void leetcode_basecase_5(){

        Solution sol  =  new Solution();

        int[] nums1 = new int[] {2};
        int[] nums2 = new int[] {};
        double expected_result = 2.0;

        assertEquals(expected_result, sol.findMedianSortedArrays(nums1, nums2), 0.0);
    }

    @Test
    public void leetcode_basecase_6(){

        Solution sol  =  new Solution();

        int[] nums1 = new int[] {3,4};
        int[] nums2 = new int[] {};
        double expected_result = 3.5;

        assertEquals(expected_result, sol.findMedianSortedArrays(nums1, nums2), 0.0);
    }


}