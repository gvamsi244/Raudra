package Arrays;

import java.util.Arrays;

/**
 * @author Vamsi Krishna Govada on 8/13/2020.
 * @project Raudra
 */

// Implementation of Linear search

public class Solution2 {
    private static int binary(int[] arr,int k) {
        int start = 0, last = arr.length-1;
        while(start<=last){
            int mid = start + (last-start)/2;
            if(arr[mid] == k)
                return mid;
            else if(arr[mid]<k)
                start = mid+1;
            else
                last = mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int k = 2;
        int result = binary(arr,k);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
