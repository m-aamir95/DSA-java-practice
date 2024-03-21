package Algos.minimum_baloon_arrows;

import java.util.Arrays;

public class Solution {

    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points, (a, b) -> Long.compare((long) a[0], (long) b[0]));

        long[] prev = {points[0][0], points[0][1]};
        int arrows = 1;
        for (int i = 1; i < points.length; i++) {

            long[] curr = {points[i][0], points[i][1]};
            if (curr[0] <= prev[1]) { // current interval start is less than or equal to previous interval end
                // We have found an overlapping interval, let's merge it
                prev[0] = curr[0];
                prev[1] = Math.min(curr[1], prev[1]);

            } else {
                prev[0] = curr[0];
                prev[1] = curr[1];
                arrows += 1;
            }
        }

        return arrows;
    }
}
