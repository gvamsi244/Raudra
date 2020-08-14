package Strings;

import java.util.*;

/**
 * @author Vamsi Krishna Govada on 8/14/2020.
 * @project Raudra
 */

// Check whether given two strings are rotations of each other or not
public class Solution3 {
    public static void main (String[] args)
    {
        String str1 = "AACD";
        String str2 = "ACDA";
        if (areRotations(str1, str2))
            System.out.println("Strings are rotations of each other");
        else
            System.out.printf("Strings are not rotations of each other");
    }

    private static boolean areRotations(String str1, String str2) {
        if(str1.length()!=str2.length())
            return false;
        str1 = str1+str1;
        if(str1.indexOf(str2)>=0)
            return true;
        else return false;
    }
}