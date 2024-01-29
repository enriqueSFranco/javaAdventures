package org.leetcode;

public class PrefixSum {
    private int[] prefixSum;

    public PrefixSum(int[] arr) {
        this.prefixSum = fillPrefixSum(arr);
    }

    public int[] fillPrefixSum(int[] arr) {
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }

    public int sumRange(int left, int right) {
        if (left < 0 || right >= this.prefixSum.length)
            throw new IllegalArgumentException("Índices no válidos");

        if (left == 0) return this.prefixSum[right];
        return this.prefixSum[right] - this.prefixSum[left - 1];
    }
}
