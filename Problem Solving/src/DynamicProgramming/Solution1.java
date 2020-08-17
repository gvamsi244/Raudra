package DynamicProgramming;

/**
 * @author Vamsi Krishna Govada on 8/14/2020.
 * @project Raudra
 */

// Find the maximum sum sub array

public class Solution1 {
    private static int maxSubArraySum(int[] arr) {
        int len = arr.length;
        int max = 0;
        int max_final = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            if ((max + arr[i]) < arr[i])
                max = arr[i];
            else
                max = max + arr[i];
            if (max > max_final)
                max_final = max;
        }
        return max_final;
    }

    public static void main(String[] args) {
        int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
    }
}
