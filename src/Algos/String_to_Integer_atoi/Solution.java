package Algos.String_to_Integer_atoi;

class Solution {
    public int myAtoi(String s) {
        s = s.trim();

        if (s.length() == 0) return 0; // Empty string case

        if (s.charAt(0) != '-' && s.charAt(0) != '+' && !valid_digit(s, 0)) return 0; // Non-numeric values case

        // Check for sign
        int sign = +1;
        int i = 0;
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            sign = s.charAt(0) == '-' ? -1 : +1;
            i++; // Because sign is present at index 0, skip it
        }

        int parsed_int = 0;
        while (i < s.length() && valid_digit(s, i)) {
            int parsed_digit = s.charAt(i) - '0';

            // Arithmetic Overflow Check
            if (parsed_int > Integer.MAX_VALUE / 10 || (parsed_int == Integer.MAX_VALUE / 10 && parsed_digit > Integer.MAX_VALUE % 10)) {
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            parsed_int = parsed_int * 10 + parsed_digit;
            i++;
        }

        return sign * parsed_int;
    }

    private boolean valid_digit(String s, int i) {
        return (s.charAt(i) >= '0') && (s.charAt(i) <= '9');
    }
}
