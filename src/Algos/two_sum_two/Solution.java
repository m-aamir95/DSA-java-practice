package Algos.two_sum_two;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length-1;
        while(left < right){

            int s = numbers[left] + numbers[right];
            if(s == target) return new int[]{left+1, right+1};
            else if(s > target) right--;
            else left++;

        }
        return new int[]{0,0};
    }
}