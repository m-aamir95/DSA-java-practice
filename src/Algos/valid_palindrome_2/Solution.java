package Algos.valid_palindrome_2;

class Solution {

        public boolean validPalindrome(String s) {

            int left = 0, right = s.length()-1;

            while(left < right){

                System.out.printf("%s | %s\n", s.charAt(left), s.charAt(right));
                if(s.charAt(left) != s.charAt(right)){

                    if(s.charAt(left+1) == s.charAt(right)) {
                        left++;
                    }
                    else if(s.charAt(left) == s.charAt(right-1)){
                        right--;
                    }
                    else{
                        return false;
                    }

                }else{
                    left++;
                    right--;
                }
            }
            return true;
        }

}