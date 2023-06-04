package Algos.Roman_To_Integer;

class Solution {
    public int romanToInt(String s) {
        int y = 0;
        int len = s.length();
        for(int i=0; i< len; i++){
            char c = s.charAt(i);
            if(c == 'V') y += 5;
            else if(c == 'L')  y += 50;
            else if(c == 'D')  y += 500;
            else if(c == 'M')  y += 1000;
            else{ //Special cases for I, X, C because they can occur in combinations with others

                String char_pair = "";
                if(i+1 < len){
                    char_pair = new StringBuilder().append(s.charAt(i)).append(s.charAt(i+1)).toString();
                }

                if (c =='I'){
                    if (i+1 < len && char_pair.equals("IV")) {y += 4; i++;}
                    else if (i+1 < len && char_pair.equals("IX")) {y += 9; i++;}
                    else y += 1;
                }

                else if (c =='X'){
                    if (i+1 < len && char_pair.equals("XL")) {y += 40; i++;}
                    else if (i+1 < len && char_pair.equals("XC")) {y += 90; i++;}
                    else y += 10;
                }


                else if (c =='C'){
                    if (i+1 < len && char_pair.equals("CD")) {y += 400; i++;}
                    else if (i+1 < len && char_pair.equals("CM")) {y += 900; i++;}
                    else y += 100;
                }
            }

        }
        return y;
    }
}