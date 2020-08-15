package Hashing;

import java.util.*;

/**
 * @author Vamsi Krishna Govada on 8/15/2020.
 * @project Raudra
 */

// Given an array and a range[low, high], Find the elements that are in the range but not in the array

public class Solution5 {
    private static ArrayList<Integer> printMissing(int[] arr, int low, int high) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        ArrayList<Integer> output = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            hashMap.put(arr[i],i);
        }
        for(int i=low;i<=high;i++){
            if(!hashMap.containsKey(i))
                output.add(i);
        }
        return output;
    }

    public static void main(String[] args){
        int arr[] = { 1, 3, 5, 8 ,9,11};
        int low = 5, high = 10;
        System.out.println(printMissing(arr, low, high));
    }
}