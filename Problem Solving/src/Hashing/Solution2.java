package Hashing;

import java.util.*;

/**
 * @author Vamsi Krishna Govada on 8/15/2020.
 * @project Raudra
 */

// Check whether given two sets are disjoint or not approach

public class Solution2 {
    private static boolean aredisjoint(int[] set1, int[] set2) {
        int len1 = set1.length;
        int len2 = set2.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < len1; i++)
            hashMap.put(set1[i], i);

        for (int i = 0; i < len2; i++) {
            if (hashMap.containsKey(set2[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int set1[] = {12, 34, 11, 9, 3};
        int set2[] = {7, 2, 1, 5};
        boolean result = aredisjoint(set1, set2);
        if (result)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
