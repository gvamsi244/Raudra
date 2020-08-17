package DynamicProgramming;

import java.util.Arrays;

/**
 * @author Vamsi Krishna Govada on 8/14/2020.
 * @project Raudra
 */

// Maximum sum increasing sub sequence

public class Solution2 {
    private static int maxSumIS(int[] arr) {
        int flag=0;
        int len = arr.length;
        int max =0,max_final=0;
        int lis[] = new int[len];

        for(int i=0;i<len;i++)
            lis[i]=arr[i];

        for(int i=0;i<len;i++){
            max=0;max_final=0;flag=0;
            for(int j=i-1;j>=0;j--){
                if(arr[j]<arr[i]){
                    flag=1;
                    max=lis[j]+arr[i];
                    if(max>max_final)
                        max_final=max;
                }
                if(flag==1){
                    lis[i]=max_final;
                }
            }
        }
        int output=lis[0];
        for(int i=0;i<len;i++){
            if(lis[i]>output)
                output=lis[i];
        }
        return output;
    }

    public static void main(String args[]) {
        int arr[] = new int[]{1, 101, 2, 3, 100, 4, 5};
        System.out.println("Sum of maximum sum increasing subsequence is " + maxSumIS(arr));
    }
}