package DivideAndConquer;

/**
 * @author Vamsi Krishna Govada on 8/14/2020.
 * @project Raudra
 */

// Finding a majority element using Linear search
public class Solution1 {
    private static int isMajority(int[] arr) {
        int len = arr.length;
        int freq = (len / 2) + 1;
        int count = 1;
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else
                count = 1;
            if (count == freq)
                return arr[i];
        }
        return arr[len - 1];
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 4, 4, 4};
        int result = isMajority(arr);
        System.out.println("Majority element is " + result);
    }
}
