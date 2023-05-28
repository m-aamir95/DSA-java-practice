package Algos.Merge_sorted_array;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int smallest_arr_size = Math.min(m, n);

        int temp_arr[] =  new int[m + n];
        int arr1_index = 0;
        int arr2_index = 0;
        int merge_index = 0;
        while((arr1_index < m) && (arr2_index < n)){
            if (nums1[arr1_index] <= nums2[arr2_index]){
                temp_arr[merge_index++] = nums1[arr1_index++];
            }else{
                temp_arr[merge_index++] = nums2[arr2_index++];
            }
        }

        //push in the remaining elements from any of the arrays
        if (arr1_index < m){
            for (int i=arr1_index; i < m; i++){
                temp_arr[merge_index++] = nums1[i];
            }
        }
        if (arr2_index < n){
            for (int i=arr2_index; i < n; i++){
                temp_arr[merge_index++] = nums2[i];
            }
        }

        //copy from temp to num1
        System.arraycopy(temp_arr ,0,nums1, 0, temp_arr.length);
    }
}
