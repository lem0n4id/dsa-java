package arrays.arrays;

import java.util.Arrays;

public class how_many_numbers_are_smaller_than_the_current_number {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] ans = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int c;
        for (int i = 0; i < nums.length; i++) {
            c=0;
            for (int j = 0; j < nums.length; j++) {
                if (i!=j) {
                    if (nums[i]>nums[j]) {
                        c++;
                    }
                }
            }
            ans[i] = c;
        }
        return ans;
    }
}
