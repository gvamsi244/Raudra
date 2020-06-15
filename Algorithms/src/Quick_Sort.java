/**
 * @author Vamsi Krishna Govada on 6/5/2020.
 * @project Raudra
 */


import java.util.Arrays;


public class Quick_Sort {

    public static int[] partition(int arr[], int start, int last){

        if(start>=last)
            return arr;

        else {
            int i = start - 1, j = start;
            while (j <= last) {
                if (arr[j] <= arr[last]) {
                    i++;
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
                j++;
            }

            arr = partition(arr, start, i - 1);
            arr = partition(arr, i + 1, last);
            return arr;
        }
    }

    public static int[] sortArray(int arr[]) {
        return partition(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int output[] = sortArray(new int[]{8, 5, 0, 3, 11,  9, 4, 3, 1, 11});
        System.out.println(Arrays.toString(output));
    }
}
