package Strings;

import java.util.*;

/**
 * @author Vamsi Krishna Govada on 8/14/2020.
 * @project Raudra
 */

// Find a maximum occurring character in a given string

public class Solution1 {
    public static char frequency(String str) {
        char output = ' ';
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (hashMap.containsKey(c))
                hashMap.put(c, hashMap.get(c) + 1);
            else
                hashMap.put(c, 1);
        }
        int max = 0;
        for (Map.Entry temp : hashMap.entrySet()) {
            char key = (char) temp.getKey();
            int val = (int) temp.getValue();
            if (val > max) {
                max = val;
                output = key;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        char result = frequency("sample string");
        System.out.println("Max occurring character is " + result);
    }
}