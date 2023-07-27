package Algos.valid_palindrome;

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0, right = s.length() -1;
        while(left < right){
            while(left < right && !validCharacter(s, left)) left++;
            while(right > left && !validCharacter(s, right)) right--;

            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;

        }
        return true;
    }

    private boolean validCharacter(String s, int index){
        int charCode = (int)s.charAt(index);
        return (charCode >= (int)'A' && charCode <= (int)'Z') ||
                (charCode >= (int)'a' && charCode <= (int)'z') ||
                (charCode >= (int)'0' && charCode <= (int)'9');
    }
}