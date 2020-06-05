/**
 * @author Vamsi Krishna Govada on 6/4/2020.
 * @project Raudra
 */

import java.util.Arrays;

public class Insertion_Sort {

    public static int[] sortArray ( int arr[]){

        int len = arr.length,j=0;
        for(int i=0;i<len;i++){
            j=i;
            while(j>0){
                if(arr[j]<arr[j-1]){
                    //swap them
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else
                    break;
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int output [] = sortArray(new int[]{5,1,1,2,0,0});
        System.out.println(Arrays.toString(output));
    }
}
