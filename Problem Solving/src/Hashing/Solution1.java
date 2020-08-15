package Hashing;

import java.util.HashMap;

/**
 * @author Vamsi Krishna Govada on 8/15/2020.
 * @project Raudra
 */

// Check whether given array contains duplicates in k-distance or not

public class Solution1 {

    private static boolean checkDuplicatesWithinK(int[] arr, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (hashMap.containsKey(arr[i])) {
                if (i - hashMap.get(arr[i]) <= k)
                    return true;
            } else
                hashMap.put(arr[i], i);

        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 3, 4, 3, 5, 6};
        if (checkDuplicatesWithinK(arr, 3))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
