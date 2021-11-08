package arrays.arrays;

import java.util.Arrays;

public class create_target_array_in_the_given_order {
    public static void main(String[] args) {
        int[] nums ={0,1,2,3,4};
        int[] index ={0,1,2,2,1};
        int[] target = createTargetArray(nums, index);
        System.out.println(Arrays.toString(target));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[]  target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            // if there is some value already at index[i] and we have to shift //error
            if (target[index[i]]!=0) {
                for (int j = nums.length-1; j>=index[i];j--){
                    target[j] = target[j-1];
                }
            }
            target[index[i]]=nums[i];
            System.out.println(Arrays.toString(target));
        }
        return target;
    }
}
