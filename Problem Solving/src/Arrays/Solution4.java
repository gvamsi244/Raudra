package Arrays;

import java.util.*;

/**
 * @author Vamsi Krishna Govada on 8/14/2020.
 * @project Raudra
 */

// Finding majority element approach-1 using linear search - Moore voting algorithm

public class Solution4 {
    private static int findMajority(int[] arr) {
        int len = arr.length;
        int max_val = arr[0], max_freq = 1;
        for (int i = 1; i < len; i++) {
            if (arr[i] == max_val)
                max_freq++;
            else {
                if (max_freq == 1)
                    max_val = arr[i];
                else
                    max_freq--;
            }
        }
        return max_val;

    }

    public static void main(String[] args) {

        int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int ret = findMajority(arr);
        System.out.println("Majority Element = " + ret);
    }
}
