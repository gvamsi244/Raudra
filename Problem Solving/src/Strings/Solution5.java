package Strings;

/**
 * @author Vamsi Krishna Govada on 8/15/2020.
 * @project Raudra
 */

// Reverse a string

public class Solution5 {
    private static String reverse(String str) {
        char arr[] = str.toCharArray();
        int len = str.length();
        for (int i = 0; i <= len / 2; i++) {
            char temp = arr[len - 1 - i];
            arr[len - 1 - i] = arr[i];
            arr[i] = temp;
        }
        return new String(arr);
    }

    public static void main(String args[]) {
        String str = "Krish";
        System.out.println("Reversed array is " + reverse(str));

    }
}