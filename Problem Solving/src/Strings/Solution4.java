package Strings;


import java.util.StringTokenizer;

/**
 * @author Vamsi Krishna Govada on 8/14/2020.
 * @project Raudra
 */

// Reverse the words in a given sentence

public class Solution4 {

    private static String reverse(String str) {
        String output ="";
        StringTokenizer st = new StringTokenizer(str);
        while(st.hasMoreTokens()){
            output = st.nextToken() + " " + output;
        }
        return output.substring(0,output.length()-1);
    }
    public static void main(String[] args)
    {
        String str = "i like this program very much";
        System.out.println(reverse(str));
    }
}
