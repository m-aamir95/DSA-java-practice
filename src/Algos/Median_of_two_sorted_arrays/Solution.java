package Algos.Median_of_two_sorted_arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int median_index = (nums1.length + nums2.length-1) / 2;
      boolean even_index_case = (nums1.length + nums2.length) % 2 == 0;

      int i = 0, num1_index = 0, num2_index = 0;
      double median_tr = 0.0;
      while (i <= median_index){

          double picked_value = 0.0;

          if ((num1_index < nums1.length) && (num2_index < nums2.length) &&  (nums1[num1_index] < nums2[num2_index])){
              picked_value = nums1[num1_index++];
          } else if ((num1_index < nums1.length) && (num2_index < nums2.length) && (nums1[num1_index] > nums2[num2_index])) {
              picked_value = nums2[num2_index++];
          }else if (num1_index < nums1.length){
              picked_value = nums1[num1_index++];
          }else if (num2_index < nums2.length){
              picked_value = nums2[num2_index++];
          }


          if (i == median_index){
              if (even_index_case){

                  double second_picked_value = 0.0;
                  if ((num1_index < nums1.length) && (num2_index < nums2.length) &&  (nums1[num1_index] < nums2[num2_index])){
                      second_picked_value = nums1[num1_index++];
                  } else if ((num1_index < nums1.length) && (num2_index < nums2.length) && (nums1[num1_index] > nums2[num2_index])) {
                      second_picked_value = nums2[num2_index++];
                  }else if (num1_index < nums1.length){
                      second_picked_value = nums1[num1_index++];
                  }else if (num2_index < nums2.length){
                      second_picked_value = nums2[num2_index++];
                  }

                  median_tr = (picked_value + second_picked_value) / 2;
                  break;
              }else{
                  median_tr = picked_value;
                  break;
              }
          }
          i++;
      }
      return median_tr;
    }
}