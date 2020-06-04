import java.util.Arrays;

/**
 * @author Vamsi Krishna Govada on 6/4/2020.
 * @project Raudra
 */
public class Bubble_Sort {
    public static int[] sortArray(int[] nums) {
        int len = nums.length, swapped = 0;
        for (int i = 0; i < len; i++) {
            swapped = 0;
            for (int j = 0; j < len - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = 1;
                }
            }
            if (swapped == 0)
                break;
        }
        return nums;
    }

    public static void main(String[] args) {
        int output [] = sortArray(new int[]{5,1,1,2,0,0});
        System.out.println(Arrays.toString(output));
    }
}
