package Algos.Arithmetic_SubArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {

        List<Boolean> results = new ArrayList<>(l.length);

        for (int i=0; i < l.length; i++){

            if ((r[i] - l[i]) < 2){
                results.add(true);
                continue;
            }

            int[] sub_sequence = Arrays.copyOfRange(nums, l[i], r[i]+1);
            Arrays.sort(sub_sequence);
            int diff = sub_sequence[1] - sub_sequence[0];
            boolean to_insert = true;
            for (int j=2; j < sub_sequence.length; j++){
                if (diff != (sub_sequence[j] - sub_sequence[j-1])){
                    to_insert = false;
                    break;
                }
            }
            results.add(to_insert);
        }

        return results;
    }
}