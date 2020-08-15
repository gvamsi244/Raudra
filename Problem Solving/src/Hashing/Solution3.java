package Hashing;

import java.util.*;

/**
 * @author Vamsi Krishna Govada on 8/15/2020.
 * @project Raudra
 */

// Group all the occurrences of elements order by their first occurrence

public class Solution3 {
    private static int [] orderedGroup(int[] arr) {
        LinkedHashMap<Integer,Integer> hashMap = new LinkedHashMap<>();
        int len = arr.length;
        for(int i=0;i<len;i++){
            if(hashMap.containsKey(arr[i]))
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            else
                hashMap.put(arr[i],1);
        }

        int index=0;
        for(Map.Entry temp : hashMap.entrySet()){
            int key = (int)temp.getKey();
            int val = (int)temp.getValue();
            for(int i=0;i<val;i++)
                arr[index++]=key;
        }
        return arr;
    }

    public static void main (String[] args) {
        int arr[] = {10, 5, 3, 10, 10, 4, 1, 3};
        int result [] = orderedGroup(arr);
        System.out.println(Arrays.toString(result));
    }
}