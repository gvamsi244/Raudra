package DivideAndConquer;

/**
 * @author Vamsi Krishna Govada on 8/14/2020.
 * @project Raudra
 */

// Write a custom c-function to implement pow() function

public class Solution4 {

    private static int power(int x, int y) {
        if(y==1)
            return x;
        if(y%2==0)
            return power(x,y/2)*power(x,y/2);
        else
            return x*power(x,y/2)*power(x,y/2);
    }

    public static void main(String[] args) {
        int x = 2;
        int y = 3;

        System.out.println(power(x, y));
    }
}
