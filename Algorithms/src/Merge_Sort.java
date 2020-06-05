/**
 * @author Vamsi Krishna Govada on 6/4/2020.
 * @project Raudra
 */

// Merge Sort


import java.util.Arrays;

public class Merge_Sort {

    public static int[] merge(int arr[], int start, int mid, int last) {
        int len_L = (mid - start + 1);
        int len_R = last - mid;

        int[] L = new int[len_L];
        int[] R = new int[len_R];

        int index_L = 0, index_R = 0, index_arr = start;

        for (int i = start; i <= mid; i++)
            L[index_L++] = arr[i];
        for (int i = mid + 1; i <= last; i++)
            R[index_R++] = arr[i];
        index_L = 0;
        index_R = 0;
        while ((index_L < len_L) || (index_R < len_R)) {
            if (index_R == len_R)
                arr[index_arr++] = L[index_L++];

            else if (index_L == len_L)
                arr[index_arr++] = R[index_R++];
            else {
                if (L[index_L] < R[index_R]) //f1
                    arr[index_arr++] = L[index_L++];
                else if (L[index_L] > R[index_R])
                    arr[index_arr++] = R[index_R++];
                else {
                    arr[index_arr++] = L[index_L++];
                    arr[index_arr++] = R[index_R++];
                }
            }
        }
        return arr;
    }

    public static int[] merge_sort(int arr[], int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            merge_sort(arr, p, q);
            merge_sort(arr, q + 1, r);
            arr = merge(arr, p, q, r);
        }
        return arr;
    }

    public static int[] sortArray(int arr[]) {
        return merge_sort(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int output[] = sortArray(new int[]{8, 5, 0, 3, 9, 4, 2, 3, 11});
        System.out.println(Arrays.toString(output));
    }
}
