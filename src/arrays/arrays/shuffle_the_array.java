package arrays.arrays;

import java.util.Arrays;

public class shuffle_the_array {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] arr = shuffle(nums, n);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int count = 0;
        for (int i=0; i<2*n;i=i+2) {
            arr[i]= nums[i-count];
            arr[i+1] = nums[n+i-count];
            count++;
        }
        return arr;
    }
}
