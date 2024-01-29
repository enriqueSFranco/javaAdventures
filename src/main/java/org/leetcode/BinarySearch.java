package org.leetcode;

import java.util.Arrays;

public class BinarySearch {
    public int searchRecursive(int[] arr, int target, int start, int end) {

        if (end >= start) {
            int mid = (end + start) >>> 1;

            if (arr[mid] == target) return mid;
            if (arr[mid] < target) return searchRecursive(arr, target, mid + 1, end);
            return searchRecursive(arr, target, start, mid - 1);
        }
        return -1;
    }

    public int search(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
    // https://leetcode.com/problems/find-the-distance-value-between-two-arrays/description/
    public boolean cointainsValue(int[] arr, int key, int d) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (high + low) >>> 1;
            //{4, 5, 8} {1, 8, 9, 10}, d = 2
            if (Math.abs(key - arr[mid]) <= d) return true;
            else if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int distanceValue = 0;

        for (int num : arr1)
            if (!cointainsValue(arr2, num, d)) distanceValue++;

        return distanceValue;
    }
}
