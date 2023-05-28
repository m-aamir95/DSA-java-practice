package Algos.Merge_sorted_array;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void leetcode_basecase(){
        Solution sol =  new Solution();

        int[] a = new int[]{1,2,3,0,0,0};
        int m = 3;

        int[] b =  new int[]{2,5,6};
        int n = 3;

        //Resultant array will be placed into `a` as required by the leetcode problem
        sol.merge(a,m,b,n);

        int []expect_result = new int[]{1,2,2,3,5,6};
        assertArrayEquals(expect_result, a);
    }
}