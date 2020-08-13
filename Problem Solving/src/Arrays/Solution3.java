package Arrays;

import java.util.HashMap;

/**
 * @author Vamsi Krishna Govada on 8/13/2020.
 * @project Raudra
 */

// Find a pair in an array whose sum is equal to given number

public class Solution3 {
    private static void hasArrayTwoCandidates(int[] arr, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int a =0,b=0;
        for(int i=0;i<arr.length;i++){
            if(hashMap.containsKey(k-arr[i])){
                a=arr[i];
                break;
            }
            else
                hashMap.put(arr[i],i);
        }

        for(int i=0;i<arr.length;i++){
            if(a+arr[i]==k){
                b=arr[i];
                break;
            }
        }
        System.out.println(a+","+b);
    }
    public static void main(String args[])
    {
        int arr[] = { 1, 4, 45, 6, 10, -8 };
        int k = 16;
        hasArrayTwoCandidates(arr, k);
    }
}
