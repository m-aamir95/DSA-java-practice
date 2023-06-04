package Algos.container_with_most_water;

class Solution {
    //Two pointer approach
    public int maxArea(int[] height) {
        int left_ptr = 0, right_ptr = height.length -1;
        int max_area = 0;
        while(left_ptr < right_ptr){

            int curr_area = ((right_ptr - left_ptr)) * Math.min(height[left_ptr], height[right_ptr]);
            max_area = Math.max(curr_area, max_area);

            //Increment the lowest height
            if (height[left_ptr] > height[right_ptr])
                right_ptr--;
            else
                left_ptr++;

        }
        return max_area;
    }
}