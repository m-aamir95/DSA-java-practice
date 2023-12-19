package Algos.smooth_image;

class Solution {
    public int[][] imageSmoother(int[][] img) {



        int r = img.length;
        int c = img[0].length;

        int[][] output_img = new int[r][c];
        //Visit every pixel 
        for(int rows = 0; rows < r; rows++){
            for(int cols = 0; cols < c; cols++){

                int local_total = 0;
                int pixels_in_avg = 0; //could vary depending on our current i,j location
                //Try to average a smaller 3x3 matrix at current i,j
                for(int i=rows-1; i < rows+2; i++){
                    for(int j=cols-1; j < cols+2; j++){

                        // System.out.printf("Row=%d, Col=%d, i=%d, j=%d\n", rows, cols, i, j);
                        if (i >= 0 && j >= 0 && i < r && j < c){
                            local_total += img[i][j];
                            pixels_in_avg++;
                        }
                    }
                }

                output_img[rows][cols] = (int)Math.floor(local_total / pixels_in_avg);
            }
        }

        return output_img;
    }
}