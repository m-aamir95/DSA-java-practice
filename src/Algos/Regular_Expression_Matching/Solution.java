package Algos.Regular_Expression_Matching;

public class Solution {
    public boolean isMatch(String s, String p) {
        int i = s.length()-1;
        int j = p.length()-1;
        while (true){
            if (i < 0 && j < 0){ //string and pattern matched
                return true;
            }
            if (j < 0){ //not matched, because pattern exhausted but string is not
                return false;
            }

            //Gpt code
            if (i < 0){
                while (j >= 0 && p.charAt(j) == '*'){
                    j -= 2;
                }
                return j < 0; // if the pattern is also exhausted, it is a match, otherwise not
            }
            //gpt code end

            char curr_chr = s.charAt(i);
            char curr_pattern = p.charAt(j);

            if (curr_chr == curr_pattern || curr_pattern == '.'){
                i--;
                j--;
            }
            else if(curr_pattern == '*'){
                if (p.charAt(j-1) == curr_chr || p.charAt(j-1) == '.'){
                    i--;
                }else{
                    j -= 2;
                }
            }else {
                return false;
            }
        }
    }
}
