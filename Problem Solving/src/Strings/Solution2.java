package Strings;

import java.util.*;

/**
 * @author Vamsi Krishna Govada on 8/14/2020.
 * @project Raudra
 */
//Remove duplicates from a given string

public class Solution2 {

    public static void main(String[] args)
    {
        String str = "geeksforgeeks";
        System.out.println(removeDuplicate(str));
    }

    private static String removeDuplicate(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            hashMap.put(c,1);
        }
        String output ="";
        for(Map.Entry temp : hashMap.entrySet()){
            output = output + (char)temp.getKey();
        }
        return output;
    }
}
