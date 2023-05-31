package Algos.Reverse_Integer;

class Solution {
    public int reverse(int x) {
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;

            // Handle overflow
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7))
                return 0; // Return 0 for overflow cases

            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8))
                return 0; // Return 0 for overflow cases

            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return reversed;
    }
}