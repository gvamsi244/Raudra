package Hashing;

import java.util.*;

/**
 * @author Vamsi Krishna Govada on 8/15/2020.
 * @project Raudra
 */

// Given an array a count the distinct elements in all windows of size K

public class Solution4 {
    private static int[] countDistinct(int[] arr, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int len = arr.length;
        int count = 0;
        int output[] = new int[len - k + 1];
        for (int i = 0; i < k; i++) {
            if (hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
                count--;
            } else {
                hashMap.put(arr[i], 1);
                count++;
            }
        }
        int index = 0;
        output[index++] = count;
        for (int i = 1; i <= len - k; i++) {
            if (hashMap.get(arr[i - 1]) <= 1) {
                hashMap.remove(arr[i - 1]);
                count--;
            } else {
                hashMap.put(arr[i - 1], hashMap.get(arr[i - 1]) - 1);
                count++;
            }
            if (hashMap.containsKey(arr[i + k - 1])) {
                hashMap.put(arr[i + k - 1], hashMap.get(arr[i + k - 1]) + 1);
                count--;
            } else {
                hashMap.put(arr[i + k - 1], 1);
                count++;
            }
            output[index++] = count;
        }
        return output;
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 1, 3, 4, 2, 3}, k = 4;
        int result[] = countDistinct(arr, k);
        System.out.println(Arrays.toString(result));
    }
}
