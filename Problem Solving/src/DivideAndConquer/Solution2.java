package DivideAndConquer;

/**
 * @author Vamsi Krishna Govada on 8/14/2020.
 * @project Raudra
 */

// Finding a majority element using Binary search

public class Solution2 {
    private static int isMajority(int[] arr) {
        int len = arr.length;
        int freq = (len / 2) + 1;
        int count = 1;

        int l = helper1(arr,0,len/2-1,arr[len/2]);
//        System.out.println("L= " + l);
        int r = helper2(arr,len/2+1,len-1,arr[len/2]);
//        System.out.println("R= " + r);
        if((r-l+1)>=freq)
            return arr[len/2];
        else
            return -1;
    }

    public static int helper1(int [] arr, int l, int r,int val){
        while(l<=r){
            int mid= l + (r-l)/2;
            if(arr[mid]==val){
                r=mid-1;
            }
            else
                l=mid+1;
        }
        return l;
    }

    public static int helper2(int [] arr, int l, int r,int val){
        while(l<=r){
            int mid= l + (r-l)/2;
            if(arr[mid]==val){
                l=mid+1;
            }
            else
                r=mid-1;
        }
        return r;
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 4, 4, 4, 4, 5};
        int result = isMajority(arr);
        if (result == -1)
            System.out.println("Majority element is not Present");
        else
            System.out.println("Majority element is " + result);
    }
}