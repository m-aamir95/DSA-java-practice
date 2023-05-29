package Algos.Longest_Palindrome_String;

class Solution {

    //O(n^2) solution inspired by neetcode youtube
    //https://www.youtube.com/watch?v=XYQecbcd6_c

    /*
    * Instead of using three loops, this approach skips the innermost loop
    * We intelligently check if a given character at index `i` is part of a longer palindrome
    * By continuously expanding the search space around the character outwards (left and right)
    * */
    public String longestPalindrome(String s) {

        String longest_substring_palindrome = "";
        int longest_palindrome_length = 0;

        for (int i = 0; i < s.length(); i++) {

            //Handle the odd case, when the substring palindrome is odd length
            int left_ptr = i, right_ptr = i;
            while ((left_ptr >= 0 && right_ptr < s.length()) && (s.charAt(left_ptr) == s.charAt(right_ptr))){

                String sub_palindrome = s.substring(left_ptr, right_ptr+1);
                if ((right_ptr - left_ptr + 1) > longest_palindrome_length){
                    longest_substring_palindrome = sub_palindrome;
                    longest_palindrome_length = sub_palindrome.length();
                }

                left_ptr--;
                right_ptr++;
            }

            //Handle the case when the substring palindrome is even length
            //Handle the odd case, when the substring palindrome is odd length
            left_ptr = i;
            right_ptr = i+1;
            while ((left_ptr >= 0 && right_ptr < s.length()) && (s.charAt(left_ptr) == s.charAt(right_ptr))){

                String sub_palindrome = s.substring(left_ptr, right_ptr+1);
                if ((right_ptr - left_ptr + 1) > longest_palindrome_length){
                    longest_substring_palindrome = sub_palindrome;
                    longest_palindrome_length = sub_palindrome.length();
                }

                left_ptr--;
                right_ptr++;
            }

        }
        return longest_substring_palindrome;
    }
}