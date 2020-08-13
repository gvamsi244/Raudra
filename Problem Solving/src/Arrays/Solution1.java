package Arrays;

/**
 * @author Vamsi Krishna Govada on 8/13/2020.
 * @project Raudra
 */

// Implementation of Linear search

public class Solution1 {
    private static int linear(int[] arr, int k) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int k = 4;
        int result = linear(arr,k);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
