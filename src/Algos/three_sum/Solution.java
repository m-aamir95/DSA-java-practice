package Algos.three_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1])continue;
            int left = i+1, right = nums.length-1;
            while (left < right){

                int r = nums[i] + nums[left] + nums[right];
                if (r == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    //Left pointer can't point to duplicate values
                    //So if there is one, skip it
                    while (left < right && nums[left] == nums[left-1])left++;
                }
                else if (r > 0) right--;
                else left++;

            }
        }
        return result;
    }
}
