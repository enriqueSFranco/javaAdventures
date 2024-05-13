package org.leetcode;

import java.util.Arrays;
import java.util.StringJoiner;

public class Solution {
    public int run(int[][] points) {
        int maxWidth = 0;
        Arrays.sort(points, (a, b) -> a[0] - b[0]);

        for (int x = 1; x < points.length; x++) {
            int diff = points[x][0] - points[x - 1][0];
            if (diff > maxWidth) maxWidth = diff; // maxWidth = Math.max(maxWidth, diff);
        }
        return maxWidth;
    }

    /*boolean flag = true;
        for (int value : ans) {
            if (!flag) System.out.print(",");
            System.out.print(value);
            flag = false;
        }

        Segunda opcion
         StringJoiner joiner = new StringJoiner(",", "[", "]");
        for (int value : ans)
            joiner.add(String.valueOf(value));
        System.out.print(joiner);

        */
}
