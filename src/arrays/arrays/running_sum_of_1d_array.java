package arrays.arrays;

import java.util.Arrays;

public class running_sum_of_1d_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(arr));
        int[] nums = runningSum(arr);
        System.out.println(Arrays.toString(nums));
    }
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
}
