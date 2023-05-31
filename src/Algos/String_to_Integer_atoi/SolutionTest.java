package Algos.String_to_Integer_atoi;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void leetcode_basecase_1(){
        Solution sol =  new Solution();
        String input = "42";
        int expected = 42;
        assertEquals(expected, sol.myAtoi(input));
    }

    @Test
    public void leetcode_basecase_2(){
        Solution sol =  new Solution();
        String input = "   -42";
        int expected = -42;
        assertEquals(expected, sol.myAtoi(input));
    }

    @Test
    public void leetcode_basecase_3(){
        Solution sol =  new Solution();
        String input = "4193 with words";
        int expected = 4193;
        assertEquals(expected, sol.myAtoi(input));
    }

    @Test
    public void leetcode_basecase_4(){
        Solution sol =  new Solution();
        String input = "words and 987";
        int expected = 0;
        assertEquals(expected, sol.myAtoi(input));
    }

    @Test
    public void leetcode_basecase_5(){
        Solution sol =  new Solution();
        String input = "-91283472332";
        int expected = -2147483648; //Arithmetic underflow return the minimum value representable by an INT
        assertEquals(expected, sol.myAtoi(input));
    }

    @Test
    public void leetcode_basecase_6(){
        Solution sol =  new Solution();
        String input = "+1";
        int expected = 1; //Arithmetic underflow return the minimum value representable by an INT
        assertEquals(expected, sol.myAtoi(input));
    }

    @Test
    public void leetcode_basecase_7(){
        Solution sol =  new Solution();
        String input = "21474836460";
        int expected =  2147483647; //Arithmetic underflow return the minimum value representable by an INT
        assertEquals(expected, sol.myAtoi(input));
    }

}