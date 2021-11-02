package arrays;

import java.util.Arrays;

public class build_array_from_permutation {

    public static void main(String[] args) {
        int[] nums = {5, 0, 1, 2, 3, 4};
        int[] new_array = buildArray(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(new_array));
    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];

        }
        return ans;
    }
}
