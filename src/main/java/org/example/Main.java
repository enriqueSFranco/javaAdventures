package org.example;

import org.leetcode.PrefixSum;
import org.leetcode.Solution;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{8,2}, {9,9}, {7,4}, {9,7}};
        Solution sol = new Solution();
        // [[8,7],[9,9],[7,4],[9,7]
        System.out.print(sol.run(arr));
    }
}