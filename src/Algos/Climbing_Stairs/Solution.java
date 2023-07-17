package Algos.Climbing_Stairs;

import java.util.HashMap;
import java.util.Map;

class Solution {

    private Map<Integer, Integer> previously_computed_nums_cache =  new HashMap<>();
    public int climbStairs(int n) {
        return climbStairsRecursiveCore(0, n);
    }

    private int climbStairsRecursiveCore(int curr_n, int target_n){

        if (curr_n == target_n) return 1;
        else if(curr_n > target_n) return 0;

        int add_one, add_two;

        if (previously_computed_nums_cache.containsKey(curr_n+1)) add_one = previously_computed_nums_cache.get(curr_n+1);
        else {
            add_one = climbStairsRecursiveCore(curr_n+1, target_n);
            previously_computed_nums_cache.put(curr_n+1, add_one);
        }

        if (previously_computed_nums_cache.containsKey(curr_n+2)) add_two = previously_computed_nums_cache.get(curr_n+2);
        else {
            add_two = climbStairsRecursiveCore(curr_n+2, target_n);
            previously_computed_nums_cache.put(curr_n+2, add_two);
        }

        return add_one + add_two;
    }
}