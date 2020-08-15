package Strings;

/**
 * @author Vamsi Krishna Govada on 8/15/2020.
 * @project Raudra
 */

// Check whether given string is palindrome or not

public class Solution6 {
    private static boolean isPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i <= len / 2; i++) {
            char a = str.charAt(i);
            char b = str.charAt(len - 1 - i);
            if (a != b)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        if (isPalindrome(str)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
