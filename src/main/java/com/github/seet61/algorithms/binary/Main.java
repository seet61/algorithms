package com.github.seet61.algorithms.binary;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(binarySearch(Arrays.asList(), 0));
        System.out.println(binarySearch(Arrays.asList(), null));
        System.out.println(binarySearch(Arrays.asList(-1), 1));
        //System.out.println(binarySearch(Arrays.asList(-1, 0), -2));
        System.out.println(binarySearch(Arrays.asList(0, 1, 2, 3), 2));
        System.out.println(binarySearch(Arrays.asList(0, 1, 2, 3), 8));
        //System.out.println(binarySearch(Arrays.asList(0, -1, -2, -3), null));
    }

    private static Boolean binarySearch(List<Integer> array, Integer target) {
        System.out.println(array);
        int leftIdx = 0;
        int rightIdx = array.size();
        while (leftIdx < rightIdx) {
            int midIdx = (leftIdx + rightIdx) / 2;
            if (array.get(midIdx) == target) {
                return Boolean.TRUE;
            } else if (array.get(midIdx) < target) {
                leftIdx = midIdx + 1;
            } else {
                leftIdx = midIdx;
            }
        }
        return Boolean.FALSE;
    }
}
